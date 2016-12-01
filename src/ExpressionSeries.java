import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class ExpressionSeries {

    private List<BlockExpression> blockExpressions = new ArrayList<>();
    public  ExpressionSeries()
    {

    }

    public  void addExpressionEntry(BlockExpression blockExpression)
    {
        blockExpressions.add(blockExpression);
    }


}
