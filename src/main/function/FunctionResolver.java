package main.function;

import main.InlineExpression;
import main.SmalltalkVistor;
import main.gen.SmalltalkParser;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.List;
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

    public static HashMap<String, InlineExpression> getMessages(SmalltalkParser.Keyword_messageContext ctx, SmalltalkVistor vistor)
    {
        HashMap<String,InlineExpression> result = new HashMap<>();
        List<SmalltalkParser.KeywordContext> keywords = ctx.keyword();
        List<SmalltalkParser.PrimaryContext> primaries = ctx.primary();

        for(int x = 0; x < keywords.size(); x++)
        {
            result.put(keywords.get(x).IDENTIFIER().getText(),(InlineExpression) vistor.visit(primaries.get(x)));
        }
        return  result;

    }

}
