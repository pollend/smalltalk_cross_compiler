package main;

/**
 * Created by michaelpollind on 11/30/16.
 */
public class CommentExpression extends BlockExpression {
    private  String comment;
    public  CommentExpression(String comment)
    {
        this.comment = comment;
    }

    public  String GetComment()
    {
        return  comment;
    }

    @Override
    public String getEntry(int indent) {
        //output string with a # for comment
        return this.leftPad(indent,"#"+comment);
    }
}
