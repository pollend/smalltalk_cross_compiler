package main;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class InlineBlockExpressionWrapper extends BlockExpression {
    private  InlineExpression inlineExpression;
    public  InlineBlockExpressionWrapper(InlineExpression inlineExpression)
    {
        this.inlineExpression = inlineExpression;
    }

    public  InlineExpression getInlineExpression()
    {
        return  inlineExpression;
    }

    @Override
    public String getEntry(int indent) {
        return this.leftPad(indent,inlineExpression.getResult() + "\n");
    }
}
