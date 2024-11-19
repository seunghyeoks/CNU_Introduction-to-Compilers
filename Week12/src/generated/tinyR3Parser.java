// Generated from /Users/BookShelf/WorkSpace/CNU/Introduction-to-Compilers/Week12/src/tinyR3.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class tinyR3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, FUNC=21, U32=22, RETURN=23, LET=24, MUT=25, 
		OR=26, AND=27, LE=28, GE=29, EQ=30, NE=31, ID=32, LITERAL=33, LIT_INT=34, 
		LIT_STR=35, DecimalConstant=36, OctalConstant=37, HexadecimalConstant=38, 
		NilConstant=39, WildCardConstant=40, WS=41;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_main_decl = 2, RULE_type_spec = 3, 
		RULE_compound_stmt = 4, RULE_local_decl = 5, RULE_dec_spec = 6, RULE_val = 7, 
		RULE_stmt = 8, RULE_expr_stmt = 9, RULE_expr = 10, RULE_additive_expr = 11, 
		RULE_multiplicative_expr = 12, RULE_unary_expr = 13, RULE_factor = 14, 
		RULE_print_stmt = 15, RULE_return_stmt = 16, RULE_args = 17, RULE_literal = 18, 
		RULE_id = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "main_decl", "type_spec", "compound_stmt", "local_decl", 
			"dec_spec", "val", "stmt", "expr_stmt", "expr", "additive_expr", "multiplicative_expr", 
			"unary_expr", "factor", "print_stmt", "return_stmt", "args", "literal", 
			"id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'()'", "'{'", "'}'", "':'", "'='", "';'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'--'", "'++'", "'('", "')'", "'!'", "'println!'", 
			"'\"{}\"'", "','", "'fn'", "'u32'", "'return'", "'let'", "'mut'", "'||'", 
			"'&&'", "'<='", "'>='", "'=='", "'!='", null, null, null, null, null, 
			null, null, null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "FUNC", "U32", 
			"RETURN", "LET", "MUT", "OR", "AND", "LE", "GE", "EQ", "NE", "ID", "LITERAL", 
			"LIT_INT", "LIT_STR", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
			"NilConstant", "WildCardConstant", "WS"
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

	@Override
	public String getGrammarFileName() { return "tinyR3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tinyR3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				decl();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Main_declContext main_decl() {
			return getRuleContext(Main_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			main_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_declContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(tinyR3Parser.FUNC, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Main_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterMain_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitMain_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitMain_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_declContext main_decl() throws RecognitionException {
		Main_declContext _localctx = new Main_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(FUNC);
			setState(48);
			match(T__0);
			setState(49);
			match(T__1);
			setState(50);
			compound_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode U32() { return getToken(tinyR3Parser.U32, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitType_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitType_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(U32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET) {
				{
				{
				setState(55);
				local_decl();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12893609992L) != 0)) {
				{
				{
				setState(61);
				stmt();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Local_declContext extends ParserRuleContext {
		public Dec_specContext dec_spec() {
			return getRuleContext(Dec_specContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitLocal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitLocal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_local_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			dec_spec();
			setState(70);
			id();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(71);
				match(T__4);
				setState(72);
				type_spec();
				}
			}

			setState(75);
			match(T__5);
			setState(76);
			val();
			setState(77);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_specContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(tinyR3Parser.LET, 0); }
		public TerminalNode MUT() { return getToken(tinyR3Parser.MUT, 0); }
		public Dec_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterDec_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitDec_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitDec_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_specContext dec_spec() throws RecognitionException {
		Dec_specContext _localctx = new Dec_specContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LET);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUT) {
				{
				setState(80);
				match(MUT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_val);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case ID:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				expr_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				compound_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				return_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				print_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expr();
			setState(94);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Additive_exprContext additive_expr() {
			return getRuleContext(Additive_exprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				additive_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				id();
				setState(98);
				match(T__5);
				setState(99);
				expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Additive_exprContext extends ParserRuleContext {
		public Additive_exprContext left;
		public Token op;
		public Multiplicative_exprContext right;
		public Multiplicative_exprContext multiplicative_expr() {
			return getRuleContext(Multiplicative_exprContext.class,0);
		}
		public Additive_exprContext additive_expr() {
			return getRuleContext(Additive_exprContext.class,0);
		}
		public Additive_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterAdditive_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitAdditive_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitAdditive_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_exprContext additive_expr() throws RecognitionException {
		return additive_expr(0);
	}

	private Additive_exprContext additive_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_exprContext _localctx = new Additive_exprContext(_ctx, _parentState);
		Additive_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_additive_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			multiplicative_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Additive_exprContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_additive_expr);
					setState(106);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(107);
					((Additive_exprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__8) ) {
						((Additive_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(108);
					((Additive_exprContext)_localctx).right = multiplicative_expr(0);
					}
					} 
				}
				setState(113);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_exprContext extends ParserRuleContext {
		public Multiplicative_exprContext left;
		public Token op;
		public Unary_exprContext right;
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Multiplicative_exprContext multiplicative_expr() {
			return getRuleContext(Multiplicative_exprContext.class,0);
		}
		public Multiplicative_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterMultiplicative_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitMultiplicative_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitMultiplicative_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_exprContext multiplicative_expr() throws RecognitionException {
		return multiplicative_expr(0);
	}

	private Multiplicative_exprContext multiplicative_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_exprContext _localctx = new Multiplicative_exprContext(_ctx, _parentState);
		Multiplicative_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_multiplicative_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			unary_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Multiplicative_exprContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expr);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					((Multiplicative_exprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
						((Multiplicative_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(119);
					((Multiplicative_exprContext)_localctx).right = unary_expr();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_exprContext extends ParserRuleContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_expr);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((Unary_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
					((Unary_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				expr();
				}
				break;
			case T__14:
			case ID:
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				factor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL:
					{
					setState(130);
					literal();
					}
					break;
				case ID:
					{
					setState(131);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__14);
				setState(135);
				expr();
				setState(136);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				id();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(139);
					match(T__16);
					}
				}

				setState(142);
				match(T__14);
				setState(143);
				args();
				setState(144);
				match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__17);
			setState(149);
			match(T__14);
			setState(150);
			match(T__18);
			setState(151);
			match(T__19);
			setState(152);
			id();
			setState(153);
			match(T__15);
			setState(154);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(tinyR3Parser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(RETURN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12884959232L) != 0)) {
				{
				setState(157);
				expr();
				}
			}

			setState(160);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case ID:
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				expr();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(164);
					match(T__19);
					setState(165);
					expr();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(tinyR3Parser.LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tinyR3Parser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyR3Listener ) ((tinyR3Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tinyR3Visitor ) return ((tinyR3Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
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
		case 11:
			return additive_expr_sempred((Additive_exprContext)_localctx, predIndex);
		case 12:
			return multiplicative_expr_sempred((Multiplicative_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additive_expr_sempred(Additive_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicative_expr_sempred(Multiplicative_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0004\u0005\u0004"+
		"?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"R\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\\\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\nf\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bn\b\u000b\n\u000b\f\u000b"+
		"q\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fy\b\f"+
		"\n\f\f\f|\t\f\u0001\r\u0001\r\u0001\r\u0003\r\u0081\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0085\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008d\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0093\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u009f\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a7"+
		"\b\u0011\n\u0011\f\u0011\u00aa\t\u0011\u0003\u0011\u00ac\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0002\u0016"+
		"\u0018\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0003\u0001\u0000\b\t\u0001\u0000"+
		"\n\f\u0001\u0000\r\u000e\u00b1\u0000)\u0001\u0000\u0000\u0000\u0002-\u0001"+
		"\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\b6\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fO\u0001"+
		"\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000"+
		"\u0000\u0012]\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016"+
		"g\u0001\u0000\u0000\u0000\u0018r\u0001\u0000\u0000\u0000\u001a\u0080\u0001"+
		"\u0000\u0000\u0000\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u0094\u0001"+
		"\u0000\u0000\u0000 \u009c\u0001\u0000\u0000\u0000\"\u00ab\u0001\u0000"+
		"\u0000\u0000$\u00ad\u0001\u0000\u0000\u0000&\u00af\u0001\u0000\u0000\u0000"+
		"(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0001\u0001"+
		"\u0000\u0000\u0000-.\u0003\u0004\u0002\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0015\u0000\u000001\u0005\u0001\u0000\u000012\u0005\u0002"+
		"\u0000\u000023\u0003\b\u0004\u00003\u0005\u0001\u0000\u0000\u000045\u0005"+
		"\u0016\u0000\u00005\u0007\u0001\u0000\u0000\u00006:\u0005\u0003\u0000"+
		"\u000079\u0003\n\u0005\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;@\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=?\u0003\u0010\b\u0000>=\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0004\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0003\f\u0006"+
		"\u0000FI\u0003&\u0013\u0000GH\u0005\u0005\u0000\u0000HJ\u0003\u0006\u0003"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0006\u0000\u0000LM\u0003\u000e\u0007\u0000MN\u0005"+
		"\u0007\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OQ\u0005\u0018\u0000"+
		"\u0000PR\u0005\u0019\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000R\r\u0001\u0000\u0000\u0000SV\u0003$\u0012\u0000TV\u0003&"+
		"\u0013\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u000f"+
		"\u0001\u0000\u0000\u0000W\\\u0003\u0012\t\u0000X\\\u0003\b\u0004\u0000"+
		"Y\\\u0003 \u0010\u0000Z\\\u0003\u001e\u000f\u0000[W\u0001\u0000\u0000"+
		"\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000]^\u0003\u0014\n\u0000^_\u0005"+
		"\u0007\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`f\u0003\u0016\u000b"+
		"\u0000ab\u0003&\u0013\u0000bc\u0005\u0006\u0000\u0000cd\u0003\u0014\n"+
		"\u0000df\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000ea\u0001\u0000"+
		"\u0000\u0000f\u0015\u0001\u0000\u0000\u0000gh\u0006\u000b\uffff\uffff"+
		"\u0000hi\u0003\u0018\f\u0000io\u0001\u0000\u0000\u0000jk\n\u0002\u0000"+
		"\u0000kl\u0007\u0000\u0000\u0000ln\u0003\u0018\f\u0000mj\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000p\u0017\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"rs\u0006\f\uffff\uffff\u0000st\u0003\u001a\r\u0000tz\u0001\u0000\u0000"+
		"\u0000uv\n\u0002\u0000\u0000vw\u0007\u0001\u0000\u0000wy\u0003\u001a\r"+
		"\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0019\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}~\u0007\u0002\u0000\u0000~\u0081\u0003\u0014"+
		"\n\u0000\u007f\u0081\u0003\u001c\u000e\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u001b\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0003$\u0012\u0000\u0083\u0085\u0003&\u0013\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0093\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000f\u0000\u0000\u0087"+
		"\u0088\u0003\u0014\n\u0000\u0088\u0089\u0005\u0010\u0000\u0000\u0089\u0093"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0003&\u0013\u0000\u008b\u008d\u0005"+
		"\u0011\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u000f\u0000\u0000\u008f\u0090\u0003\"\u0011\u0000\u0090\u0091\u0005\u0010"+
		"\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0084\u0001\u0000"+
		"\u0000\u0000\u0092\u0086\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000"+
		"\u0000\u0000\u0093\u001d\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0012"+
		"\u0000\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0005\u0013"+
		"\u0000\u0000\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u0099\u0003&\u0013"+
		"\u0000\u0099\u009a\u0005\u0010\u0000\u0000\u009a\u009b\u0005\u0007\u0000"+
		"\u0000\u009b\u001f\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u0017\u0000"+
		"\u0000\u009d\u009f\u0003\u0014\n\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1!\u0001\u0000\u0000\u0000\u00a2"+
		"\u00ac\u0001\u0000\u0000\u0000\u00a3\u00a8\u0003\u0014\n\u0000\u00a4\u00a5"+
		"\u0005\u0014\u0000\u0000\u00a5\u00a7\u0003\u0014\n\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a2\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ac#\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005!\u0000\u0000\u00ae%\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005 \u0000\u0000\u00b0\'\u0001\u0000\u0000\u0000\u0011"+
		"+:@IQU[eoz\u0080\u0084\u008c\u0092\u009e\u00a8\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}