package main;

import main.gen.SmalltalkParser;

import java.util.List;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class CompoundStatment extends BlockExpression{
    public  enum  CompoundStatmentType{
        IF_STATEMENT,
        IF_STATEMENT_INVERT,
        IF_STATEMENT_ELSE,
        IF_STATEMENT_ELSE_INVERT,
        WHILE_STATMENT,
        FOR_STATMENT,
        TRY_STATMENT, // not needed for the trans-compiler
        WITH_STATMENT,
        FUNCTION_STATMENT,
        NONE
    }

    public static  CompoundStatmentType keywordMatch(SmalltalkParser.Keyword_messageContext ctx, SmalltalkVistor vistor)
    {
        List<SmalltalkParser.KeywordContext> keywords = ctx.keyword();
        if(keywords.size() == 1)
        {
            String test = keywords.get(0).IDENTIFIER().getText();
            if(keywords.get(0).IDENTIFIER().getText().equals("ifTrue"))
                return  CompoundStatmentType.IF_STATEMENT;

            if(keywords.get(0).IDENTIFIER().getText().equals("ifFalse"))
                return  CompoundStatmentType.IF_STATEMENT_INVERT;
        }
        else if(keywords.size() == 2)
        {
            if(keywords.get(0).IDENTIFIER().getText().equals("ifTrue") && keywords.get(1).IDENTIFIER().getText().equals("ifFalse"))
                return  CompoundStatmentType.IF_STATEMENT_ELSE;
            if(keywords.get(1).IDENTIFIER().getText().equals("ifTrue") && keywords.get(0).IDENTIFIER().getText().equals("ifFalse"))
                return  CompoundStatmentType.IF_STATEMENT_ELSE_INVERT;

        }
        return CompoundStatmentType.NONE;

    }

    public  static  CompoundStatment Parse(SmalltalkParser.Keyword_expressionContext ctx, SmalltalkVistor vistor,CompoundStatmentType statmentType)
    {
        switch (statmentType)
        {
            case IF_STATEMENT:
            case IF_STATEMENT_ELSE:
            case IF_STATEMENT_INVERT:
            case IF_STATEMENT_ELSE_INVERT:
                return IfStatment.Handle(ctx,vistor,statmentType);
            default:
                return  null;
        }
    }

}
