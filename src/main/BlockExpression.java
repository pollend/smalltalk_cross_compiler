package main;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class BlockExpression extends BaseExpression{


    public BlockExpression() {
    }

    protected  String leftPad(int indent,String input)
    {
        for(int x = 0; x < indent; x++)
        {
            input = ' ' + input;
        }
        return  input;
    }

    public  String getEntry(int indent)
    {
        return  "\n";
    }
}
