package main.function;

import main.InlineExpression;

import java.util.HashMap;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class InlineFunctionExpression extends InlineExpression {

    private HashMap<String,InlineExpression> entires = new HashMap<>();
    private  String functionName= "";
    private  FunctionResolver functionResolver;

    public  InlineFunctionExpression(String functionName,FunctionResolver functionResolver,HashMap<String, InlineExpression> messages)
    {
        this.functionResolver = functionResolver;
        this.functionName = functionName;
        this.entires = messages;
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
            return function.getResult(entires);
        }
        else
        {
            return "unknown function call:" + functionName;
        }
    }
}
