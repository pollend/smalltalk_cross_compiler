package main.gen;// Generated from /home/michaelpollind/Desktop/smalltalk_cross_compiler/Smalltalk.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmalltalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CARET=2, PRIMATIVE=3, NUMBER=4, IDENTIFIER=5, COMMENT=6, CHARACTER_CONSTANT=7, 
		STRING=8, DIGIT=9, DIGITS=10, BIG_DIGITS=11, BIG_DIGIT=12, LETTER=13, 
		MINUS=14, CLOSE_PAREN=15, OPEN_PAREN=16, PIPE=17, COLON=18, SELECTOR_CHARACTER=19, 
		CLOSE_SQUARE=20, OPEN_SQUARE=21, SINGLE_QUOTE=22, DOUBLE_QUOTE=23, DOLLAR=24, 
		HASH=25, SEPARATOR=26, ASSIGNMENT=27, CHARACTER=28, SEMICOLON=29, LEFT_ARROW=30, 
		RIGHT_ARROW=31;
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
		null, "'.'", "'^'", "'primitive'", null, null, null, null, null, null, 
		null, null, null, null, "'-'", "')'", "'('", "'|'", "':'", null, "']'", 
		"'['", "'''", "'\"'", "'$'", "'#'", null, "':='", null, "';'", "'<'", 
		"'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "CARET", "PRIMATIVE", "NUMBER", "IDENTIFIER", "COMMENT", "CHARACTER_CONSTANT", 
		"STRING", "DIGIT", "DIGITS", "BIG_DIGITS", "BIG_DIGIT", "LETTER", "MINUS", 
		"CLOSE_PAREN", "OPEN_PAREN", "PIPE", "COLON", "SELECTOR_CHARACTER", "CLOSE_SQUARE", 
		"OPEN_SQUARE", "SINGLE_QUOTE", "DOUBLE_QUOTE", "DOLLAR", "HASH", "SEPARATOR", 
		"ASSIGNMENT", "CHARACTER", "SEMICOLON", "LEFT_ARROW", "RIGHT_ARROW"
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
		public TerminalNode EOF() { return getToken(SmalltalkParser.EOF, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<TemporariesContext> temporaries() {
			return getRuleContexts(TemporariesContext.class);
		}
		public TemporariesContext temporaries(int i) {
			return getRuleContext(TemporariesContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << IDENTIFIER) | (1L << COMMENT) | (1L << CHARACTER_CONSTANT) | (1L << STRING) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << PIPE) | (1L << SELECTOR_CHARACTER) | (1L << OPEN_SQUARE) | (1L << HASH))) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					method();
					}
					break;
				case 2:
					{
					setState(65);
					expression();
					setState(66);
					match(T__0);
					}
					break;
				case 3:
					{
					setState(68);
					comment();
					}
					break;
				case 4:
					{
					setState(69);
					temporaries();
					}
					break;
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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
			setState(77);
			message_pattern();
			setState(79);
			_la = _input.LA(1);
			if (_la==LEFT_ARROW) {
				{
				setState(78);
				primitive_number();
				}
			}

			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81);
				temporaries();
				}
				break;
			}
			setState(84);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				unary_selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				binary_selector();
				setState(88);
				variable_name();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(90);
						keyword();
						setState(91);
						variable_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(95); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode COLON() { return getToken(SmalltalkParser.COLON, 0); }
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
			setState(99);
			match(LEFT_ARROW);
			setState(100);
			match(PRIMATIVE);
			setState(101);
			match(COLON);
			setState(102);
			number();
			setState(103);
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
			setState(105);
			match(PIPE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(106);
				variable_name();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<TemporariesContext> temporaries() {
			return getRuleContexts(TemporariesContext.class);
		}
		public TemporariesContext temporaries(int i) {
			return getRuleContext(TemporariesContext.class,i);
		}
		public TerminalNode CARET() { return getToken(SmalltalkParser.CARET, 0); }
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
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(119);
					switch (_input.LA(1)) {
					case NUMBER:
					case IDENTIFIER:
					case CHARACTER_CONSTANT:
					case STRING:
					case OPEN_PAREN:
					case OPEN_SQUARE:
					case HASH:
						{
						setState(114);
						expression();
						setState(115);
						match(T__0);
						}
						break;
					case COMMENT:
						{
						setState(117);
						comment();
						}
						break;
					case PIPE:
						{
						setState(118);
						temporaries();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(125);
				_la = _input.LA(1);
				if (_la==CARET) {
					{
					setState(124);
					match(CARET);
					}
				}

				setState(127);
				expression();
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(130);
				variable_name();
				setState(131);
				match(ASSIGNMENT);
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(135);
				primary();
				}
				break;
			case 2:
				{
				setState(136);
				message_expression();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(137);
					match(SEMICOLON);
					setState(138);
					cascade_message();
					}
					}
					setState(143);
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
			setState(153);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				variable_name();
				}
				break;
			case NUMBER:
			case CHARACTER_CONSTANT:
			case STRING:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				literal();
				}
				break;
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				block();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(OPEN_PAREN);
				setState(150);
				expression();
				setState(151);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				unit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				binary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				unary_message();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				binary_message();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
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
			setState(169);
			unit();
			setState(171); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(170);
					unary_message();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			primary();
			setState(177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176);
					binary_message();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(181);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(182);
				primary();
				}
				break;
			}
			setState(185);
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
			setState(187);
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
			setState(189);
			binary_selector();
			setState(190);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			keyword();
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(193);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(194);
				primary();
				}
				break;
			}
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					keyword();
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(198);
						binary_expression();
						}
						break;
					case 2:
						{
						setState(199);
						primary();
						}
						break;
					}
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(207);
			match(OPEN_SQUARE);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(208);
					match(COLON);
					setState(209);
					variable_name();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(PIPE);
				}
				break;
			}
			setState(218);
			expression_series();
			setState(219);
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
			setState(221);
			match(IDENTIFIER);
			setState(222);
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
			setState(230);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(MINUS);
				}
				break;
			case SELECTOR_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						match(SELECTOR_CHARACTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(228); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(232);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				character_constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				symbol_constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
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
			setState(241);
			match(HASH);
			setState(242);
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
			setState(244);
			match(OPEN_PAREN);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(251);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(245);
					number();
					}
					break;
				case IDENTIFIER:
				case MINUS:
				case SELECTOR_CHARACTER:
					{
					setState(246);
					symbol();
					}
					break;
				case STRING:
					{
					setState(247);
					string();
					}
					break;
				case CHARACTER_CONSTANT:
					{
					setState(248);
					character_constant();
					}
					break;
				case OPEN_PAREN:
					{
					setState(249);
					array();
					}
					break;
				case SEPARATOR:
					{
					setState(250);
					match(SEPARATOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << IDENTIFIER) | (1L << CHARACTER_CONSTANT) | (1L << STRING) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << SELECTOR_CHARACTER) | (1L << SEPARATOR))) != 0) );
			setState(255);
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
			setState(257);
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
			setState(259);
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
			setState(261);
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
			setState(263);
			match(HASH);
			setState(264);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				unary_selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				binary_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(268);
						keyword();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(271); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(275);
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
			setState(277);
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
			setState(279);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3\3\3\5"+
		"\3R\n\3\3\3\5\3U\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4`\n\4\r\4"+
		"\16\4a\5\4d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\5\7\u0080\n"+
		"\7\3\7\5\7\u0083\n\7\3\b\3\b\3\b\5\b\u0088\n\b\3\b\3\b\3\b\3\b\7\b\u008e"+
		"\n\b\f\b\16\b\u0091\13\b\5\b\u0093\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009c\n\t\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3"+
		"\f\3\f\5\f\u00aa\n\f\3\r\3\r\6\r\u00ae\n\r\r\r\16\r\u00af\3\16\3\16\6"+
		"\16\u00b4\n\16\r\16\16\16\u00b5\3\17\3\17\5\17\u00ba\n\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00c6\n\22\3\22\3\22\3\22"+
		"\5\22\u00cb\n\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\23\3\23\3\23"+
		"\7\23\u00d5\n\23\f\23\16\23\u00d8\13\23\3\23\5\23\u00db\n\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\6\25\u00e5\n\25\r\25\16\25\u00e6\5\25\u00e9"+
		"\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00f2\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u00fe\n\31\r\31\16\31\u00ff\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\6"+
		"\36\u0110\n\36\r\36\16\36\u0111\5\36\u0114\n\36\3\37\3\37\3 \3 \3!\3!"+
		"\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@\2\2\u012c\2J\3\2\2\2\4O\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\nk\3\2\2\2"+
		"\f{\3\2\2\2\16\u0087\3\2\2\2\20\u009b\3\2\2\2\22\u009f\3\2\2\2\24\u00a4"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2\2\32\u00b1\3\2\2\2\34\u00b9\3"+
		"\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2\2\2\"\u00c2\3\2\2\2$\u00d1\3\2\2\2"+
		"&\u00df\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,\u00f1\3\2\2\2.\u00f3\3"+
		"\2\2\2\60\u00f6\3\2\2\2\62\u0103\3\2\2\2\64\u0105\3\2\2\2\66\u0107\3\2"+
		"\2\28\u0109\3\2\2\2:\u0113\3\2\2\2<\u0115\3\2\2\2>\u0117\3\2\2\2@\u0119"+
		"\3\2\2\2BI\5\4\3\2CD\5\16\b\2DE\7\3\2\2EI\3\2\2\2FI\5@!\2GI\5\n\6\2HB"+
		"\3\2\2\2HC\3\2\2\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K"+
		"M\3\2\2\2LJ\3\2\2\2MN\7\2\2\3N\3\3\2\2\2OQ\5\6\4\2PR\5\b\5\2QP\3\2\2\2"+
		"QR\3\2\2\2RT\3\2\2\2SU\5\n\6\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\f\7\2"+
		"W\5\3\2\2\2Xd\5*\26\2YZ\5(\25\2Z[\5> \2[d\3\2\2\2\\]\5&\24\2]^\5> \2^"+
		"`\3\2\2\2_\\\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2cX\3\2\2\2"+
		"cY\3\2\2\2c_\3\2\2\2d\7\3\2\2\2ef\7 \2\2fg\7\5\2\2gh\7\24\2\2hi\5\62\32"+
		"\2ij\7!\2\2j\t\3\2\2\2ko\7\23\2\2ln\5> \2ml\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\23\2\2s\13\3\2\2\2tu\5\16\b\2uv\7"+
		"\3\2\2vz\3\2\2\2wz\5@!\2xz\5\n\6\2yt\3\2\2\2yw\3\2\2\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|\u0082\3\2\2\2}{\3\2\2\2~\u0080\7\4\2\2\177~"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\5\16\b\2\u0082"+
		"\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085\5> \2\u0085"+
		"\u0086\7\35\2\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0092\3\2\2\2\u0089\u0093\5\22\n\2\u008a\u008f\5\24\13\2"+
		"\u008b\u008c\7\37\2\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0093\17\3\2\2"+
		"\2\u0094\u009c\5> \2\u0095\u009c\5,\27\2\u0096\u009c\5$\23\2\u0097\u0098"+
		"\7\22\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7\21\2\2\u009a\u009c\3\2\2"+
		"\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097"+
		"\3\2\2\2\u009c\21\3\2\2\2\u009d\u00a0\5\20\t\2\u009e\u00a0\5\30\r\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a5\5\30\r"+
		"\2\u00a2\u00a5\5\32\16\2\u00a3\u00a5\5\34\17\2\u00a4\u00a1\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00aa\5\36\20"+
		"\2\u00a7\u00aa\5 \21\2\u00a8\u00aa\5\"\22\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ad\5\20\t"+
		"\2\u00ac\u00ae\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b3\5\22\n"+
		"\2\u00b2\u00b4\5 \21\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00ba\5\32\16\2\u00b8"+
		"\u00ba\5\22\n\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00bc\5\"\22\2\u00bc\35\3\2\2\2\u00bd\u00be\5*\26\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\5\22\n\2\u00c1!\3\2\2\2\u00c2"+
		"\u00c5\5&\24\2\u00c3\u00c6\5\32\16\2\u00c4\u00c6\5\22\n\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00ce\3\2\2\2\u00c7\u00ca\5&\24\2\u00c8"+
		"\u00cb\5\32\16\2\u00c9\u00cb\5\22\n\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf#\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d1\u00da\7\27\2\2\u00d2\u00d3\7\24\2\2\u00d3\u00d5\5> \2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\23\2\2\u00da\u00d6\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\f\7\2\u00dd"+
		"\u00de\7\26\2\2\u00de%\3\2\2\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\7\24\2"+
		"\2\u00e1\'\3\2\2\2\u00e2\u00e9\7\20\2\2\u00e3\u00e5\7\25\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9)\3\2\2\2"+
		"\u00ea\u00eb\7\7\2\2\u00eb+\3\2\2\2\u00ec\u00f2\5\62\32\2\u00ed\u00f2"+
		"\5\64\33\2\u00ee\u00f2\5\66\34\2\u00ef\u00f2\58\35\2\u00f0\u00f2\5.\30"+
		"\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2-\3\2\2\2\u00f3\u00f4\7\33\2\2\u00f4"+
		"\u00f5\5\60\31\2\u00f5/\3\2\2\2\u00f6\u00fd\7\22\2\2\u00f7\u00fe\5\62"+
		"\32\2\u00f8\u00fe\5:\36\2\u00f9\u00fe\5\64\33\2\u00fa\u00fe\5\66\34\2"+
		"\u00fb\u00fe\5\60\31\2\u00fc\u00fe\7\34\2\2\u00fd\u00f7\3\2\2\2\u00fd"+
		"\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\21\2\2\u0102\61\3\2\2"+
		"\2\u0103\u0104\7\6\2\2\u0104\63\3\2\2\2\u0105\u0106\7\n\2\2\u0106\65\3"+
		"\2\2\2\u0107\u0108\7\t\2\2\u0108\67\3\2\2\2\u0109\u010a\7\33\2\2\u010a"+
		"\u010b\5:\36\2\u010b9\3\2\2\2\u010c\u0114\5*\26\2\u010d\u0114\5(\25\2"+
		"\u010e\u0110\5&\24\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u010c\3\2\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u010f\3\2\2\2\u0114;\3\2\2\2\u0115\u0116\7\7\2\2"+
		"\u0116=\3\2\2\2\u0117\u0118\7\7\2\2\u0118?\3\2\2\2\u0119\u011a\7\b\2\2"+
		"\u011aA\3\2\2\2#HJQTacoy{\177\u0082\u0087\u008f\u0092\u009b\u009f\u00a4"+
		"\u00a9\u00af\u00b5\u00b9\u00c5\u00ca\u00ce\u00d6\u00da\u00e6\u00e8\u00f1"+
		"\u00fd\u00ff\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}