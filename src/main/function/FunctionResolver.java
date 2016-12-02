package main.function;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class FunctionResolver {
    private Map<String,IFunction> functions = new HashMap<>();
    public  FunctionResolver()
    {
        Reflections reflections = new Reflections("main.function");
        Set<Class<? extends IFunction>> functions = reflections.getSubTypesOf(IFunction.class);
        for (Class<? extends IFunction> func: functions) {
            try {
                IFunction function = func.newInstance();
                this.functions.put(function.matchingFunctionCall(),function);


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }


    public IFunction ResolveFunction(String functionName)
    {
        if(functions.containsKey(functionName))
        {
            return functions.get(functionName);
        }
        return null;
    }

}
