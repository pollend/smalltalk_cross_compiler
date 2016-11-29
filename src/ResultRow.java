import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 11/28/16.
 */
public class ResultRow implements IBaseValue {
    private  String result;
    private  boolean ret;
    public ResultRow(String result, boolean ret)
    {
        this.ret = ret;
        this.result = result;
    }

    public List<String> getResult()
    {
        ArrayList<String> output = new ArrayList<>();
        if(!this.ret)
            output.add(result);
        else
            output.add(result + "\n");

        return output;
    }
}
