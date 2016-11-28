// Generated from /home/michaelpollind/Desktop/smalltalk_cross_compiler/Smalltalk.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmalltalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMBER=3, DECIMAL=4, INTEGER=5, RADEX=6, EXPONENT=7, IDENTIFIER=8, 
		COMMENT=9, CHARACTER_CONSTANT=10, STRING=11, DIGIT=12, LETTER=13, MINUS=14, 
		CLOSE_PAREN=15, OPEN_PAREN=16, PIPE=17, COLON=18, SELECTOR_CHARACTER=19, 
		CLOSE_SQUARE=20, OPEN_SQUARE=21, SINGLE_QUOTE=22, DOUBLE_QUOTE=23, DOLLAR=24, 
		HASH=25, SEPARATOR=26, ASSIGNMENT=27, CHARACTER=28, SEMICOLON=29, PRIMATIVE=30, 
		LEFT_ARROW=31, RIGHT_ARROW=32;
	public static final int
		RULE_script = 0, RULE_method = 1, RULE_message_pattern = 2, RULE_primitive_number = 3, 
		RULE_temporaries = 4, RULE_expression_series = 5, RULE_expression = 6, 
		RULE_unit = 7, RULE_primary = 8, RULE_message_expression = 9, RULE_cascade_message = 10, 
		RULE_unary_expression = 11, RULE_binary_expression = 12, RULE_keyword_expression = 13, 
		RULE_unary_message = 14, RULE_binary_message = 15, RULE_keyword_message = 16, 
		RULE_block = 17, RULE_keyword = 18, RULE_binary_selector = 19, RULE_unary_selector = 20, 
		RULE_literal = 21, RULE_array_constant = 22, RULE_array = 23, RULE_number = 24, 
		RULE_string = 25, RULE_character_constant = 26, RULE_symbol_constant = 27, 
		RULE_symbol = 28, RULE_identifier = 29, RULE_variable_name = 30, RULE_comment = 31;
	public static final String[] ruleNames = {
		"script", "method", "message_pattern", "primitive_number", "temporaries", 
		"expression_series", "expression", "unit", "primary", "message_expression", 
		"cascade_message", "unary_expression", "binary_expression", "keyword_expression", 
		"unary_message", "binary_message", "keyword_message", "block", "keyword", 
		"binary_selector", "unary_selector", "literal", "array_constant", "array", 
		"number", "string", "character_constant", "symbol_constant", "symbol", 
		"identifier", "variable_name", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'^'", null, null, null, null, null, null, null, null, null, 
		null, null, "'-'", "')'", "'('", "'|'", "':'", null, "']'", "'['", "'''", 
		"'\"'", "'$'", "'#'", null, "':='", null, "';'", "'primitive:'", "'<'", 
		"'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NUMBER", "DECIMAL", "INTEGER", "RADEX", "EXPONENT", 
		"IDENTIFIER", "COMMENT", "CHARACTER_CONSTANT", "STRING", "DIGIT", "LETTER", 
		"MINUS", "CLOSE_PAREN", "OPEN_PAREN", "PIPE", "COLON", "SELECTOR_CHARACTER", 
		"CLOSE_SQUARE", "OPEN_SQUARE", "SINGLE_QUOTE", "DOUBLE_QUOTE", "DOLLAR", 
		"HASH", "SEPARATOR", "ASSIGNMENT", "CHARACTER", "SEMICOLON", "PRIMATIVE", 
		"LEFT_ARROW", "RIGHT_ARROW"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Smalltalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmalltalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public Expression_seriesContext expression_series() {
			return getRuleContext(Expression_seriesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmalltalkParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			expression_series();
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public Message_patternContext message_pattern() {
			return getRuleContext(Message_patternContext.class,0);
		}
		public Expression_seriesContext expression_series() {
			return getRuleContext(Expression_seriesContext.class,0);
		}
		public Primitive_numberContext primitive_number() {
			return getRuleContext(Primitive_numberContext.class,0);
		}
		public TemporariesContext temporaries() {
			return getRuleContext(TemporariesContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			message_pattern();
			setState(69);
			_la = _input.LA(1);
			if (_la==LEFT_ARROW) {
				{
				setState(68);
				primitive_number();
				}
			}

			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(71);
				temporaries();
				}
				break;
			}
			setState(74);
			expression_series();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_patternContext extends ParserRuleContext {
		public Unary_selectorContext unary_selector() {
			return getRuleContext(Unary_selectorContext.class,0);
		}
		public Binary_selectorContext binary_selector() {
			return getRuleContext(Binary_selectorContext.class,0);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public Message_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterMessage_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitMessage_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitMessage_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_patternContext message_pattern() throws RecognitionException {
		Message_patternContext _localctx = new Message_patternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_message_pattern);
		try {
			int _alt;
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				unary_selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(77);
				binary_selector();
				setState(78);
				variable_name();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(80);
						keyword();
						setState(81);
						variable_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(85); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_numberContext extends ParserRuleContext {
		public TerminalNode LEFT_ARROW() { return getToken(SmalltalkParser.LEFT_ARROW, 0); }
		public TerminalNode PRIMATIVE() { return getToken(SmalltalkParser.PRIMATIVE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RIGHT_ARROW() { return getToken(SmalltalkParser.RIGHT_ARROW, 0); }
		public Primitive_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterPrimitive_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitPrimitive_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitPrimitive_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_numberContext primitive_number() throws RecognitionException {
		Primitive_numberContext _localctx = new Primitive_numberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitive_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LEFT_ARROW);
			setState(90);
			match(PRIMATIVE);
			setState(91);
			number();
			setState(92);
			match(RIGHT_ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemporariesContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(SmalltalkParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(SmalltalkParser.PIPE, i);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public TemporariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporaries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterTemporaries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitTemporaries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitTemporaries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporariesContext temporaries() throws RecognitionException {
		TemporariesContext _localctx = new TemporariesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_temporaries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PIPE);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(95);
				variable_name();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(PIPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_seriesContext extends ParserRuleContext {
		public List<TemporariesContext> temporaries() {
			return getRuleContexts(TemporariesContext.class);
		}
		public TemporariesContext temporaries(int i) {
			return getRuleContext(TemporariesContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_seriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterExpression_series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitExpression_series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitExpression_series(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_seriesContext expression_series() throws RecognitionException {
		Expression_seriesContext _localctx = new Expression_seriesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression_series);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(108);
					switch (_input.LA(1)) {
					case PIPE:
						{
						setState(103);
						temporaries();
						}
						break;
					case NUMBER:
					case IDENTIFIER:
					case CHARACTER_CONSTANT:
					case STRING:
					case OPEN_PAREN:
					case OPEN_SQUARE:
					case HASH:
						{
						{
						setState(104);
						expression();
						setState(105);
						match(T__0);
						}
						}
						break;
					case COMMENT:
						{
						setState(107);
						comment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << CHARACTER_CONSTANT) | (1L << STRING) | (1L << OPEN_PAREN) | (1L << OPEN_SQUARE) | (1L << HASH))) != 0)) {
				{
				setState(114);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(113);
					match(T__1);
					}
				}

				setState(116);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SmalltalkParser.ASSIGNMENT, 0); }
		public List<Cascade_messageContext> cascade_message() {
			return getRuleContexts(Cascade_messageContext.class);
		}
		public Cascade_messageContext cascade_message(int i) {
			return getRuleContext(Cascade_messageContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119);
				variable_name();
				setState(120);
				match(ASSIGNMENT);
				}
				break;
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(124);
				primary();
				}
				break;
			case 2:
				{
				setState(125);
				message_expression();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(126);
					match(SEMICOLON);
					setState(127);
					cascade_message();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SmalltalkParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SmalltalkParser.CLOSE_PAREN, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unit);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				variable_name();
				}
				break;
			case NUMBER:
			case CHARACTER_CONSTANT:
			case STRING:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				literal();
				}
				break;
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				block();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(OPEN_PAREN);
				setState(139);
				expression();
				setState(140);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primary);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				unit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Keyword_expressionContext keyword_expression() {
			return getRuleContext(Keyword_expressionContext.class,0);
		}
		public Message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterMessage_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitMessage_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitMessage_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_expressionContext message_expression() throws RecognitionException {
		Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_message_expression);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				binary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				keyword_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cascade_messageContext extends ParserRuleContext {
		public Unary_messageContext unary_message() {
			return getRuleContext(Unary_messageContext.class,0);
		}
		public Binary_messageContext binary_message() {
			return getRuleContext(Binary_messageContext.class,0);
		}
		public Keyword_messageContext keyword_message() {
			return getRuleContext(Keyword_messageContext.class,0);
		}
		public Cascade_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascade_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterCascade_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitCascade_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitCascade_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cascade_messageContext cascade_message() throws RecognitionException {
		Cascade_messageContext _localctx = new Cascade_messageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cascade_message);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				unary_message();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				binary_message();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				keyword_message();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public List<Unary_messageContext> unary_message() {
			return getRuleContexts(Unary_messageContext.class);
		}
		public Unary_messageContext unary_message(int i) {
			return getRuleContext(Unary_messageContext.class,i);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			unit();
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					unary_message();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<Binary_messageContext> binary_message() {
			return getRuleContexts(Binary_messageContext.class);
		}
		public Binary_messageContext binary_message(int i) {
			return getRuleContext(Binary_messageContext.class,i);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			primary();
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				binary_message();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MINUS || _la==SELECTOR_CHARACTER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_expressionContext extends ParserRuleContext {
		public Keyword_messageContext keyword_message() {
			return getRuleContext(Keyword_messageContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Keyword_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeyword_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeyword_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitKeyword_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_expressionContext keyword_expression() throws RecognitionException {
		Keyword_expressionContext _localctx = new Keyword_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyword_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(170);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(171);
				primary();
				}
				break;
			}
			setState(174);
			keyword_message();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_messageContext extends ParserRuleContext {
		public Unary_selectorContext unary_selector() {
			return getRuleContext(Unary_selectorContext.class,0);
		}
		public Unary_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnary_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnary_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitUnary_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_messageContext unary_message() throws RecognitionException {
		Unary_messageContext _localctx = new Unary_messageContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			unary_selector();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_messageContext extends ParserRuleContext {
		public Binary_selectorContext binary_selector() {
			return getRuleContext(Binary_selectorContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Binary_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinary_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinary_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitBinary_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_messageContext binary_message() throws RecognitionException {
		Binary_messageContext _localctx = new Binary_messageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binary_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			binary_selector();
			setState(179);
			primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_messageContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public Keyword_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeyword_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeyword_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitKeyword_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_messageContext keyword_message() throws RecognitionException {
		Keyword_messageContext _localctx = new Keyword_messageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyword_message);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			keyword();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(182);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(183);
				primary();
				}
				break;
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(186);
				keyword();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(187);
					binary_expression();
					}
					break;
				case 2:
					{
					setState(188);
					primary();
					}
					break;
				}
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(SmalltalkParser.OPEN_SQUARE, 0); }
		public Expression_seriesContext expression_series() {
			return getRuleContext(Expression_seriesContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(SmalltalkParser.CLOSE_SQUARE, 0); }
		public TerminalNode PIPE() { return getToken(SmalltalkParser.PIPE, 0); }
		public List<TerminalNode> COLON() { return getTokens(SmalltalkParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SmalltalkParser.COLON, i);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(OPEN_SQUARE);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(197);
					match(COLON);
					setState(198);
					variable_name();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(PIPE);
				}
				break;
			}
			setState(207);
			expression_series();
			setState(208);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SmalltalkParser.COLON, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENTIFIER);
			setState(211);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_selectorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SmalltalkParser.MINUS, 0); }
		public List<TerminalNode> SELECTOR_CHARACTER() { return getTokens(SmalltalkParser.SELECTOR_CHARACTER); }
		public TerminalNode SELECTOR_CHARACTER(int i) {
			return getToken(SmalltalkParser.SELECTOR_CHARACTER, i);
		}
		public Binary_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinary_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinary_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitBinary_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_selectorContext binary_selector() throws RecognitionException {
		Binary_selectorContext _localctx = new Binary_selectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binary_selector);
		try {
			int _alt;
			setState(219);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(MINUS);
				}
				break;
			case SELECTOR_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(214);
						match(SELECTOR_CHARACTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(217); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_selectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public Unary_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnary_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnary_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitUnary_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_selectorContext unary_selector() throws RecognitionException {
		Unary_selectorContext _localctx = new Unary_selectorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unary_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Character_constantContext character_constant() {
			return getRuleContext(Character_constantContext.class,0);
		}
		public Symbol_constantContext symbol_constant() {
			return getRuleContext(Symbol_constantContext.class,0);
		}
		public Array_constantContext array_constant() {
			return getRuleContext(Array_constantContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				character_constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				symbol_constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				array_constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_constantContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SmalltalkParser.HASH, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Array_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterArray_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitArray_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitArray_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_constantContext array_constant() throws RecognitionException {
		Array_constantContext _localctx = new Array_constantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(HASH);
			setState(231);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(SmalltalkParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SmalltalkParser.CLOSE_PAREN, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<Character_constantContext> character_constant() {
			return getRuleContexts(Character_constantContext.class);
		}
		public Character_constantContext character_constant(int i) {
			return getRuleContext(Character_constantContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(SmalltalkParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(SmalltalkParser.SEPARATOR, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(OPEN_PAREN);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(240);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(234);
					number();
					}
					break;
				case IDENTIFIER:
				case MINUS:
				case SELECTOR_CHARACTER:
					{
					setState(235);
					symbol();
					}
					break;
				case STRING:
					{
					setState(236);
					string();
					}
					break;
				case CHARACTER_CONSTANT:
					{
					setState(237);
					character_constant();
					}
					break;
				case OPEN_PAREN:
					{
					setState(238);
					array();
					}
					break;
				case SEPARATOR:
					{
					setState(239);
					match(SEPARATOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << IDENTIFIER) | (1L << CHARACTER_CONSTANT) | (1L << STRING) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << SELECTOR_CHARACTER) | (1L << SEPARATOR))) != 0) );
			setState(244);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SmalltalkParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SmalltalkParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_constantContext extends ParserRuleContext {
		public TerminalNode CHARACTER_CONSTANT() { return getToken(SmalltalkParser.CHARACTER_CONSTANT, 0); }
		public Character_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterCharacter_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitCharacter_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitCharacter_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_constantContext character_constant() throws RecognitionException {
		Character_constantContext _localctx = new Character_constantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_character_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(CHARACTER_CONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbol_constantContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SmalltalkParser.HASH, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Symbol_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterSymbol_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitSymbol_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitSymbol_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symbol_constantContext symbol_constant() throws RecognitionException {
		Symbol_constantContext _localctx = new Symbol_constantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_symbol_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(HASH);
			setState(253);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public Unary_selectorContext unary_selector() {
			return getRuleContext(Unary_selectorContext.class,0);
		}
		public Binary_selectorContext binary_selector() {
			return getRuleContext(Binary_selectorContext.class,0);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_symbol);
		try {
			int _alt;
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				unary_selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				binary_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(257);
						keyword();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(260); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SmalltalkParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\6\4V\n\4\r\4\16\4W\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r"+
		"\13\7\3\7\5\7u\n\7\3\7\5\7x\n\7\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\3\b\7"+
		"\b\u0083\n\b\f\b\16\b\u0086\13\b\5\b\u0088\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0091\n\t\3\n\3\n\5\n\u0095\n\n\3\13\3\13\3\13\5\13\u009a\n\13"+
		"\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\6\r\u00a3\n\r\r\r\16\r\u00a4\3\16\3"+
		"\16\6\16\u00a9\n\16\r\16\16\16\u00aa\3\17\3\17\5\17\u00af\n\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00bb\n\22\3\22\3\22"+
		"\3\22\5\22\u00c0\n\22\7\22\u00c2\n\22\f\22\16\22\u00c5\13\22\3\23\3\23"+
		"\3\23\7\23\u00ca\n\23\f\23\16\23\u00cd\13\23\3\23\5\23\u00d0\n\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\6\25\u00da\n\25\r\25\16\25\u00db\5"+
		"\25\u00de\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00e7\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u00f3\n\31\r\31\16"+
		"\31\u00f4\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\6\36\u0105\n\36\r\36\16\36\u0106\5\36\u0109\n\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@\2\2\u011d\2B\3\2\2\2\4E\3\2\2\2\6Y\3\2\2\2\b[\3\2\2"+
		"\2\n`\3\2\2\2\fp\3\2\2\2\16|\3\2\2\2\20\u0090\3\2\2\2\22\u0094\3\2\2\2"+
		"\24\u0099\3\2\2\2\26\u009e\3\2\2\2\30\u00a0\3\2\2\2\32\u00a6\3\2\2\2\34"+
		"\u00ae\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\"\u00b7\3\2\2\2$\u00c6"+
		"\3\2\2\2&\u00d4\3\2\2\2(\u00dd\3\2\2\2*\u00df\3\2\2\2,\u00e6\3\2\2\2."+
		"\u00e8\3\2\2\2\60\u00eb\3\2\2\2\62\u00f8\3\2\2\2\64\u00fa\3\2\2\2\66\u00fc"+
		"\3\2\2\28\u00fe\3\2\2\2:\u0108\3\2\2\2<\u010a\3\2\2\2>\u010c\3\2\2\2@"+
		"\u010e\3\2\2\2BC\5\f\7\2CD\7\2\2\3D\3\3\2\2\2EG\5\6\4\2FH\5\b\5\2GF\3"+
		"\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\5\n\6\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5"+
		"\f\7\2M\5\3\2\2\2NZ\5*\26\2OP\5(\25\2PQ\5> \2QZ\3\2\2\2RS\5&\24\2ST\5"+
		"> \2TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YN\3\2"+
		"\2\2YO\3\2\2\2YU\3\2\2\2Z\7\3\2\2\2[\\\7!\2\2\\]\7 \2\2]^\5\62\32\2^_"+
		"\7\"\2\2_\t\3\2\2\2`d\7\23\2\2ac\5> \2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2d"+
		"e\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\23\2\2h\13\3\2\2\2io\5\n\6\2jk\5\16"+
		"\b\2kl\7\3\2\2lo\3\2\2\2mo\5@!\2ni\3\2\2\2nj\3\2\2\2nm\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2qw\3\2\2\2rp\3\2\2\2su\7\4\2\2ts\3\2\2\2tu\3\2\2"+
		"\2uv\3\2\2\2vx\5\16\b\2wt\3\2\2\2wx\3\2\2\2x\r\3\2\2\2yz\5> \2z{\7\35"+
		"\2\2{}\3\2\2\2|y\3\2\2\2|}\3\2\2\2}\u0087\3\2\2\2~\u0088\5\22\n\2\177"+
		"\u0084\5\24\13\2\u0080\u0081\7\37\2\2\u0081\u0083\5\26\f\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087~\3\2\2\2\u0087\177\3\2\2\2\u0088"+
		"\17\3\2\2\2\u0089\u0091\5> \2\u008a\u0091\5,\27\2\u008b\u0091\5$\23\2"+
		"\u008c\u008d\7\22\2\2\u008d\u008e\5\16\b\2\u008e\u008f\7\21\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2"+
		"\2\2\u0090\u008c\3\2\2\2\u0091\21\3\2\2\2\u0092\u0095\5\20\t\2\u0093\u0095"+
		"\5\30\r\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\23\3\2\2\2\u0096"+
		"\u009a\5\30\r\2\u0097\u009a\5\32\16\2\u0098\u009a\5\34\17\2\u0099\u0096"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b"+
		"\u009f\5\36\20\2\u009c\u009f\5 \21\2\u009d\u009f\5\"\22\2\u009e\u009b"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a2\5\20\t\2\u00a1\u00a3\5\36\20\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\31\3\2\2\2\u00a6"+
		"\u00a8\5\22\n\2\u00a7\u00a9\5 \21\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\33\3\2\2\2\u00ac"+
		"\u00af\5\32\16\2\u00ad\u00af\5\22\n\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\"\22\2\u00b1\35\3\2\2\2\u00b2"+
		"\u00b3\5*\26\2\u00b3\37\3\2\2\2\u00b4\u00b5\5(\25\2\u00b5\u00b6\5\22\n"+
		"\2\u00b6!\3\2\2\2\u00b7\u00ba\5&\24\2\u00b8\u00bb\5\32\16\2\u00b9\u00bb"+
		"\5\22\n\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00c3\3\2\2\2"+
		"\u00bc\u00bf\5&\24\2\u00bd\u00c0\5\32\16\2\u00be\u00c0\5\22\n\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bc\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"#\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cf\7\27\2\2\u00c7\u00c8\7\24\2"+
		"\2\u00c8\u00ca\5> \2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\7\23\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\5\f\7\2\u00d2\u00d3\7\26\2\2\u00d3%\3\2\2\2\u00d4\u00d5"+
		"\7\n\2\2\u00d5\u00d6\7\24\2\2\u00d6\'\3\2\2\2\u00d7\u00de\7\20\2\2\u00d8"+
		"\u00da\7\25\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00de)\3\2\2\2\u00df\u00e0\7\n\2\2\u00e0+\3\2\2\2\u00e1"+
		"\u00e7\5\62\32\2\u00e2\u00e7\5\64\33\2\u00e3\u00e7\5\66\34\2\u00e4\u00e7"+
		"\58\35\2\u00e5\u00e7\5.\30\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7-\3\2\2\2"+
		"\u00e8\u00e9\7\33\2\2\u00e9\u00ea\5\60\31\2\u00ea/\3\2\2\2\u00eb\u00f2"+
		"\7\22\2\2\u00ec\u00f3\5\62\32\2\u00ed\u00f3\5:\36\2\u00ee\u00f3\5\64\33"+
		"\2\u00ef\u00f3\5\66\34\2\u00f0\u00f3\5\60\31\2\u00f1\u00f3\7\34\2\2\u00f2"+
		"\u00ec\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\21"+
		"\2\2\u00f7\61\3\2\2\2\u00f8\u00f9\7\5\2\2\u00f9\63\3\2\2\2\u00fa\u00fb"+
		"\7\r\2\2\u00fb\65\3\2\2\2\u00fc\u00fd\7\f\2\2\u00fd\67\3\2\2\2\u00fe\u00ff"+
		"\7\33\2\2\u00ff\u0100\5:\36\2\u01009\3\2\2\2\u0101\u0109\5*\26\2\u0102"+
		"\u0109\5(\25\2\u0103\u0105\5&\24\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0109;\3\2\2\2"+
		"\u010a\u010b\7\n\2\2\u010b=\3\2\2\2\u010c\u010d\7\n\2\2\u010d?\3\2\2\2"+
		"\u010e\u010f\7\13\2\2\u010fA\3\2\2\2!GJWYdnptw|\u0084\u0087\u0090\u0094"+
		"\u0099\u009e\u00a4\u00aa\u00ae\u00ba\u00bf\u00c3\u00cb\u00cf\u00db\u00dd"+
		"\u00e6\u00f2\u00f4\u0106\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}