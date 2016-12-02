package main;

import main.gen.SmalltalkParser;
import main.inline.NestedExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class IfStatment extends CompoundStatment {
   private  class  IfStatmentEntry{
       public NestedExpression testExpression;
       public  ExpressionSeries expressions;
   }

    private List<IfStatmentEntry> statmentEntries = new ArrayList<>();
    private ExpressionSeries closingExpression = null;
    public  IfStatment()
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

    public static IfStatment Handle(SmalltalkParser.Keyword_expressionContext ctx, SmalltalkVistor vistor, CompoundStatmentType statmentType)
    {
        SmalltalkParser.Keyword_messageContext keyword_messageContext = ctx.keyword_message();
        IfStatment statment = new IfStatment();
        if(statmentType == CompoundStatmentType.IF_STATEMENT)
        {
            statment.addIfStatment(new NestedExpression(ctx.keyword_message().primary().get(0)));

            //statment.addElseClosing();
        }
        else if(statmentType == CompoundStatmentType.IF_STATEMENT_INVERT)
        {

        }
        else if(statmentType == CompoundStatmentType.IF_STATEMENT_ELSE_INVERT)
        {

        }
        return statment;

    }

    public  String getResult(int indent)
    {
        String result = "";
        for(int x = 0; x < statmentEntries.size(); x++)
        {
            if(x == 0) {
                result  += this.leftPad(indent, "if (" + statmentEntries.get(x).testExpression.getResult() + "): \n");
            }
            else {
                result += this.leftPad(indent, "elif (" + statmentEntries.get(x).testExpression.getResult() + "): \n");
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
