package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class BinaryMessage extends Primary{
    public  enum  BinaryOperator{
        ADD("+"),
        SUBTRACT("-"),
        MULTIPLY("*"),
        ASSIGNMENT("="),
        EQUALITY("=="),
        LESS_THAN("<"),
        GREATER_THAN(">"),
        LESS_THAN_EQUAL("<="),
        GREATER_THAN_EQUAL(">="),

        UNKNOWN("??");

        private final String entry;
        private  BinaryOperator(final String entry)
        {
            this.entry = entry;
        }
        public  String getEntry()
        {
            return  entry;
        }
    }
    private Primary primary;
    private BinaryOperator operator;

    public BinaryMessage(BinaryOperator binaryOperator, Primary primary) {
        this.primary = primary;
        this.operator = binaryOperator;
    }

    @Override
    public String getResult() {

        return " " + this.operator.getEntry() + " " + primary.getResult();
    }

    public  static  BinaryOperator getOperator(String operator)
    {
        for (BinaryOperator b: BinaryOperator.values()) {
            if(b.getEntry().equals(operator))
            {
                return  b;
            }
        }
        return  BinaryOperator.UNKNOWN;

    }

}
