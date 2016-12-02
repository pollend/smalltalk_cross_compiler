package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class InvertedExpression extends  NestedExpression {
    public InvertedExpression(Primary primary) {
        super(primary);
    }

    @Override
    public String getResult() {
        return "(!("  + super.getResult() + "))";
    }
}
