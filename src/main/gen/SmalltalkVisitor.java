package main.gen;// Generated from /home/michaelpollind/Desktop/smalltalk_cross_compiler/Smalltalk.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmalltalkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmalltalkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(SmalltalkParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SmalltalkParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#message_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_pattern(SmalltalkParser.Message_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#primitive_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_number(SmalltalkParser.Primitive_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#temporaries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporaries(SmalltalkParser.TemporariesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#expression_series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_series(SmalltalkParser.Expression_seriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SmalltalkParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(SmalltalkParser.UnitContext ctx) ;
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SmalltalkParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#message_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_expression(SmalltalkParser.Message_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#cascade_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascade_message(SmalltalkParser.Cascade_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(SmalltalkParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(SmalltalkParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#keyword_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_expression(SmalltalkParser.Keyword_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#unary_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_message(SmalltalkParser.Unary_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#binary_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_message(SmalltalkParser.Binary_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#keyword_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_message(SmalltalkParser.Keyword_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SmalltalkParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SmalltalkParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#binary_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_selector(SmalltalkParser.Binary_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#unary_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_selector(SmalltalkParser.Unary_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SmalltalkParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#array_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_constant(SmalltalkParser.Array_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SmalltalkParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SmalltalkParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SmalltalkParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#character_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_constant(SmalltalkParser.Character_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#symbol_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_constant(SmalltalkParser.Symbol_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SmalltalkParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SmalltalkParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(SmalltalkParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmalltalkParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SmalltalkParser.CommentContext ctx);
}