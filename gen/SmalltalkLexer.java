// Generated from /home/michaelpollind/Desktop/smalltalk_cross_compiler/Smalltalk.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmalltalkLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "NUMBER", "DECIMAL", "INTEGER", "RADEX", "EXPONENT", "IDENTIFIER", 
		"COMMENT", "CHARACTER_CONSTANT", "STRING", "DIGIT", "LETTER", "MINUS", 
		"CLOSE_PAREN", "OPEN_PAREN", "PIPE", "COLON", "SELECTOR_CHARACTER", "CLOSE_SQUARE", 
		"OPEN_SQUARE", "SINGLE_QUOTE", "DOUBLE_QUOTE", "DOLLAR", "HASH", "SEPARATOR", 
		"ASSIGNMENT", "CHARACTER", "SEMICOLON", "PRIMATIVE", "LEFT_ARROW", "RIGHT_ARROW"
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


	public SmalltalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Smalltalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\5\4I\n\4\3\4\3\4\5\4M\n\4\3\4\5\4P\n\4\3\5\5\5"+
		"S\n\5\3\5\6\5V\n\5\r\5\16\5W\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\6\5\6a\n\6"+
		"\3\6\6\6d\n\6\r\6\16\6e\3\7\6\7i\n\7\r\7\16\7j\3\7\3\7\3\b\3\b\5\bq\n"+
		"\b\3\b\6\bt\n\b\r\b\16\bu\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\6\n\u0087\n\n\r\n\16\n\u0088\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\5\13\u0091\n\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0099\n\f\r\f\16"+
		"\f\u009a\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\6\33\u00bc\n\33\r\33\16\33\u00bd\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\5\35\u00c8\n\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\2\2\"\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\6\3\2"+
		"\62;\4\2C\\c|\n\2##\'(,.\61\61>B^^~~\u0080\u0080\5\2\13\f\17\17\"\"\u00f2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7H\3\2\2"+
		"\2\tR\3\2\2\2\13`\3\2\2\2\rh\3\2\2\2\17n\3\2\2\2\21w\3\2\2\2\23\177\3"+
		"\2\2\2\25\u008c\3\2\2\2\27\u0092\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2"+
		"\2\2\35\u00a2\3\2\2\2\37\u00a4\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%"+
		"\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3"+
		"\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2\2\65\u00bb\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00c7\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00d6"+
		"\3\2\2\2A\u00d8\3\2\2\2CD\7\60\2\2D\4\3\2\2\2EF\7`\2\2F\6\3\2\2\2GI\5"+
		"\r\7\2HG\3\2\2\2HI\3\2\2\2IL\3\2\2\2JM\5\t\5\2KM\5\13\6\2LJ\3\2\2\2LK"+
		"\3\2\2\2MO\3\2\2\2NP\5\17\b\2ON\3\2\2\2OP\3\2\2\2P\b\3\2\2\2QS\7/\2\2"+
		"RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\31\r\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XY\3\2\2\2Y[\7\60\2\2Z\\\5\31\r\2[Z\3\2\2\2\\]\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^\n\3\2\2\2_a\7/\2\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5"+
		"\31\r\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\f\3\2\2\2gi\5\31\r\2"+
		"hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7t\2\2m\16\3\2\2"+
		"\2np\7g\2\2oq\7/\2\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\31\r\2sr\3\2\2"+
		"\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\20\3\2\2\2w|\5\33\16\2x{\5\33\16\2y"+
		"{\5\31\r\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\22\3\2\2"+
		"\2~|\3\2\2\2\177\u0086\5/\30\2\u0080\u0087\59\35\2\u0081\u0082\5/\30\2"+
		"\u0082\u0083\5/\30\2\u0083\u0087\3\2\2\2\u0084\u0087\5-\27\2\u0085\u0087"+
		"\5\65\33\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5/\30\2\u008b\24\3\2\2\2\u008c"+
		"\u0090\5\61\31\2\u008d\u0091\59\35\2\u008e\u0091\5-\27\2\u008f\u0091\5"+
		"/\30\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0098\5-\27\2\u0093\u0099\59\35\2\u0094\u0095\5-\27"+
		"\2\u0095\u0096\5-\27\2\u0096\u0099\3\2\2\2\u0097\u0099\5/\30\2\u0098\u0093"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\5-"+
		"\27\2\u009d\30\3\2\2\2\u009e\u009f\t\2\2\2\u009f\32\3\2\2\2\u00a0\u00a1"+
		"\t\3\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3\36\3\2\2\2\u00a4\u00a5"+
		"\7+\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7*\2\2\u00a7\"\3\2\2\2\u00a8\u00a9"+
		"\7~\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab&\3\2\2\2\u00ac\u00ad\t"+
		"\4\2\2\u00ad(\3\2\2\2\u00ae\u00af\7_\2\2\u00af*\3\2\2\2\u00b0\u00b1\7"+
		"]\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7$"+
		"\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7&\2\2\u00b7\62\3\2\2\2\u00b8\u00b9"+
		"\7%\2\2\u00b9\64\3\2\2\2\u00ba\u00bc\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\b\33\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2\u00c3"+
		"\7?\2\2\u00c38\3\2\2\2\u00c4\u00c8\5\'\24\2\u00c5\u00c8\5\31\r\2\u00c6"+
		"\u00c8\5\33\16\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7=\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7"+
		"r\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7x\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7<\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9B\3\2\2\2\27\2HLORW]`ejpuz|\u0086\u0088"+
		"\u0090\u0098\u009a\u00bd\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}