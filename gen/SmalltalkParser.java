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
		T__0=1, T__1=2, T__2=3, NUMBER=4, DECIMAL=5, INTEGER=6, RADEX=7, EXPONENT=8, 
		IDENTIFIER=9, COMMENT=10, CHARACTER_CONSTANT=11, STRING=12, DIGIT=13, 
		LETTER=14, SPECIAL_CHARACTER=15, CHARACTER=16, COLON=17, MINUS=18, CLOSE_PAREN=19, 
		OPEN_PAREN=20, CLOSE_SQUARE=21, OPEN_SQUARE=22, PIPE=23, SINGLE_QUOTE=24, 
		DOUBLE_QUOTE=25, DOLLAR=26, HASH=27, SEPARATOR=28, ASSIGNMENT=29, COL=30, 
		ON=31;
	public static final int
		RULE_script = 0, RULE_identifier = 1, RULE_keyword = 2, RULE_variable_name = 3, 
		RULE_unary_selector = 4, RULE_binary_selector = 5, RULE_array = 6, RULE_number = 7, 
		RULE_symbol = 8, RULE_string = 9, RULE_character_constant = 10, RULE_ws = 11, 
		RULE_array_constant = 12, RULE_literal = 13, RULE_symbol_constant = 14, 
		RULE_expression = 15, RULE_primary = 16, RULE_unary_object_description = 17, 
		RULE_binary_object_description = 18, RULE_unary_expression = 19, RULE_binary_expression = 20, 
		RULE_keyword_expression = 21, RULE_message_expression = 22, RULE_cascaded_message_expression = 23, 
		RULE_statement = 24, RULE_block = 25, RULE_temporaries = 26, RULE_message_pattern = 27, 
		RULE_method = 28;
	public static final String[] ruleNames = {
		"script", "identifier", "keyword", "variable_name", "unary_selector", 
		"binary_selector", "array", "number", "symbol", "string", "character_constant", 
		"ws", "array_constant", "literal", "symbol_constant", "expression", "primary", 
		"unary_object_description", "binary_object_description", "unary_expression", 
		"binary_expression", "keyword_expression", "message_expression", "cascaded_message_expression", 
		"statement", "block", "temporaries", "message_pattern", "method"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'!'", "'.'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "':'", "'-'", "')'", "'('", "']'", "'['", 
		"'|'", "'''", "'\"'", "'$'", "'#'", null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NUMBER", "DECIMAL", "INTEGER", "RADEX", "EXPONENT", 
		"IDENTIFIER", "COMMENT", "CHARACTER_CONSTANT", "STRING", "DIGIT", "LETTER", 
		"SPECIAL_CHARACTER", "CHARACTER", "COLON", "MINUS", "CLOSE_PAREN", "OPEN_PAREN", 
		"CLOSE_SQUARE", "OPEN_SQUARE", "PIPE", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
		"DOLLAR", "HASH", "SEPARATOR", "ASSIGNMENT", "COL", "ON"
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
		public TemporariesContext temporaries() {
			return getRuleContext(TemporariesContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			temporaries();
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
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public TerminalNode COL() { return getToken(SmalltalkParser.COL, 0); }
		public TerminalNode ON() { return getToken(SmalltalkParser.ON, 0); }
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
		enterRule(_localctx, 4, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFIER);
			setState(63);
			match(COL);
			setState(64);
			match(ON);
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
		enterRule(_localctx, 6, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		enterRule(_localctx, 8, RULE_unary_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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

	public static class Binary_selectorContext extends ParserRuleContext {
		public List<TerminalNode> SPECIAL_CHARACTER() { return getTokens(SmalltalkParser.SPECIAL_CHARACTER); }
		public TerminalNode SPECIAL_CHARACTER(int i) {
			return getToken(SmalltalkParser.SPECIAL_CHARACTER, i);
		}
		public TerminalNode MINUS() { return getToken(SmalltalkParser.MINUS, 0); }
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
		enterRule(_localctx, 10, RULE_binary_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==SPECIAL_CHARACTER || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(71);
			match(SPECIAL_CHARACTER);
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
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OPEN_PAREN);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(74);
					number();
					}
					break;
				case IDENTIFIER:
				case SPECIAL_CHARACTER:
				case MINUS:
					{
					setState(75);
					symbol();
					}
					break;
				case STRING:
					{
					setState(76);
					string();
					}
					break;
				case CHARACTER_CONSTANT:
					{
					setState(77);
					character_constant();
					}
					break;
				case OPEN_PAREN:
					{
					setState(78);
					array();
					}
					break;
				case SEPARATOR:
					{
					setState(79);
					match(SEPARATOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << IDENTIFIER) | (1L << CHARACTER_CONSTANT) | (1L << STRING) | (1L << SPECIAL_CHARACTER) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << SEPARATOR))) != 0) );
			setState(84);
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
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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

	public static class SymbolContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 16, RULE_symbol);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(89); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						keyword();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(91); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(93);
				identifier();
				}
				break;
			case 3:
				{
				setState(94);
				binary_selector();
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
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 20, RULE_character_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> SEPARATOR() { return getTokens(SmalltalkParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(SmalltalkParser.SEPARATOR, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SmalltalkParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SmalltalkParser.COMMENT, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ws);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEPARATOR) {
				{
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==COMMENT || _la==SEPARATOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(106);
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
		enterRule(_localctx, 24, RULE_array_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(HASH);
			setState(108);
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

	public static class LiteralContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 26, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			number();
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
		enterRule(_localctx, 28, RULE_symbol_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(HASH);
			setState(113);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SmalltalkParser.ASSIGNMENT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Cascaded_message_expressionContext cascaded_message_expression() {
			return getRuleContext(Cascaded_message_expressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			variable_name();
			setState(116);
			match(ASSIGNMENT);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				primary();
				}
				break;
			case 2:
				{
				setState(118);
				message_expression();
				}
				break;
			case 3:
				{
				setState(119);
				cascaded_message_expression();
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

	public static class PrimaryContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SmalltalkParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SmalltalkParser.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 32, RULE_primary);
		try {
			setState(128);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				variable_name();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				literal();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(OPEN_PAREN);
				setState(125);
				expression();
				setState(126);
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

	public static class Unary_object_descriptionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Unary_object_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_object_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnary_object_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnary_object_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitUnary_object_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_object_descriptionContext unary_object_description() throws RecognitionException {
		Unary_object_descriptionContext _localctx = new Unary_object_descriptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary_object_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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

	public static class Binary_object_descriptionContext extends ParserRuleContext {
		public Binary_object_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_object_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinary_object_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinary_object_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitBinary_object_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_object_descriptionContext binary_object_description() throws RecognitionException {
		Binary_object_descriptionContext _localctx = new Binary_object_descriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binary_object_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public Unary_object_descriptionContext unary_object_description() {
			return getRuleContext(Unary_object_descriptionContext.class,0);
		}
		public Unary_selectorContext unary_selector() {
			return getRuleContext(Unary_selectorContext.class,0);
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
		enterRule(_localctx, 38, RULE_unary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			unary_object_description();
			setState(135);
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_object_descriptionContext binary_object_description() {
			return getRuleContext(Binary_object_descriptionContext.class,0);
		}
		public Binary_selectorContext binary_selector() {
			return getRuleContext(Binary_selectorContext.class,0);
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
		enterRule(_localctx, 40, RULE_binary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			binary_object_description();
			setState(138);
			binary_selector();
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
		public List<Binary_object_descriptionContext> binary_object_description() {
			return getRuleContexts(Binary_object_descriptionContext.class);
		}
		public Binary_object_descriptionContext binary_object_description(int i) {
			return getRuleContext(Binary_object_descriptionContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
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
		enterRule(_localctx, 42, RULE_keyword_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			binary_object_description();
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				keyword();
				setState(142);
				binary_object_description();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
		enterRule(_localctx, 44, RULE_message_expression);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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

	public static class Cascaded_message_expressionContext extends ParserRuleContext {
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public List<Unary_selectorContext> unary_selector() {
			return getRuleContexts(Unary_selectorContext.class);
		}
		public Unary_selectorContext unary_selector(int i) {
			return getRuleContext(Unary_selectorContext.class,i);
		}
		public List<Binary_selectorContext> binary_selector() {
			return getRuleContexts(Binary_selectorContext.class);
		}
		public Binary_selectorContext binary_selector(int i) {
			return getRuleContext(Binary_selectorContext.class,i);
		}
		public List<Unary_object_descriptionContext> unary_object_description() {
			return getRuleContexts(Unary_object_descriptionContext.class);
		}
		public Unary_object_descriptionContext unary_object_description(int i) {
			return getRuleContext(Unary_object_descriptionContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<Binary_object_descriptionContext> binary_object_description() {
			return getRuleContexts(Binary_object_descriptionContext.class);
		}
		public Binary_object_descriptionContext binary_object_description(int i) {
			return getRuleContext(Binary_object_descriptionContext.class,i);
		}
		public Cascaded_message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascaded_message_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterCascaded_message_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitCascaded_message_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitCascaded_message_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cascaded_message_expressionContext cascaded_message_expression() throws RecognitionException {
		Cascaded_message_expressionContext _localctx = new Cascaded_message_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cascaded_message_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			message_expression();
			setState(154);
			match(T__0);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(155);
					unary_selector();
					}
					break;
				case 2:
					{
					{
					setState(156);
					binary_selector();
					setState(157);
					unary_object_description();
					}
					}
					break;
				case 3:
					{
					setState(162); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(159);
							keyword();
							setState(160);
							binary_object_description();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(164); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << SPECIAL_CHARACTER) | (1L << MINUS))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmalltalkVisitor ) return ((SmalltalkVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(170);
				match(T__1);
				setState(171);
				expression();
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				expression();
				setState(173);
				match(T__2);
				setState(174);
				statement();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(SmalltalkParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(SmalltalkParser.CLOSE_SQUARE, 0); }
		public TerminalNode PIPE() { return getToken(SmalltalkParser.PIPE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPEN_SQUARE);
			setState(187);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					match(COLON);
					setState(180);
					variable_name();
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON );
				setState(185);
				match(PIPE);
				}
			}

			setState(190);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(189);
				statement();
				}
			}

			setState(192);
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

	public static class TemporariesContext extends ParserRuleContext {
		public List<TerminalNode> SEPARATOR() { return getTokens(SmalltalkParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(SmalltalkParser.SEPARATOR, i);
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
		enterRule(_localctx, 52, RULE_temporaries);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PIPE);
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(195);
					match(SEPARATOR);
					setState(196);
					variable_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(201);
			match(SEPARATOR);
			setState(202);
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
		enterRule(_localctx, 54, RULE_message_pattern);
		try {
			int _alt;
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				unary_selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				binary_selector();
				setState(206);
				variable_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(208);
						keyword();
						setState(209);
						variable_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(213); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class MethodContext extends ParserRuleContext {
		public Message_patternContext message_pattern() {
			return getRuleContext(Message_patternContext.class,0);
		}
		public TemporariesContext temporaries() {
			return getRuleContext(TemporariesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 56, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			message_pattern();
			setState(219);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(218);
				temporaries();
				}
			}

			setState(222);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(221);
				statement();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6"+
		"\bS\n\b\r\b\16\bT\3\b\3\b\3\t\3\t\3\n\6\n\\\n\n\r\n\16\n]\3\n\3\n\5\n"+
		"b\n\n\3\13\3\13\3\f\3\f\3\r\7\ri\n\r\f\r\16\rl\13\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21{\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0083\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\6\27\u0093\n\27\r\27\16\27\u0094\3\30\3"+
		"\30\3\30\5\30\u009a\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\6\31\u00a5\n\31\r\31\16\31\u00a6\6\31\u00a9\n\31\r\31\16\31\u00aa\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00b3\n\32\3\33\3\33\3\33\6\33\u00b8\n"+
		"\33\r\33\16\33\u00b9\3\33\3\33\5\33\u00be\n\33\3\33\5\33\u00c1\n\33\3"+
		"\33\3\33\3\34\3\34\3\34\6\34\u00c8\n\34\r\34\16\34\u00c9\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u00d6\n\35\r\35\16\35\u00d7\5"+
		"\35\u00da\n\35\3\36\3\36\5\36\u00de\n\36\3\36\5\36\u00e1\n\36\3\36\2\2"+
		"\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\4"+
		"\4\2\21\21\24\24\4\2\f\f\36\36\u00e4\2<\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2"+
		"\bD\3\2\2\2\nF\3\2\2\2\fH\3\2\2\2\16K\3\2\2\2\20X\3\2\2\2\22a\3\2\2\2"+
		"\24c\3\2\2\2\26e\3\2\2\2\30j\3\2\2\2\32m\3\2\2\2\34p\3\2\2\2\36r\3\2\2"+
		"\2 u\3\2\2\2\"\u0082\3\2\2\2$\u0084\3\2\2\2&\u0086\3\2\2\2(\u0088\3\2"+
		"\2\2*\u008b\3\2\2\2,\u008e\3\2\2\2.\u0099\3\2\2\2\60\u009b\3\2\2\2\62"+
		"\u00b2\3\2\2\2\64\u00b4\3\2\2\2\66\u00c4\3\2\2\28\u00d9\3\2\2\2:\u00db"+
		"\3\2\2\2<=\5\66\34\2=\3\3\2\2\2>?\7\13\2\2?\5\3\2\2\2@A\7\13\2\2AB\7 "+
		"\2\2BC\7!\2\2C\7\3\2\2\2DE\7\13\2\2E\t\3\2\2\2FG\7\13\2\2G\13\3\2\2\2"+
		"HI\t\2\2\2IJ\7\21\2\2J\r\3\2\2\2KR\7\26\2\2LS\5\20\t\2MS\5\22\n\2NS\5"+
		"\24\13\2OS\5\26\f\2PS\5\16\b\2QS\7\36\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2"+
		"\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2"+
		"\2VW\7\25\2\2W\17\3\2\2\2XY\7\6\2\2Y\21\3\2\2\2Z\\\5\6\4\2[Z\3\2\2\2\\"+
		"]\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_b\5\4\3\2`b\5\f\7\2a[\3\2\2\2"+
		"a_\3\2\2\2a`\3\2\2\2b\23\3\2\2\2cd\7\16\2\2d\25\3\2\2\2ef\7\r\2\2f\27"+
		"\3\2\2\2gi\t\3\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\31\3\2\2\2"+
		"lj\3\2\2\2mn\7\35\2\2no\5\16\b\2o\33\3\2\2\2pq\5\20\t\2q\35\3\2\2\2rs"+
		"\7\35\2\2st\5\22\n\2t\37\3\2\2\2uv\5\b\5\2vz\7\37\2\2w{\5\"\22\2x{\5."+
		"\30\2y{\5\60\31\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{!\3\2\2\2|\u0083\5\b\5"+
		"\2}\u0083\5\34\17\2~\177\7\26\2\2\177\u0080\5 \21\2\u0080\u0081\7\25\2"+
		"\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083"+
		"#\3\2\2\2\u0084\u0085\5\"\22\2\u0085%\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\'\3\2\2\2\u0088\u0089\5$\23\2\u0089\u008a\5\n\6\2\u008a)\3\2\2\2\u008b"+
		"\u008c\5&\24\2\u008c\u008d\5\f\7\2\u008d+\3\2\2\2\u008e\u0092\5&\24\2"+
		"\u008f\u0090\5\6\4\2\u0090\u0091\5&\24\2\u0091\u0093\3\2\2\2\u0092\u008f"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"-\3\2\2\2\u0096\u009a\5(\25\2\u0097\u009a\5*\26\2\u0098\u009a\5,\27\2"+
		"\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a/\3"+
		"\2\2\2\u009b\u009c\5.\30\2\u009c\u00a8\7\3\2\2\u009d\u00a9\5\n\6\2\u009e"+
		"\u009f\5\f\7\2\u009f\u00a0\5$\23\2\u00a0\u00a9\3\2\2\2\u00a1\u00a2\5\6"+
		"\4\2\u00a2\u00a3\5&\24\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u009d\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\61\3\2\2"+
		"\2\u00ac\u00ad\7\4\2\2\u00ad\u00b3\5 \21\2\u00ae\u00af\5 \21\2\u00af\u00b0"+
		"\7\5\2\2\u00b0\u00b1\5\62\32\2\u00b1\u00b3\3\2\2\2\u00b2\u00ac\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b3\63\3\2\2\2\u00b4\u00bd\7\30\2\2\u00b5\u00b6"+
		"\7\23\2\2\u00b6\u00b8\5\b\5\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\7\31\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00c0\3\2\2\2\u00bf\u00c1\5\62\32\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\65\3\2\2\2\u00c4"+
		"\u00c7\7\31\2\2\u00c5\u00c6\7\36\2\2\u00c6\u00c8\5\b\5\2\u00c7\u00c5\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7\31\2\2\u00cd\67\3\2"+
		"\2\2\u00ce\u00da\5\n\6\2\u00cf\u00d0\5\f\7\2\u00d0\u00d1\5\b\5\2\u00d1"+
		"\u00da\3\2\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\5\b\5\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00cf\3\2"+
		"\2\2\u00d9\u00d5\3\2\2\2\u00da9\3\2\2\2\u00db\u00dd\58\35\2\u00dc\u00de"+
		"\5\66\34\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2"+
		"\u00df\u00e1\5\62\32\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1;"+
		"\3\2\2\2\27RT]ajz\u0082\u0094\u0099\u00a6\u00a8\u00aa\u00b2\u00b9\u00bd"+
		"\u00c0\u00c9\u00d7\u00d9\u00dd\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}