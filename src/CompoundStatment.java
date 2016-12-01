/**
 * Created by michaelpollind on 11/30/16.
 */
public class CompoundStatment {
    public  enum  CompoundStatmentType{
        IF_STATMENT,
        WHILE_STATMENT,
        FOR_STATMENT,
        TRY_STATMENT, // not needed for the trans-compiler
        WITH_STATMENT,
        FUNCTION_STATMENT,
        NONE
    }

    public  CompoundStatmentType getCompoundStatmentType()
    {
        return CompoundStatmentType.NONE;
    }


}
