package main.inline;

import main.InlineExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class BinaryExpression extends InlineExpression{
    private  Primary primary;
    private List<BinaryMessage> binaryMesssages = new ArrayList<>();

    public  BinaryExpression(Primary primary)
    {
        this.primary = primary;
    }

    public  void  addBinaryMessage(BinaryMessage binaryMessage)
    {
        this.binaryMesssages.add(binaryMessage);
    }

    @Override
    public String getResult() {
        String result = primary.getResult();
        for(int x = 0; x < binaryMesssages.size(); x++)
        {
            result += binaryMesssages.get(x).getResult();
        }

        return result;
    }
}
