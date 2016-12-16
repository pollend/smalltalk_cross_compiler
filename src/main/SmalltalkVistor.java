package main;

import com.sun.prism.image.CompoundTexture;
import main.compoundStatement.CompoundStatment;
import main.function.FunctionResolver;
import main.function.IFunction;
import main.function.InlineFunctionExpression;
import main.function.InlineUnaryFunctionExpression;
import main.gen.SmalltalkBaseVisitor;
import main.gen.SmalltalkParser;
import main.inline.*;
import main.inline.Number;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.HashMap;
import java.util.List;

/**
 * Created by michaelpollind on 11/28/16.
 */
public class SmalltalkVistor extends SmalltalkBaseVisitor<IPythonNode> {

    private FunctionResolver functionResolver;

    public  SmalltalkVistor()
    {
        functionResolver = new FunctionResolver();
    }

    @Override
    public IPythonNode visitComment(SmalltalkParser.CommentContext ctx) {
        String value = ctx.COMMENT().getText();
       // return  new main.ResultRow("#"+ value.substring(1,value.length()-1) ,true);
        return  null;
    }

    @Override
    public IPythonNode visitTemporaries(SmalltalkParser.TemporariesContext ctx) {

        ExpressionSeries expressionSeries = new ExpressionSeries();

        List<SmalltalkParser.Variable_nameContext> variableNames =  ctx.variable_name();
        for(int x = 0; x < variableNames.size(); x++)
        {
            IPythonNode entry =  visit(variableNames.get(x));
            if(entry instanceof  InlineExpression)
                expressionSeries.addExpressionEntry(new AssignmentExpression(((InlineExpression) entry).getResult(),new Number("0")));
        }
        return  expressionSeries;
    }

    @Override
    public IPythonNode visitExpression(SmalltalkParser.ExpressionContext ctx) {
        SmalltalkParser.Variable_nameContext variableName = ctx.variable_name();
        if(variableName != null)
        {
             if(ctx.message_expression() != null) {
                 return new AssignmentExpression(ctx.variable_name().IDENTIFIER().getText(), (InlineExpression) visit(ctx.message_expression()));
             }
             else if(ctx.primary() != null)
             {
                return  new AssignmentExpression(ctx.variable_name().IDENTIFIER().getText(),(InlineExpression)visit(ctx.primary()));
             }
        }
        else if(ctx.primary() != null)
        {
            return  visit(ctx.primary());
        }



        return visit(ctx.message_expression());
    }



    @Override
    public IPythonNode visitScript(SmalltalkParser.ScriptContext ctx) {
        Script script = new Script();

        for(int x = 0; x < ctx.getChildCount();x++)
        {
            script.AddEntry(visit(ctx.getChild(x)));
        }
        return  script;
    }

    @Override
    public IPythonNode visitBinary_expression(SmalltalkParser.Binary_expressionContext ctx) {

        BinaryExpression binaryExpression = new BinaryExpression( (Primary)visit(ctx.primary()));
        List<SmalltalkParser.Binary_messageContext> binaryMessages = ctx.binary_message();
        for(int x = 0; x < binaryMessages.size(); x++)
        {
            binaryExpression.addBinaryMessage((BinaryMessage) visit(binaryMessages.get(x)));
        }

        return binaryExpression;
    }

    @Override
    public IPythonNode visitBinary_message(SmalltalkParser.Binary_messageContext ctx) {
        BinaryMessage.BinaryOperator operator = BinaryMessage.getOperator(ctx.binary_selector().getText());

        return new BinaryMessage(operator, (Primary) visit(ctx.primary()));
    }

    @Override
    public IPythonNode visitExpression_series(SmalltalkParser.Expression_seriesContext ctx) {
        ExpressionSeries expressionSeries = new ExpressionSeries();

        List<SmalltalkParser.ExpressionContext> expressions = ctx.expression();
        for(int x = 0; x < expressions.size(); x++)
        {
            IPythonNode node =  visit(expressions.get(x));

            if(node instanceof InlineExpression) {
                expressionSeries.addExpressionEntry((BlockExpression) new InlineBlockExpressionWrapper((InlineExpression) visit(expressions.get(x))));
            }
            else
            {
                expressionSeries.addExpressionEntry((BlockExpression) visit(expressions.get(x)));
            }
        }

        return expressionSeries;
    }

    @Override
    public IPythonNode visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public IPythonNode visitVariable_name(SmalltalkParser.Variable_nameContext ctx) {
        return new VariablePrimary(ctx.IDENTIFIER().getText());
    }

    @Override
    public IPythonNode visitUnit(SmalltalkParser.UnitContext ctx)  {
        if(ctx.expression() != null)
        {
            return  new NestedExpression((Primary) this.visit(ctx.expression()));
        }
        else if(ctx.variable_name() != null)
        {
            return new VariablePrimary(ctx.variable_name().IDENTIFIER().getText());
        }
        else if(ctx.literal() != null)
        {
            SmalltalkParser.LiteralContext literal = ctx.literal();
            if(literal.number()  != null) {
                return new Number(literal.number().getText());
            }
            else if(literal.string() != null)
            {
                return  new StringPrimary(literal.string().getText());
            }
            else if(literal.character_constant() != null)
            {
                return  new CharacterConstant(literal.character_constant().getText());
            }

        }
        else if(ctx.block() != null)
        {
            return  visit(ctx.block().expression_series());
        }

        return super.visitUnit(ctx);
    }

    @Override
    public IPythonNode visitArray_constant(SmalltalkParser.Array_constantContext ctx) {
        return visit(ctx.array());
    }

    @Override
    public IPythonNode visitArray(SmalltalkParser.ArrayContext ctx) {
        Array array = new Array();
        for(int x = 0; x < ctx.getChildCount(); x++)
        {
            if(!(ctx.getChild(x) instanceof TerminalNodeImpl))
            array.addArrayEntry((Primary) this.visit(ctx.getChild(x)));
        }
        return  array;

    }

    @Override
    public IPythonNode visitString(SmalltalkParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public IPythonNode visitNumber(SmalltalkParser.NumberContext ctx) {
        return new Number(ctx.getText());
    }

    @Override
    public IPythonNode visitCharacter_constant(SmalltalkParser.Character_constantContext ctx) {
        return new CharacterConstant(ctx.getText());
    }


    @Override
    public IPythonNode visitKeyword_expression(SmalltalkParser.Keyword_expressionContext ctx) {
        CompoundStatment.CompoundStatmentType compoundStatmentType = CompoundStatment.keywordMatch(ctx.keyword_message(), this);
        if(compoundStatmentType != CompoundStatment.CompoundStatmentType.NONE)
        {
            return CompoundStatment.Parse(ctx,this,compoundStatmentType);
        }
        else
        {


                HashMap<String, InlineExpression> messages = FunctionResolver.getMessages(ctx.keyword_message(), this);

                return new InlineFunctionExpression(ctx.primary().unit().variable_name().IDENTIFIER().getText(),functionResolver,messages);
        }

    }

    @Override
    public IPythonNode visitUnary_expression(SmalltalkParser.Unary_expressionContext ctx) {
        IFunction function = functionResolver.ResolveFunction(ctx.unit().getText());

        return new InlineUnaryFunctionExpression(ctx.unit().getText(),functionResolver,ctx.unary_message().get(0).getText());
    }
}
