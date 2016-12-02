package main.function;

import main.InlineExpression;

import java.util.HashMap;

/**
 * Created by michaelpollind on 12/1/16.
 */
public interface IFunction {
    String matchingFunctionCall();
    String getResult(HashMap<String, InlineExpression> messages);
}
