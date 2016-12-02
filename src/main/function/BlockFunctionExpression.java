package main.function;

import main.BlockExpression;
import main.InlineExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class BlockFunctionExpression extends BlockExpression{

    private HashMap<String,InlineExpression> messages = new HashMap<>();
    private  String functionName= "";
    private  FunctionResolver functionResolver;

    public  BlockFunctionExpression(String functionName,FunctionResolver functionResolver,HashMap<String, InlineExpression> messages)
    {
        this.messages = messages;
        this.functionResolver = functionResolver;
        this.functionName = functionName;
    }


    @Override
    public String getEntry(int indent) {
        IFunction function = this.functionResolver.ResolveFunction(this.functionName);
        if(function != null)
        {
            return function.getResult(messages) + "\n";
        }
        else
        {
            return "unknown function call:" + functionName + "\n";
        }
    }
}
