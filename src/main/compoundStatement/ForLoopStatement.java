package main.compoundStatement;

import main.ExpressionSeries;
import main.SmalltalkVistor;
import main.gen.SmalltalkParser;
import main.inline.Primary;

import java.util.List;

/**
 * Created by michaelpollind on 12/8/16.
 */
public class ForLoopStatement extends CompoundStatment {

    Primary start;
    Primary end;
    String variableName;
    ExpressionSeries series;
    public ForLoopStatement(Primary start, Primary end, String variableName, ExpressionSeries series)
    {
        this.variableName = variableName;
        this.end = end;
        this.start = start;
        this.series = series;
    }

    public static ForLoopStatement Handle(SmalltalkParser.Keyword_expressionContext ctx, SmalltalkVistor vistor, CompoundStatmentType statmentType) {
        SmalltalkParser.Keyword_messageContext keywordExpression =  ctx.keyword_message();
        List<SmalltalkParser.PrimaryContext> primaries = keywordExpression.primary();

        Primary start = (Primary)vistor.visit(ctx.primary());
        Primary end = (Primary) vistor.visit(primaries.get(0));
        SmalltalkParser.BlockContext blockContext = primaries.get(1).unit().block();
        String variable = blockContext.variable_name().get(0).IDENTIFIER().getText();


        return new ForLoopStatement(start,end,variable,(ExpressionSeries) vistor.visit(blockContext.expression_series()));
    }

    @Override
    public String getEntry(int indent) {
        String entry = "";
        entry += "for " + variableName + " in range("+ start.getResult() + "," + end.getResult() + "):\n";
        entry += series.GetResult(indent + 1);
        return entry;
    }
}
