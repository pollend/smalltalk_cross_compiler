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

    private HashMap<String,InlineExpression> entires = new HashMap<>();
    private  String functionName= "";
    private  FunctionResolver functionResolver;

    public  BlockFunctionExpression(String functionName,FunctionResolver functionResolver)
    {
        this.functionResolver = functionResolver;
        this.functionName = functionName;
    }

    public  void  AddMessage(String key, InlineExpression expression)
    {
        entires.put(key,expression);
    }

    @Override
    public String getEntry(int indent) {
        IFunction function = this.functionResolver.ResolveFunction(this.functionName);
        if(function != null)
        {
            return function.getResult(entires) + "\n";
        }
        else
        {
            return "unknown function call:" + functionName + "\n";
        }
    }
}
