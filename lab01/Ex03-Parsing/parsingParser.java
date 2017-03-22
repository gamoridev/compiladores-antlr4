// Generated from parsing.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parsingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10;
	public static final int
		RULE_sentence = 0, RULE_np = 1, RULE_vp = 2, RULE_pp = 3, RULE_cn = 4, 
		RULE_cv = 5, RULE_article = 6, RULE_noun = 7, RULE_verb = 8, RULE_prep = 9;
	public static final String[] ruleNames = {
		"sentence", "np", "vp", "pp", "cn", "cv", "article", "noun", "verb", "prep"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'a'", "'the'", "'boy'", "'girl'", "'flower'", "'touches'", "'likes'", 
		"'sees'", "'with'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS"
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
	public String getGrammarFileName() { return "parsing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parsingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SentenceContext extends ParserRuleContext {
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public VpContext vp() {
			return getRuleContext(VpContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			np();
			setState(21);
			vp();
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

	public static class NpContext extends ParserRuleContext {
		public CnContext cn() {
			return getRuleContext(CnContext.class,0);
		}
		public CvContext cv() {
			return getRuleContext(CvContext.class,0);
		}
		public PpContext pp() {
			return getRuleContext(PpContext.class,0);
		}
		public NpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_np; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterNp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitNp(this);
		}
	}

	public final NpContext np() throws RecognitionException {
		NpContext _localctx = new NpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_np);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				cn();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				cv();
				setState(25);
				pp();
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

	public static class VpContext extends ParserRuleContext {
		public CvContext cv() {
			return getRuleContext(CvContext.class,0);
		}
		public PpContext pp() {
			return getRuleContext(PpContext.class,0);
		}
		public VpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterVp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitVp(this);
		}
	}

	public final VpContext vp() throws RecognitionException {
		VpContext _localctx = new VpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vp);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				cv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				cv();
				setState(31);
				pp();
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

	public static class PpContext extends ParserRuleContext {
		public PrepContext prep() {
			return getRuleContext(PrepContext.class,0);
		}
		public CnContext cn() {
			return getRuleContext(CnContext.class,0);
		}
		public PpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterPp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitPp(this);
		}
	}

	public final PpContext pp() throws RecognitionException {
		PpContext _localctx = new PpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			prep();
			setState(36);
			cn();
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

	public static class CnContext extends ParserRuleContext {
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public CnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterCn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitCn(this);
		}
	}

	public final CnContext cn() throws RecognitionException {
		CnContext _localctx = new CnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			article();
			setState(39);
			noun();
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

	public static class CvContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public CvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterCv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitCv(this);
		}
	}

	public final CvContext cv() throws RecognitionException {
		CvContext _localctx = new CvContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cv);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				verb();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				verb();
				setState(43);
				np();
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

	public static class ArticleContext extends ParserRuleContext {
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitArticle(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class NounContext extends ParserRuleContext {
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitNoun(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class PrepContext extends ParserRuleContext {
		public PrepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).enterPrep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsingListener ) ((parsingListener)listener).exitPrep(this);
		}
	}

	public final PrepContext prep() throws RecognitionException {
		PrepContext _localctx = new PrepContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__8);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\5\4$\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\60\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\3\4\3\2\5\7\3\2\b"+
		"\n\62\2\26\3\2\2\2\4\35\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f/\3"+
		"\2\2\2\16\61\3\2\2\2\20\63\3\2\2\2\22\65\3\2\2\2\24\67\3\2\2\2\26\27\5"+
		"\4\3\2\27\30\5\6\4\2\30\3\3\2\2\2\31\36\5\n\6\2\32\33\5\f\7\2\33\34\5"+
		"\b\5\2\34\36\3\2\2\2\35\31\3\2\2\2\35\32\3\2\2\2\36\5\3\2\2\2\37$\5\f"+
		"\7\2 !\5\f\7\2!\"\5\b\5\2\"$\3\2\2\2#\37\3\2\2\2# \3\2\2\2$\7\3\2\2\2"+
		"%&\5\24\13\2&\'\5\n\6\2\'\t\3\2\2\2()\5\16\b\2)*\5\20\t\2*\13\3\2\2\2"+
		"+\60\5\22\n\2,-\5\22\n\2-.\5\4\3\2.\60\3\2\2\2/+\3\2\2\2/,\3\2\2\2\60"+
		"\r\3\2\2\2\61\62\t\2\2\2\62\17\3\2\2\2\63\64\t\3\2\2\64\21\3\2\2\2\65"+
		"\66\t\4\2\2\66\23\3\2\2\2\678\7\13\2\28\25\3\2\2\2\5\35#/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}