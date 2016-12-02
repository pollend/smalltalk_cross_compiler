package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class StringPrimary extends Primary {
    private  String entry;
    public  StringPrimary(String entry)
    {
        this.entry = entry;
    }

    @Override
    public String getResult() {
        return this.entry;
    }
}
