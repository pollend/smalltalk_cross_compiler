import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            ANTLRFileStream fileStream = new ANTLRFileStream("./smalltalk_samples/hello_world.st");
            SmalltalkLexer smalltalkLexer = new SmalltalkLexer(fileStream );
            SmalltalkParser parser = new SmalltalkParser(new CommonTokenStream(smalltalkLexer));

             SmalltalkParser.ScriptContext tree =  parser.script();

             SmalltalkVistor vistor = new SmalltalkVistor();
             String finalResult = "";
            /*List<String> results = ((ResultBlock)vistor.visit(tree)).getResult();
            for(int x = 0; x < results.size(); x++)
            {
                System.out.println(results.get(x));
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
