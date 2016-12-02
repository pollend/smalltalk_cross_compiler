package main;

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

    public String getResult()
    {
        if(!this.ret)
            return result;
        else
            return result + "\n";

    }
}
