package main.inline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 12/8/16.
 */
public class Array extends Primary{
    private List<Primary> primaries = new ArrayList<>();

    public  Array()
    {
    }

    public void addArrayEntry(Primary entry)
    {
        this.primaries.add(entry);
    }

    @Override
    public String getResult() {
        String[] entry = new String[primaries.size()];
        for(int x = 0; x < primaries.size(); x++)
        {
            entry[x] = primaries.get(x).getResult();
        }
        return "[" + String.join(",",entry) + "]";
    }
}
