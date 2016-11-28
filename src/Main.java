import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ANTLRFileStream fileStream = new ANTLRFileStream("./smalltalk_samples/hello_world.st");
            SmalltalkLexer smalltalkLexer = new SmalltalkLexer(fileStream );
            CommonTokenStream tokens = new CommonTokenStream(smalltalkLexer);
            SmalltalkParser parser = new SmalltalkParser(tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
