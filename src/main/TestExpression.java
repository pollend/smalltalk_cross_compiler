package main;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class TestExpression extends InlineExpression {
    private  String testExpression = "";

    public  TestExpression(String entry)
    {
        this.testExpression = entry;
    }

    public  String getResult()
    {
        return  this.testExpression;
    }

}
