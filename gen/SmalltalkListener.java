// Generated from /home/michaelpollind/Desktop/smalltalk_cross_compiler/Smalltalk.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmalltalkParser}.
 */
public interface SmalltalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SmalltalkParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SmalltalkParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SmalltalkParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SmalltalkParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SmalltalkParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SmalltalkParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(SmalltalkParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(SmalltalkParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unary_selector}.
	 * @param ctx the parse tree
	 */
	void enterUnary_selector(SmalltalkParser.Unary_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unary_selector}.
	 * @param ctx the parse tree
	 */
	void exitUnary_selector(SmalltalkParser.Unary_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#binary_selector}.
	 * @param ctx the parse tree
	 */
	void enterBinary_selector(SmalltalkParser.Binary_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#binary_selector}.
	 * @param ctx the parse tree
	 */
	void exitBinary_selector(SmalltalkParser.Binary_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SmalltalkParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SmalltalkParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SmalltalkParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SmalltalkParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SmalltalkParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SmalltalkParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SmalltalkParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SmalltalkParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#character_constant}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_constant(SmalltalkParser.Character_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#character_constant}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_constant(SmalltalkParser.Character_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(SmalltalkParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(SmalltalkParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#array_constant}.
	 * @param ctx the parse tree
	 */
	void enterArray_constant(SmalltalkParser.Array_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#array_constant}.
	 * @param ctx the parse tree
	 */
	void exitArray_constant(SmalltalkParser.Array_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SmalltalkParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SmalltalkParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#symbol_constant}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_constant(SmalltalkParser.Symbol_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#symbol_constant}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_constant(SmalltalkParser.Symbol_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SmalltalkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SmalltalkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SmalltalkParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SmalltalkParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unary_object_description}.
	 * @param ctx the parse tree
	 */
	void enterUnary_object_description(SmalltalkParser.Unary_object_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unary_object_description}.
	 * @param ctx the parse tree
	 */
	void exitUnary_object_description(SmalltalkParser.Unary_object_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#binary_object_description}.
	 * @param ctx the parse tree
	 */
	void enterBinary_object_description(SmalltalkParser.Binary_object_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#binary_object_description}.
	 * @param ctx the parse tree
	 */
	void exitBinary_object_description(SmalltalkParser.Binary_object_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(SmalltalkParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(SmalltalkParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(SmalltalkParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(SmalltalkParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#keyword_expression}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_expression(SmalltalkParser.Keyword_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#keyword_expression}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_expression(SmalltalkParser.Keyword_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void enterMessage_expression(SmalltalkParser.Message_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void exitMessage_expression(SmalltalkParser.Message_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#cascaded_message_expression}.
	 * @param ctx the parse tree
	 */
	void enterCascaded_message_expression(SmalltalkParser.Cascaded_message_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#cascaded_message_expression}.
	 * @param ctx the parse tree
	 */
	void exitCascaded_message_expression(SmalltalkParser.Cascaded_message_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SmalltalkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SmalltalkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SmalltalkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SmalltalkParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#temporaries}.
	 * @param ctx the parse tree
	 */
	void enterTemporaries(SmalltalkParser.TemporariesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#temporaries}.
	 * @param ctx the parse tree
	 */
	void exitTemporaries(SmalltalkParser.TemporariesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#message_pattern}.
	 * @param ctx the parse tree
	 */
	void enterMessage_pattern(SmalltalkParser.Message_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#message_pattern}.
	 * @param ctx the parse tree
	 */
	void exitMessage_pattern(SmalltalkParser.Message_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SmalltalkParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SmalltalkParser.MethodContext ctx);
}