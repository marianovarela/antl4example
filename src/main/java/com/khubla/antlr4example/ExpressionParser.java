// Generated from Expression.g4 by ANTLR 4.7.1
package com.khubla.antlr4example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOWERID=1, UPPERID=2, STRING=3, NUMBER=4, DEF=5, ID=6, IF=7, THEN=8, ELIF=9, 
		ELSE=10, CASE=11, LET=12, IN=13, DEFEQ=14, SEMICOLON=15, LPAREN=16, RPAREN=17, 
		LAMBDA=18, PIPE=19, ARROW=20, AND=21, OR=22, NOT=23, EQ=24, NE=25, GE=26, 
		LE=27, GT=28, LT=29, PLUS=30, MINUS=31, TIMES=32, DIV=33, MOD=34, NL=35, 
		SPACE=36, CHAR=37;
	public static final int
		RULE_parse = 0, RULE_definicion = 1, RULE_parametros = 2, RULE_expresion = 3, 
		RULE_expresionExterna = 4, RULE_expresionIf = 5, RULE_ramasElse = 6, RULE_expresionCase = 7, 
		RULE_ramasCase = 8, RULE_ramaCase = 9, RULE_expresionLet = 10, RULE_expresionLambda = 11, 
		RULE_expresionInterna = 12, RULE_operadorBinario = 13, RULE_operadorUnario = 14, 
		RULE_expresionAplicacion = 15, RULE_expresionAtomica = 16;
	public static final String[] ruleNames = {
		"parse", "definicion", "parametros", "expresion", "expresionExterna", 
		"expresionIf", "ramasElse", "expresionCase", "ramasCase", "ramaCase", 
		"expresionLet", "expresionLambda", "expresionInterna", "operadorBinario", 
		"operadorUnario", "expresionAplicacion", "expresionAtomica"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'def'", null, "'if'", "'then'", "'elif'", 
		"'else'", "'case'", "'let'", "'in'", "'='", "';'", "'('", "')'", "'\\'", 
		"'|'", "'->'", "'&&'", "'||'", "'!'", "'=='", "'!='", "'>='", "'<='", 
		"'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LOWERID", "UPPERID", "STRING", "NUMBER", "DEF", "ID", "IF", "THEN", 
		"ELIF", "ELSE", "CASE", "LET", "IN", "DEFEQ", "SEMICOLON", "LPAREN", "RPAREN", 
		"LAMBDA", "PIPE", "ARROW", "AND", "OR", "NOT", "EQ", "NE", "GE", "LE", 
		"GT", "LT", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "NL", "SPACE", "CHAR"
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				definicion();
				setState(35);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ExpressionParser.DEF, 0); }
		public TerminalNode LOWERID() { return getToken(ExpressionParser.LOWERID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode DEFEQ() { return getToken(ExpressionParser.DEFEQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitDefinicion(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(DEF);
			setState(41);
			match(LOWERID);
			setState(42);
			parametros();
			setState(43);
			match(DEFEQ);
			setState(44);
			expresion();
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

	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode LOWERID() { return getToken(ExpressionParser.LOWERID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERID:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(LOWERID);
				setState(47);
				parametros();
				}
				break;
			case DEFEQ:
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionExternaContext expresionExterna() {
			return getRuleContext(ExpresionExternaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExpressionParser.SEMICOLON, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expresion);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				expresionExterna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				expresionExterna();
				setState(53);
				match(SEMICOLON);
				setState(54);
				expresion();
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

	public static class ExpresionExternaContext extends ParserRuleContext {
		public ExpresionIfContext expresionIf() {
			return getRuleContext(ExpresionIfContext.class,0);
		}
		public ExpresionCaseContext expresionCase() {
			return getRuleContext(ExpresionCaseContext.class,0);
		}
		public ExpresionLetContext expresionLet() {
			return getRuleContext(ExpresionLetContext.class,0);
		}
		public ExpresionLambdaContext expresionLambda() {
			return getRuleContext(ExpresionLambdaContext.class,0);
		}
		public ExpresionInternaContext expresionInterna() {
			return getRuleContext(ExpresionInternaContext.class,0);
		}
		public ExpresionExternaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionExterna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionExterna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionExterna(this);
		}
	}

	public final ExpresionExternaContext expresionExterna() throws RecognitionException {
		ExpresionExternaContext _localctx = new ExpresionExternaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expresionExterna);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expresionIf();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				expresionCase();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				expresionLet();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				expresionLambda();
				}
				break;
			case LOWERID:
			case UPPERID:
			case STRING:
			case NUMBER:
			case LPAREN:
			case NOT:
			case MINUS:
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				expresionInterna(0);
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

	public static class ExpresionIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExpressionParser.IF, 0); }
		public List<ExpresionInternaContext> expresionInterna() {
			return getRuleContexts(ExpresionInternaContext.class);
		}
		public ExpresionInternaContext expresionInterna(int i) {
			return getRuleContext(ExpresionInternaContext.class,i);
		}
		public TerminalNode THEN() { return getToken(ExpressionParser.THEN, 0); }
		public RamasElseContext ramasElse() {
			return getRuleContext(RamasElseContext.class,0);
		}
		public ExpresionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionIf(this);
		}
	}

	public final ExpresionIfContext expresionIf() throws RecognitionException {
		ExpresionIfContext _localctx = new ExpresionIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresionIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			expresionInterna(0);
			setState(67);
			match(THEN);
			setState(68);
			expresionInterna(0);
			setState(69);
			ramasElse();
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

	public static class RamasElseContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(ExpressionParser.ELIF, 0); }
		public List<ExpresionInternaContext> expresionInterna() {
			return getRuleContexts(ExpresionInternaContext.class);
		}
		public ExpresionInternaContext expresionInterna(int i) {
			return getRuleContext(ExpresionInternaContext.class,i);
		}
		public TerminalNode THEN() { return getToken(ExpressionParser.THEN, 0); }
		public RamasElseContext ramasElse() {
			return getRuleContext(RamasElseContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ExpressionParser.ELSE, 0); }
		public RamasElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramasElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRamasElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRamasElse(this);
		}
	}

	public final RamasElseContext ramasElse() throws RecognitionException {
		RamasElseContext _localctx = new RamasElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ramasElse);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ELIF);
				setState(72);
				expresionInterna(0);
				setState(73);
				match(THEN);
				setState(74);
				expresionInterna(0);
				setState(75);
				ramasElse();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(ELSE);
				setState(78);
				expresionInterna(0);
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

	public static class ExpresionCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ExpressionParser.CASE, 0); }
		public ExpresionInternaContext expresionInterna() {
			return getRuleContext(ExpresionInternaContext.class,0);
		}
		public RamasCaseContext ramasCase() {
			return getRuleContext(RamasCaseContext.class,0);
		}
		public ExpresionCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionCase(this);
		}
	}

	public final ExpresionCaseContext expresionCase() throws RecognitionException {
		ExpresionCaseContext _localctx = new ExpresionCaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresionCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(CASE);
			setState(82);
			expresionInterna(0);
			setState(83);
			ramasCase();
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

	public static class RamasCaseContext extends ParserRuleContext {
		public RamaCaseContext ramaCase() {
			return getRuleContext(RamaCaseContext.class,0);
		}
		public RamasCaseContext ramasCase() {
			return getRuleContext(RamasCaseContext.class,0);
		}
		public RamasCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramasCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRamasCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRamasCase(this);
		}
	}

	public final RamasCaseContext ramasCase() throws RecognitionException {
		RamasCaseContext _localctx = new RamasCaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ramasCase);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				ramaCase();
				setState(86);
				ramasCase();
				}
				break;
			case EOF:
			case SEMICOLON:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RamaCaseContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(ExpressionParser.PIPE, 0); }
		public TerminalNode UPPERID() { return getToken(ExpressionParser.UPPERID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ExpressionParser.ARROW, 0); }
		public ExpresionInternaContext expresionInterna() {
			return getRuleContext(ExpresionInternaContext.class,0);
		}
		public RamaCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramaCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRamaCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRamaCase(this);
		}
	}

	public final RamaCaseContext ramaCase() throws RecognitionException {
		RamaCaseContext _localctx = new RamaCaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ramaCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PIPE);
			setState(92);
			match(UPPERID);
			setState(93);
			parametros();
			setState(94);
			match(ARROW);
			setState(95);
			expresionInterna(0);
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

	public static class ExpresionLetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ExpressionParser.LET, 0); }
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode DEFEQ() { return getToken(ExpressionParser.DEFEQ, 0); }
		public ExpresionInternaContext expresionInterna() {
			return getRuleContext(ExpresionInternaContext.class,0);
		}
		public TerminalNode IN() { return getToken(ExpressionParser.IN, 0); }
		public ExpresionExternaContext expresionExterna() {
			return getRuleContext(ExpresionExternaContext.class,0);
		}
		public ExpresionLetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionLet(this);
		}
	}

	public final ExpresionLetContext expresionLet() throws RecognitionException {
		ExpresionLetContext _localctx = new ExpresionLetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresionLet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LET);
			setState(98);
			match(ID);
			setState(99);
			parametros();
			setState(100);
			match(DEFEQ);
			setState(101);
			expresionInterna(0);
			setState(102);
			match(IN);
			setState(103);
			expresionExterna();
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

	public static class ExpresionLambdaContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(ExpressionParser.LAMBDA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ExpressionParser.ARROW, 0); }
		public ExpresionExternaContext expresionExterna() {
			return getRuleContext(ExpresionExternaContext.class,0);
		}
		public ExpresionLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionLambda(this);
		}
	}

	public final ExpresionLambdaContext expresionLambda() throws RecognitionException {
		ExpresionLambdaContext _localctx = new ExpresionLambdaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresionLambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LAMBDA);
			setState(106);
			parametros();
			setState(107);
			match(ARROW);
			setState(108);
			expresionExterna();
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

	public static class ExpresionInternaContext extends ParserRuleContext {
		public ExpresionAplicacionContext expresionAplicacion() {
			return getRuleContext(ExpresionAplicacionContext.class,0);
		}
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public List<ExpresionInternaContext> expresionInterna() {
			return getRuleContexts(ExpresionInternaContext.class);
		}
		public ExpresionInternaContext expresionInterna(int i) {
			return getRuleContext(ExpresionInternaContext.class,i);
		}
		public OperadorBinarioContext operadorBinario() {
			return getRuleContext(OperadorBinarioContext.class,0);
		}
		public ExpresionInternaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionInterna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionInterna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionInterna(this);
		}
	}

	public final ExpresionInternaContext expresionInterna() throws RecognitionException {
		return expresionInterna(0);
	}

	private ExpresionInternaContext expresionInterna(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionInternaContext _localctx = new ExpresionInternaContext(_ctx, _parentState);
		ExpresionInternaContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expresionInterna, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERID:
			case UPPERID:
			case STRING:
			case NUMBER:
			case LPAREN:
			case CHAR:
				{
				setState(111);
				expresionAplicacion(0);
				}
				break;
			case NOT:
			case MINUS:
				{
				setState(112);
				operadorUnario();
				setState(113);
				expresionInterna(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionInternaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionInterna);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					operadorBinario();
					setState(119);
					expresionInterna(3);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperadorBinarioContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public TerminalNode EQ() { return getToken(ExpressionParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ExpressionParser.NE, 0); }
		public TerminalNode GE() { return getToken(ExpressionParser.GE, 0); }
		public TerminalNode LE() { return getToken(ExpressionParser.LE, 0); }
		public TerminalNode GT() { return getToken(ExpressionParser.GT, 0); }
		public TerminalNode LT() { return getToken(ExpressionParser.LT, 0); }
		public TerminalNode PLUS() { return getToken(ExpressionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpressionParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(ExpressionParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ExpressionParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ExpressionParser.MOD, 0); }
		public OperadorBinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterOperadorBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitOperadorBinario(this);
		}
	}

	public final OperadorBinarioContext operadorBinario() throws RecognitionException {
		OperadorBinarioContext _localctx = new OperadorBinarioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << EQ) | (1L << NE) | (1L << GE) | (1L << LE) | (1L << GT) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperadorUnarioContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(ExpressionParser.MINUS, 0); }
		public OperadorUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterOperadorUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitOperadorUnario(this);
		}
	}

	public final OperadorUnarioContext operadorUnario() throws RecognitionException {
		OperadorUnarioContext _localctx = new OperadorUnarioContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operadorUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ExpresionAplicacionContext extends ParserRuleContext {
		public ExpresionAtomicaContext expresionAtomica() {
			return getRuleContext(ExpresionAtomicaContext.class,0);
		}
		public ExpresionAplicacionContext expresionAplicacion() {
			return getRuleContext(ExpresionAplicacionContext.class,0);
		}
		public ExpresionAplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionAplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionAplicacion(this);
		}
	}

	public final ExpresionAplicacionContext expresionAplicacion() throws RecognitionException {
		return expresionAplicacion(0);
	}

	private ExpresionAplicacionContext expresionAplicacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionAplicacionContext _localctx = new ExpresionAplicacionContext(_ctx, _parentState);
		ExpresionAplicacionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expresionAplicacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			expresionAtomica();
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionAplicacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionAplicacion);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					expresionAtomica();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpresionAtomicaContext extends ParserRuleContext {
		public TerminalNode LOWERID() { return getToken(ExpressionParser.LOWERID, 0); }
		public TerminalNode UPPERID() { return getToken(ExpressionParser.UPPERID, 0); }
		public TerminalNode NUMBER() { return getToken(ExpressionParser.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(ExpressionParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(ExpressionParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpressionParser.RPAREN, 0); }
		public ExpresionAtomicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAtomica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpresionAtomica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpresionAtomica(this);
		}
	}

	public final ExpresionAtomicaContext expresionAtomica() throws RecognitionException {
		ExpresionAtomicaContext _localctx = new ExpresionAtomicaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresionAtomica);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(LOWERID);
				}
				break;
			case UPPERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(UPPERID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(NUMBER);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(LPAREN);
				setState(146);
				expresion();
				setState(147);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expresionInterna_sempred((ExpresionInternaContext)_localctx, predIndex);
		case 15:
			return expresionAplicacion_sempred((ExpresionAplicacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresionInterna_sempred(ExpresionInternaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresionAplicacion_sempred(ExpresionAplicacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u009a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"v\n\16\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u008a\n\21\f\21\16\21\u008d\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0098\n\22\3\22"+
		"\2\4\32 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\4\2\27\30\32"+
		"$\4\2\31\31!!\2\u0099\2(\3\2\2\2\4*\3\2\2\2\6\63\3\2\2\2\b:\3\2\2\2\n"+
		"A\3\2\2\2\fC\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26"+
		"c\3\2\2\2\30k\3\2\2\2\32u\3\2\2\2\34\u0080\3\2\2\2\36\u0082\3\2\2\2 \u0084"+
		"\3\2\2\2\"\u0097\3\2\2\2$%\5\4\3\2%&\7\2\2\3&)\3\2\2\2\')\3\2\2\2($\3"+
		"\2\2\2(\'\3\2\2\2)\3\3\2\2\2*+\7\7\2\2+,\7\3\2\2,-\5\6\4\2-.\7\20\2\2"+
		"./\5\b\5\2/\5\3\2\2\2\60\61\7\3\2\2\61\64\5\6\4\2\62\64\3\2\2\2\63\60"+
		"\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65;\5\n\6\2\66\67\5\n\6\2\678\7\21"+
		"\2\289\5\b\5\29;\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2;\t\3\2\2\2<B\5\f\7\2"+
		"=B\5\20\t\2>B\5\26\f\2?B\5\30\r\2@B\5\32\16\2A<\3\2\2\2A=\3\2\2\2A>\3"+
		"\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\7\t\2\2DE\5\32\16\2EF\7\n\2\2"+
		"FG\5\32\16\2GH\5\16\b\2H\r\3\2\2\2IJ\7\13\2\2JK\5\32\16\2KL\7\n\2\2LM"+
		"\5\32\16\2MN\5\16\b\2NR\3\2\2\2OP\7\f\2\2PR\5\32\16\2QI\3\2\2\2QO\3\2"+
		"\2\2R\17\3\2\2\2ST\7\r\2\2TU\5\32\16\2UV\5\22\n\2V\21\3\2\2\2WX\5\24\13"+
		"\2XY\5\22\n\2Y\\\3\2\2\2Z\\\3\2\2\2[W\3\2\2\2[Z\3\2\2\2\\\23\3\2\2\2]"+
		"^\7\25\2\2^_\7\4\2\2_`\5\6\4\2`a\7\26\2\2ab\5\32\16\2b\25\3\2\2\2cd\7"+
		"\16\2\2de\7\b\2\2ef\5\6\4\2fg\7\20\2\2gh\5\32\16\2hi\7\17\2\2ij\5\n\6"+
		"\2j\27\3\2\2\2kl\7\24\2\2lm\5\6\4\2mn\7\26\2\2no\5\n\6\2o\31\3\2\2\2p"+
		"q\b\16\1\2qv\5 \21\2rs\5\36\20\2st\5\32\16\3tv\3\2\2\2up\3\2\2\2ur\3\2"+
		"\2\2v}\3\2\2\2wx\f\4\2\2xy\5\34\17\2yz\5\32\16\5z|\3\2\2\2{w\3\2\2\2|"+
		"\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\33\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\35\3\2\2\2\u0082\u0083\t\3\2\2\u0083\37\3\2\2\2\u0084\u0085"+
		"\b\21\1\2\u0085\u0086\5\"\22\2\u0086\u008b\3\2\2\2\u0087\u0088\f\3\2\2"+
		"\u0088\u008a\5\"\22\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c!\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0098\7\3\2\2\u008f\u0098\7\4\2\2\u0090\u0098\7\6\2\2\u0091\u0098\7\'"+
		"\2\2\u0092\u0098\7\5\2\2\u0093\u0094\7\22\2\2\u0094\u0095\5\b\5\2\u0095"+
		"\u0096\7\23\2\2\u0096\u0098\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f\3"+
		"\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098#\3\2\2\2\f(\63:AQ[u}\u008b\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}