package main;

import main.gen.SmalltalkBaseVisitor;
import main.gen.SmalltalkParser;
import main.inline.NestedExpression;
import main.inline.Primary;
import main.inline.VariablePrimary;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by michaelpollind on 11/28/16.
 */
public class SmalltalkVistor extends SmalltalkBaseVisitor<IPythonNode> {


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
            if(entry instanceof  BlockExpression)
                expressionSeries.addExpressionEntry((BlockExpression) entry);
        }
        return  expressionSeries;
    }

    @Override
    public IPythonNode visitExpression(SmalltalkParser.ExpressionContext ctx) {
//        String row = "";
//        if(ctx.ASSIGNMENT() != null)
//        {
//            main.ResultRow assignment = (main.ResultRow) visit(ctx.variable_name());
//            row = assignment.getResult() + "=";
//        }
//        SmalltalkParser.PrimaryContext primaryContext =  ctx.primary();
//        //if(primaryContext  != null)
//           // row += ((main.ResultRow)visit(ctx.primary())).getResult();
//       return new main.ResultRow(row,true);
        return  null;

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
        ResultRow row = (ResultRow)visit(ctx.primary());
        List<SmalltalkParser.Binary_messageContext> binaryMessages = ctx.binary_message();
        for(int x = 0; x < binaryMessages.size(); x++)
        {
            ResultRow binary_row = (ResultRow)visit(binaryMessages.get(x));

        }

        return super.visitBinary_expression(ctx);
    }

    @Override
    public IPythonNode visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public IPythonNode visitVariable_name(SmalltalkParser.Variable_nameContext ctx) {
        //return new main.ResultRow(ctx.IDENTIFIER().getText(),true);
        return  null;
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
        else if(ctx.block() != null)
        {
        }

        return super.visitUnit(ctx);
    }

    @Override
    public IPythonNode visitKeyword_expression(SmalltalkParser.Keyword_expressionContext ctx) {

        return super.visitKeyword_expression(ctx);
    }
}
