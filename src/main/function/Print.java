package main.function;

import main.InlineExpression;

import java.util.HashMap;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class Print implements IFunction {

    @Override
    public String matchingFunctionCall() {
        return "Transcript";
    }

    @Override
    public String getResult(HashMap<String, InlineExpression> messages) {
        if(messages.size() == 1)
        {
            if(messages.containsKey("show"))
            {
                return "print(" + messages.get("show").getResult()+")";
            }
        }
        return null;
    }


}
