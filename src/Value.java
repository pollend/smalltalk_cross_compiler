/**
 * Created by michaelpollind on 11/28/16.
 */
public class Value {
    private Object value;
    public Value(Object value) {
        this.value = value;
    }

    public String GetString()
    {
        return  (String) this.value;
    }

}