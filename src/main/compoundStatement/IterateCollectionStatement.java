package main.compoundStatement;

import main.ExpressionSeries;
import main.SmalltalkVistor;
import main.gen.SmalltalkParser;
import main.inline.Primary;

/**
 * Created by michaelpollind on 12/8/16.
 */
public class IterateCollectionStatement extends  CompoundStatment{
    private Primary iterator;
    private String variable;
    private ExpressionSeries expressions;

    public  IterateCollectionStatement(ExpressionSeries expressions, Primary iterator, String variable)
    {
        this.expressions = expressions;
        this.iterator = iterator;
        this.variable = variable;
    }
    public static IterateCollectionStatement Handle(SmalltalkParser.Keyword_expressionContext ctx, SmalltalkVistor vistor, CompoundStatment.CompoundStatmentType statmentType)
    {
        Primary iterator = (Primary) vistor.visit(ctx.primary());
        SmalltalkParser.Keyword_messageContext keywordMessage = ctx.keyword_message();
        SmalltalkParser.BlockContext block = keywordMessage.primary().get(0).unit().block();

        String variableName = block.variable_name().get(0).IDENTIFIER().getText();
        ExpressionSeries expressionSeries = (ExpressionSeries) vistor.visit(block.expression_series());
        return  new IterateCollectionStatement(expressionSeries,iterator,variableName);
    }

    @Override
    public String getEntry(int indent) {
        String entry = "";
        entry += "for " + this.variable + " in " + iterator.getResult() + ":\n";
        entry += expressions.GetResult(indent +1);
        return entry;
    }
}
