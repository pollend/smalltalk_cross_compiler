package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class NestedExpression extends Primary {

    private  Primary primary;
    public  NestedExpression(Primary primary)
    {
        this.primary = primary;
    }

    @Override
    public String getResult() {
        return "(" + this.primary.getResult() + ")";
    }
}
