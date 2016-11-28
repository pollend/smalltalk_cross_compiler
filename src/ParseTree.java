/**
 * Created by michaelpollind on 11/28/16.
 */
public class ParseTree extends SmalltalkBaseVisitor<Value>{

    @Override
    public Value visitComment(SmalltalkParser.CommentContext ctx) {
        String value = ctx.COMMENT().getText();
        return  new Value("#"+ value.substring(1,value.length()-1) + "\n");
    }



}
