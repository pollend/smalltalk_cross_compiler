package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class ExpressionSeries implements IPythonNode{

    private List<BlockExpression> blockExpressions = new ArrayList<>();
    public  ExpressionSeries()
    {

    }

    public  void addExpressionEntry(BlockExpression blockExpression)
    {
        blockExpressions.add(blockExpression);
    }


    public  String GetResult(int depth)
    {
        String result = "";
        for(int x = 0; x < blockExpressions.size(); x++)
        {
            result  += blockExpressions.get(x).getEntry(depth) ;
        }
        return  result;
    }
}
