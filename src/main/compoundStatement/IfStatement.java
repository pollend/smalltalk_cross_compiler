package main.compoundStatement;

import main.ExpressionSeries;
import main.SmalltalkVistor;
import main.gen.SmalltalkParser;
import main.inline.InvertedExpression;
import main.inline.NestedExpression;
import main.inline.Primary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class IfStatement extends CompoundStatment {
   private  class  IfStatmentEntry{
       public NestedExpression testExpression;
       public ExpressionSeries expressions;
   }

    private List<IfStatmentEntry> statmentEntries = new ArrayList<>();
    private ExpressionSeries closingExpression = null;
    public IfStatement()
    {

    }

    public  void  addIfStatment(NestedExpression testExpression, ExpressionSeries expressions)
    {
        IfStatmentEntry entry = new IfStatmentEntry();
        entry.expressions = expressions;
        entry.testExpression = testExpression;
        statmentEntries.add(entry);
    }

    public  void  addElseClosing(ExpressionSeries expression)
    {
        this.closingExpression = expression;
    }

    public static IfStatement Handle(SmalltalkParser.Keyword_expressionContext ctx, SmalltalkVistor vistor, CompoundStatmentType statmentType)
    {
        SmalltalkParser.Keyword_messageContext keywordMessage = ctx.keyword_message();
        IfStatement statment = new IfStatement();
        if(statmentType == CompoundStatmentType.IF_STATEMENT)
        {

            statment.addIfStatment(new NestedExpression((Primary) vistor.visit(ctx.primary())), (ExpressionSeries) vistor.visit(ctx.keyword_message().primary().get(0)));
        }
        else if(statmentType == CompoundStatmentType.IF_STATEMENT_INVERT)
        {
            statment.addIfStatment(new NestedExpression(new InvertedExpression((Primary) vistor.visit(ctx.primary()))), (ExpressionSeries) vistor.visit(ctx.keyword_message().primary().get(0)));
        }
        else if(statmentType == CompoundStatmentType.IF_STATEMENT_ELSE_INVERT)
        {
            statment.addIfStatment(new NestedExpression(new InvertedExpression((Primary) vistor.visit(ctx.primary()))), (ExpressionSeries) vistor.visit(ctx.keyword_message().primary().get(0)));
            statment.addElseClosing((ExpressionSeries) vistor.visit(ctx.keyword_message().primary().get(1)));
        }
        else if(statmentType == CompoundStatmentType.IF_STATEMENT_ELSE)
        {
            statment.addIfStatment(new NestedExpression((Primary) vistor.visit(ctx.primary())), (ExpressionSeries) vistor.visit(ctx.keyword_message().primary().get(0)));
            statment.addElseClosing((ExpressionSeries) vistor.visit(ctx.keyword_message().primary().get(1)));
        }
        return statment;

    }

    @Override
    public String getEntry(int indent) {
        String result = "";
        for(int x = 0; x < statmentEntries.size(); x++)
        {
            if(x == 0) {
                result  += this.leftPad(indent, "if " + statmentEntries.get(x).testExpression.getResult() + ": \n");
            }
            else {
                result += this.leftPad(indent, "elif " + statmentEntries.get(x).testExpression.getResult() + ": \n");
            }
            result += statmentEntries.get(x).expressions.GetResult(indent+1);
        }
        if(closingExpression != null)
        {
            result += this.leftPad(indent,"else: \n");
            result += closingExpression.GetResult(indent+1);
        }
        return result;
    }



}
