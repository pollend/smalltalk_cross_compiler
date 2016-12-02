package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class VariablePrimary extends Primary {
    private String variable;
    public  VariablePrimary(String variable)
    {
        this.variable = variable;
    }

    @Override
    public String getResult() {
        return this.variable;
    }
}
