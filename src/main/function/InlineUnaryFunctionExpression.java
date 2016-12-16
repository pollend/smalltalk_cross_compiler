package main.function;

import main.InlineExpression;

import java.util.HashMap;

/**
 * Created by michaelpollind on 12/14/16.
 */
public class InlineUnaryFunctionExpression extends InlineExpression {

    private HashMap<String,InlineExpression> entires = new HashMap<>();
    private  String functionName= "";
    private  FunctionResolver functionResolver;
    private  String unaryMessage;

    public  InlineUnaryFunctionExpression (String functionName,FunctionResolver functionResolver,String unaryMessage)
    {
        this.functionResolver = functionResolver;
        this.functionName = functionName;
        this.unaryMessage = unaryMessage;
    }


    public  void  AddMessage(String key, InlineExpression expression)
    {
        entires.put(key,expression);
    }



    @Override
    public String getResult() {
        IFunction function = this.functionResolver.ResolveFunction(this.functionName);
        if(function != null)
        {
            return function.getUnaryResult(unaryMessage);
        }
        else
        {
            return "unknown function call:" + functionName;
        }
    }
}
