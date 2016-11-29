import java.util.List;

/**
 * Created by michaelpollind on 11/28/16.
 */
public class KeywordExpressionTranslation
{
    private  SmalltalkParser.Keyword_expressionContext ctx;
    private  SmalltalkVistor vistor;
    public  KeywordExpressionTranslation(SmalltalkParser.Keyword_expressionContext ctx, SmalltalkVistor vistor)
    {
        this.ctx = ctx;
        this.vistor = vistor;
    }

    public ResultBlock  Parse()
    {
        ResultRow entry = (ResultRow) vistor.visit(ctx.primary());

        ResultBlock resultBlock = new ResultBlock(true);
        List<SmalltalkParser.KeywordContext> keywords = this.ctx.keyword_message().keyword();
        if(keywords.size() >= 1) {
            if (keywords.get(0).IDENTIFIER().getText() == "ifTrue") {

                resultBlock.append(new ResultRow("if(" + entry.getResult() + ")",true));
                List<SmalltalkParser.PrimaryContext> primaryChain = ctx.keyword_message().primary();
                if(primaryChain.size() >= 1) {
                    resultBlock.append((ResultBlock) vistor.visit(primaryChain.get(0).unit().block().expression_series()));
                    if(primaryChain.size() >= 2)
                    {
                        resultBlock.append(new ResultRow("else:",true));
                        resultBlock.append( (ResultBlock) vistor.visit(primaryChain.get(1).unit().block().expression_series()));
                    }
                }

            }
            else if(keywords.get(0).IDENTIFIER().getText() == "ifFalse")
            {

                List<SmalltalkParser.PrimaryContext> primaryChain = ctx.keyword_message().primary();
                if(primaryChain.size() >= 1) {
                    resultBlock.append(new ResultRow("if(!(" + entry.getResult() + "))",true));
                    resultBlock.append((ResultBlock) vistor.visit(primaryChain.get(0).unit().block().expression_series()));
                    if(primaryChain.size() >= 2)
                    {
                        resultBlock.append(new ResultRow("else:",true));
                        resultBlock.append((ResultBlock) vistor.visit(primaryChain.get(1).unit().block().expression_series()));
                    }
                }

            }
        }

        return  resultBlock;
    }
}
