import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by michaelpollind on 11/28/16.
 */
public class SmalltalkVistor extends SmalltalkBaseVisitor<IBaseValue>{

    @Override
    public ResultRow visitComment(SmalltalkParser.CommentContext ctx) {
        String value = ctx.COMMENT().getText();
        return  new ResultRow("#"+ value.substring(1,value.length()-1) ,true);
    }

    @Override
    public IBaseValue visitTemporaries(SmalltalkParser.TemporariesContext ctx) {
        ResultBlock resultBlock = new ResultBlock(false);
        List<SmalltalkParser.Variable_nameContext> variableNames =  ctx.variable_name();
        for(int x = 0; x < variableNames.size(); x++)
        {
            resultBlock.append(((ResultRow)visit(variableNames.get(x))));
        }
        return  resultBlock;
    }

    @Override
    public IBaseValue visitExpression(SmalltalkParser.ExpressionContext ctx) {
        String row = "";
        if(ctx.ASSIGNMENT() != null)
        {
            ResultRow assignment = (ResultRow) visit(ctx.variable_name());
            row = assignment.getResult() + "=";
        }
        SmalltalkParser.PrimaryContext primaryContext =  ctx.primary();
        //if(primaryContext  != null)
           // row += ((ResultRow)visit(ctx.primary())).getResult();
       return new ResultRow(row,true);

    }

    @Override
    public IBaseValue visitScript(SmalltalkParser.ScriptContext ctx) {
        ResultBlock resultBlock = new ResultBlock(false);
        for(int x = 0; x < ctx.getChildCount();x++)
        {
            IBaseValue value = visit(ctx.getChild(x));
            if(value != null)
            {
                resultBlock.append(value);
            }
        }

        return resultBlock;
    }

    @Override
    public IBaseValue visitBinary_expression(SmalltalkParser.Binary_expressionContext ctx) {
        ResultRow row = (ResultRow)visit(ctx.primary());
        List<SmalltalkParser.Binary_messageContext> binaryMessages = ctx.binary_message();
        for(int x = 0; x < binaryMessages.size(); x++)
        {
            ResultRow binary_row = (ResultRow)visit(binaryMessages.get(x));

        }

        return super.visitBinary_expression(ctx);
    }

    @Override
    public IBaseValue visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public IBaseValue visitVariable_name(SmalltalkParser.Variable_nameContext ctx) {
        return new ResultRow(ctx.IDENTIFIER().getText(),true);
    }

    @Override
    public IBaseValue visitKeyword_expression(SmalltalkParser.Keyword_expressionContext ctx) {

        return super.visitKeyword_expression(ctx);
    }
}
