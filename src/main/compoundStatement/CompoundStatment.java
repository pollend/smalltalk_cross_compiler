package main.compoundStatement;

import main.BlockExpression;
import main.SmalltalkVistor;
import main.gen.SmalltalkParser;

import java.util.List;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class CompoundStatment extends BlockExpression {
    public  enum  CompoundStatmentType{
        IF_STATEMENT,
        IF_STATEMENT_INVERT,
        IF_STATEMENT_ELSE,
        IF_STATEMENT_ELSE_INVERT,
        WHILE_STATMENT,
        FOR_STATMENT,
        ITERATE_COLLECTION,
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

            if(keywords.get(0).IDENTIFIER().getText().equals("do"))
                return  CompoundStatmentType.ITERATE_COLLECTION;
        }
        else if(keywords.size() == 2)
        {
            if(keywords.get(0).IDENTIFIER().getText().equals("ifTrue") && keywords.get(1).IDENTIFIER().getText().equals("ifFalse"))
                return  CompoundStatmentType.IF_STATEMENT_ELSE;
            if(keywords.get(1).IDENTIFIER().getText().equals("ifTrue") && keywords.get(0).IDENTIFIER().getText().equals("ifFalse"))
                return  CompoundStatmentType.IF_STATEMENT_ELSE_INVERT;

            if(keywords.get(0).IDENTIFIER().getText().equals("to") && keywords.get(1).IDENTIFIER().getText().equals("do"))
                return  CompoundStatmentType.FOR_STATMENT;

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
                return IfStatement.Handle(ctx,vistor,statmentType);
            case FOR_STATMENT:
                return ForLoopStatement.Handle(ctx,vistor,statmentType);
            case  ITERATE_COLLECTION:
                return IterateCollectionStatement.Handle(ctx,vistor,statmentType);
            default:
                return  null;
        }
    }

}
