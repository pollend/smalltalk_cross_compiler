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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUMBER=6, DECIMAL=7, INTEGER=8, 
		RADEX=9, EXPONENT=10, IDENTIFIER=11, COMMENT=12, CHARACTER_CONSTANT=13, 
		STRING=14, DIGIT=15, LETTER=16, COLON=17, MINUS=18, CLOSE_PAREN=19, OPEN_PAREN=20, 
		CLOSE_SQUARE=21, OPEN_SQUARE=22, PIPE=23, SINGLE_QUOTE=24, DOUBLE_QUOTE=25, 
		DOLLAR=26, HASH=27, SEPARATOR=28, ASSIGNMENT=29, SELECTOR_CHARACTER=30, 
		CHARACTER=31, SEMICOLON=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "NUMBER", "DECIMAL", "INTEGER", 
		"RADEX", "EXPONENT", "IDENTIFIER", "COMMENT", "CHARACTER_CONSTANT", "STRING", 
		"DIGIT", "LETTER", "COLON", "MINUS", "CLOSE_PAREN", "OPEN_PAREN", "CLOSE_SQUARE", 
		"OPEN_SQUARE", "PIPE", "SINGLE_QUOTE", "DOUBLE_QUOTE", "DOLLAR", "HASH", 
		"SEPARATOR", "ASSIGNMENT", "SELECTOR_CHARACTER", "CHARACTER", "SEMICOLON"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'primitive:'", "'>'", "'.'", "'^'", null, null, null, null, 
		null, null, null, null, null, null, null, "':'", "'-'", "')'", "'('", 
		"']'", "'['", "'|'", "'''", "'\"'", "'$'", "'#'", null, "':='", null, 
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "NUMBER", "DECIMAL", "INTEGER", "RADEX", 
		"EXPONENT", "IDENTIFIER", "COMMENT", "CHARACTER_CONSTANT", "STRING", "DIGIT", 
		"LETTER", "COLON", "MINUS", "CLOSE_PAREN", "OPEN_PAREN", "CLOSE_SQUARE", 
		"OPEN_SQUARE", "PIPE", "SINGLE_QUOTE", "DOUBLE_QUOTE", "DOLLAR", "HASH", 
		"SEPARATOR", "ASSIGNMENT", "SELECTOR_CHARACTER", "CHARACTER", "SEMICOLON"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\5\7X\n\7\3\7\3\7\5\7\\\n\7\3\7\5\7_\n\7\3\b\5\bb\n\b\3"+
		"\b\6\be\n\b\r\b\16\bf\3\b\3\b\6\bk\n\b\r\b\16\bl\3\t\5\tp\n\t\3\t\6\t"+
		"s\n\t\r\t\16\tt\3\n\6\nx\n\n\r\n\16\ny\3\n\3\n\3\13\3\13\5\13\u0080\n"+
		"\13\3\13\6\13\u0083\n\13\r\13\16\13\u0084\3\f\3\f\3\f\6\f\u008a\n\f\r"+
		"\f\16\f\u008b\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0094\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u009c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00a4\n"+
		"\17\r\17\16\17\u00a5\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \5 \u00ce"+
		"\n \3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"\3\2\6\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\n\2"+
		"##\'(,.\61\61>B^^~~\u0080\u0080\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7P\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2\rW\3\2"+
		"\2\2\17a\3\2\2\2\21o\3\2\2\2\23w\3\2\2\2\25}\3\2\2\2\27\u0086\3\2\2\2"+
		"\31\u008d\3\2\2\2\33\u0097\3\2\2\2\35\u009d\3\2\2\2\37\u00a9\3\2\2\2!"+
		"\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3"+
		"\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63"+
		"\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2CD\7>\2\2D\4\3\2"+
		"\2\2EF\7r\2\2FG\7t\2\2GH\7k\2\2HI\7o\2\2IJ\7k\2\2JK\7v\2\2KL\7k\2\2LM"+
		"\7x\2\2MN\7g\2\2NO\7<\2\2O\6\3\2\2\2PQ\7@\2\2Q\b\3\2\2\2RS\7\60\2\2S\n"+
		"\3\2\2\2TU\7`\2\2U\f\3\2\2\2VX\5\23\n\2WV\3\2\2\2WX\3\2\2\2X[\3\2\2\2"+
		"Y\\\5\17\b\2Z\\\5\21\t\2[Y\3\2\2\2[Z\3\2\2\2\\^\3\2\2\2]_\5\25\13\2^]"+
		"\3\2\2\2^_\3\2\2\2_\16\3\2\2\2`b\7/\2\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"ce\5\37\20\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\7\60"+
		"\2\2ik\5\37\20\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\20\3\2\2\2n"+
		"p\7/\2\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\5\37\20\2rq\3\2\2\2st\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2u\22\3\2\2\2vx\5\37\20\2wv\3\2\2\2xy\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z{\3\2\2\2{|\7t\2\2|\24\3\2\2\2}\177\7g\2\2~\u0080\7/\2"+
		"\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\37"+
		"\20\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\26\3\2\2\2\u0086\u0089\5!\21\2\u0087\u008a\5!\21"+
		"\2\u0088\u008a\5\37\20\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\30\3\2\2"+
		"\2\u008d\u0093\5\63\32\2\u008e\u0094\5? \2\u008f\u0090\5\63\32\2\u0090"+
		"\u0091\5\63\32\2\u0091\u0094\3\2\2\2\u0092\u0094\5\61\31\2\u0093\u008e"+
		"\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\5\63\32\2\u0096\32\3\2\2\2\u0097\u009b\5\65\33\2\u0098\u009c\5"+
		"? \2\u0099\u009c\5\61\31\2\u009a\u009c\5\63\32\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\34\3\2\2\2\u009d\u00a3\5\61\31"+
		"\2\u009e\u00a4\5? \2\u009f\u00a0\5\61\31\2\u00a0\u00a1\5\61\31\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a4\5\63\32\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3"+
		"\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\61\31\2\u00a8\36\3\2"+
		"\2\2\u00a9\u00aa\t\2\2\2\u00aa \3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac\"\3"+
		"\2\2\2\u00ad\u00ae\7<\2\2\u00ae$\3\2\2\2\u00af\u00b0\7/\2\2\u00b0&\3\2"+
		"\2\2\u00b1\u00b2\7+\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4*\3\2\2"+
		"\2\u00b5\u00b6\7_\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7]\2\2\u00b8.\3\2\2\2"+
		"\u00b9\u00ba\7~\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc\62\3\2\2"+
		"\2\u00bd\u00be\7$\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\66\3\2"+
		"\2\2\u00c1\u00c2\7%\2\2\u00c28\3\2\2\2\u00c3\u00c4\t\4\2\2\u00c4:\3\2"+
		"\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c7\7?\2\2\u00c7<\3\2\2\2\u00c8\u00c9"+
		"\t\5\2\2\u00c9>\3\2\2\2\u00ca\u00ce\5=\37\2\u00cb\u00ce\5\37\20\2\u00cc"+
		"\u00ce\5!\21\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7=\2\2\u00d0B\3\2\2\2\25\2W[^afloty\177"+
		"\u0084\u0089\u008b\u0093\u009b\u00a3\u00a5\u00cd\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}