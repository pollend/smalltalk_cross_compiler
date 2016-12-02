package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class Number extends  Primary {
    private  String number;
    public Number(String entry) {
        //TODO: RADEX and exponent
        super();
        this.number = entry;
    }

    @Override
    public String getResult() {
        return this.number;
    }
}
