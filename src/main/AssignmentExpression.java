package main;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class AssignmentExpression extends  BlockExpression {
    private  String assignment;
    private  InlineExpression inlineExpression;

    public AssignmentExpression(String assignment, InlineExpression expression)
    {
        this.assignment = assignment;
        this.inlineExpression = expression;
    }

    @Override
    public String getEntry(int indent) {
        return this.leftPad(indent,assignment + " = " + inlineExpression.getResult() + "\n");
    }
}
