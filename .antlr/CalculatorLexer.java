// Generated from c:/Users/valer/OneDrive/Escritorio/vale/sintaxis/53776/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, PRINTF=2, CERO=3, UNO=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		SEMI=9, COMILLA=10, LETRA=11, DIGITO=12, ESPACIO=13, SIMBOLO=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "PRINTF", "CERO", "UNO", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"SEMI", "COMILLA", "LETRA", "DIGITO", "ESPACIO", "SIMBOLO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'printf'", "'0'", "'1'", "'('", "')'", "'{'", "'}'", 
			"';'", "'\"'", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "PRINTF", "CERO", "UNO", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COMILLA", "LETRA", "DIGITO", "ESPACIO", "SIMBOLO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000fK\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000eF\b\u000e"+
		"\u000b\u000e\f\u000eG\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0006\u0000!!,"+
		",..:;??__\u0002\u0000\t\n\r\rK\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001"+
		"\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000"+
		"\u0000\u0007.\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b"+
		"2\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000f6\u0001\u0000"+
		"\u0000\u0000\u00118\u0001\u0000\u0000\u0000\u0013:\u0001\u0000\u0000\u0000"+
		"\u0015<\u0001\u0000\u0000\u0000\u0017>\u0001\u0000\u0000\u0000\u0019@"+
		"\u0001\u0000\u0000\u0000\u001bB\u0001\u0000\u0000\u0000\u001dE\u0001\u0000"+
		"\u0000\u0000\u001f \u0005w\u0000\u0000 !\u0005h\u0000\u0000!\"\u0005i"+
		"\u0000\u0000\"#\u0005l\u0000\u0000#$\u0005e\u0000\u0000$\u0002\u0001\u0000"+
		"\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005r\u0000\u0000\'(\u0005i\u0000"+
		"\u0000()\u0005n\u0000\u0000)*\u0005t\u0000\u0000*+\u0005f\u0000\u0000"+
		"+\u0004\u0001\u0000\u0000\u0000,-\u00050\u0000\u0000-\u0006\u0001\u0000"+
		"\u0000\u0000./\u00051\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005("+
		"\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005)\u0000\u00003\f\u0001"+
		"\u0000\u0000\u000045\u0005{\u0000\u00005\u000e\u0001\u0000\u0000\u0000"+
		"67\u0005}\u0000\u00007\u0010\u0001\u0000\u0000\u000089\u0005;\u0000\u0000"+
		"9\u0012\u0001\u0000\u0000\u0000:;\u0005\"\u0000\u0000;\u0014\u0001\u0000"+
		"\u0000\u0000<=\u0007\u0000\u0000\u0000=\u0016\u0001\u0000\u0000\u0000"+
		">?\u0007\u0001\u0000\u0000?\u0018\u0001\u0000\u0000\u0000@A\u0005 \u0000"+
		"\u0000A\u001a\u0001\u0000\u0000\u0000BC\u0007\u0002\u0000\u0000C\u001c"+
		"\u0001\u0000\u0000\u0000DF\u0007\u0003\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u000e\u0000\u0000J\u001e"+
		"\u0001\u0000\u0000\u0000\u0002\u0000G\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}