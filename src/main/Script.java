package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class Script implements  IPythonNode {
    public List<IPythonNode> nodes = new ArrayList<>();

    public Script()
    {
    }

    public  void  AddEntry(IPythonNode node)
    {
        this.nodes.add(node);
    }

    public  String getResult()
    {
        String result = "";
        for(int x = 0; x < nodes.size(); x++)
        {
            if(nodes.get(x) instanceof  ExpressionSeries)
            {
                result +=  ((ExpressionSeries)nodes.get(x)).GetResult(0);
            }
        }
        return  result;
    }
}
