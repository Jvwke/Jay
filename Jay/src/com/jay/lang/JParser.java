package com.jay.lang;

// Generated from J.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
        T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
        T__9=10, T__10=11, AND=12, OR=13, BEGIN=14, END=15, PROGRAM=16, FUNCTION=17, 
        AS=18, RETURN=19, TO=20, NOT=21, IF=22, ELSE=23, WHILE=24, FOR=25, STEP=26, 
        THEN=27, VAR=28, TRUE=29, FALSE=30, WRITE=31, READ=32, TYPEOF=33, DYNAMIC=34, 
        CONST_TYPE=35, TYPE=36, COMPARE_OP=37, CONST_INT=38, CONST_NATUAL_NO=39, 
        CONST_FLOAT=40, CONST_STRING=41, CONST_NORMAL_STRING=42, CONST_CHAR_STRING=43, 
        POSITIVE_DIGIT=44, DIGIT=45, ID=46, COMMENT=47, LINE_COMMENT=48, WS=49;
    public static final int
        RULE_program = 0, RULE_function_list = 1, RULE_function = 2, RULE_statement_list = 3, 
        RULE_statement = 4, RULE_expression = 5, RULE_add_expression = 6, RULE_mult_expression = 7, 
        RULE_term = 8, RULE_or_expression = 9, RULE_and_expression = 10, RULE_bool_term = 11, 
        RULE_assignment_list = 12, RULE_assignment = 13, RULE_expression_list = 14, 
        RULE_id_list = 15, RULE_function_call = 16;
    public static final String[] ruleNames = {
        "program", "function_list", "function", "statement_list", "statement", 
        "expression", "add_expression", "mult_expression", "term", "or_expression", 
        "and_expression", "bool_term", "assignment_list", "assignment", "expression_list", 
        "id_list", "function_call"
    };

    private static final String[] _LITERAL_NAMES = {
        null, "'('", "')'", "'['", "']'", "'='", "'+'", "'-'", "'*'", "'/'", "','", 
        "'[]'", null, null, "'begin'", "'end'", "'program'", "'function'", "'as'", 
        "'return'", "'to'", null, "'if'", "'else'", "'while'", "'for'", "'step'", 
        "'then'", "'var'", "'true'", "'false'", "'write'", "'read'", "'typeof'", 
        "'dynamic'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
        null, null, null, null, null, null, null, null, null, null, null, null, 
        "AND", "OR", "BEGIN", "END", "PROGRAM", "FUNCTION", "AS", "RETURN", "TO", 
        "NOT", "IF", "ELSE", "WHILE", "FOR", "STEP", "THEN", "VAR", "TRUE", "FALSE", 
        "WRITE", "READ", "TYPEOF", "DYNAMIC", "CONST_TYPE", "TYPE", "COMPARE_OP", 
        "CONST_INT", "CONST_NATUAL_NO", "CONST_FLOAT", "CONST_STRING", "CONST_NORMAL_STRING", 
        "CONST_CHAR_STRING", "POSITIVE_DIGIT", "DIGIT", "ID", "COMMENT", "LINE_COMMENT", 
        "WS"
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
    public String getGrammarFileName() { return "J.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public JParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }
    public static class ProgramContext extends ParserRuleContext {
        public TerminalNode PROGRAM() { return getToken(JParser.PROGRAM, 0); }
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public List<FunctionContext> function() {
            return getRuleContexts(FunctionContext.class);
        }
        public FunctionContext function(int i) {
            return getRuleContext(FunctionContext.class,i);
        }
        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }
        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class,i);
        }
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_program; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterProgram(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitProgram(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitProgram(this);
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
            setState(36);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la==PROGRAM) {
                {
                setState(34);
                match(PROGRAM);
                setState(35);
                match(ID);
                }
            }

            setState(40); 
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
                {
                setState(40);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                case FUNCTION:
                    {
                    setState(38);
                    function();
                    }
                    break;
                case RETURN:
                case IF:
                case WHILE:
                case FOR:
                case VAR:
                case WRITE:
                case READ:
                case TYPEOF:
                case DYNAMIC:
                case CONST_TYPE:
                case ID:
                    {
                    setState(39);
                    statement();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
                }
                }
                setState(42); 
                _errHandler.sync(this);
                _la = _input.LA(1);
            } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VAR) | (1L << WRITE) | (1L << READ) | (1L << TYPEOF) | (1L << DYNAMIC) | (1L << CONST_TYPE) | (1L << ID))) != 0) );
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

    public static class Function_listContext extends ParserRuleContext {
        public List<FunctionContext> function() {
            return getRuleContexts(FunctionContext.class);
        }
        public FunctionContext function(int i) {
            return getRuleContext(FunctionContext.class,i);
        }
        public Function_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_function_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunction_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunction_list(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunction_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Function_listContext function_list() throws RecognitionException {
        Function_listContext _localctx = new Function_listContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_function_list);
        int _la;
        try {
            setState(50);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case FUNCTION:
                enterOuterAlt(_localctx, 1);
                {
                setState(45); 
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                    {
                    setState(44);
                    function();
                    }
                    }
                    setState(47); 
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==FUNCTION );
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

    public static class FunctionContext extends ParserRuleContext {
        public Token name;
        public Token r;
        public List<TerminalNode> FUNCTION() { return getTokens(JParser.FUNCTION); }
        public TerminalNode FUNCTION(int i) {
            return getToken(JParser.FUNCTION, i);
        }
        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class,0);
        }
        public TerminalNode END() { return getToken(JParser.END, 0); }
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public Id_listContext id_list() {
            return getRuleContext(Id_listContext.class,0);
        }
        public TerminalNode AS() { return getToken(JParser.AS, 0); }
        public TerminalNode CONST_TYPE() { return getToken(JParser.CONST_TYPE, 0); }
        public FunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_function; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunction(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunction(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionContext function() throws RecognitionException {
        FunctionContext _localctx = new FunctionContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_function);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
            setState(52);
            match(FUNCTION);
            setState(53);
            ((FunctionContext)_localctx).name = match(ID);
            setState(54);
            match(T__0);
            setState(56);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la==ID) {
                {
                setState(55);
                id_list();
                }
            }

            setState(58);
            match(T__1);
            setState(61);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la==AS) {
                {
                setState(59);
                match(AS);
                setState(60);
                ((FunctionContext)_localctx).r = match(CONST_TYPE);
                }
            }

            setState(63);
            statement_list();
            setState(64);
            match(END);
            setState(65);
            match(FUNCTION);
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

    public static class Statement_listContext extends ParserRuleContext {
        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }
        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class,i);
        }
        public Statement_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_statement_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatement_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatement_list(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatement_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Statement_listContext statement_list() throws RecognitionException {
        Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_statement_list);
        int _la;
        try {
            setState(73);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case RETURN:
            case IF:
            case WHILE:
            case FOR:
            case VAR:
            case WRITE:
            case READ:
            case TYPEOF:
            case DYNAMIC:
            case CONST_TYPE:
            case ID:
                enterOuterAlt(_localctx, 1);
                {
                setState(68); 
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                    {
                    setState(67);
                    statement();
                    }
                    }
                    setState(70); 
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VAR) | (1L << WRITE) | (1L << READ) | (1L << TYPEOF) | (1L << DYNAMIC) | (1L << CONST_TYPE) | (1L << ID))) != 0) );
                }
                break;
            case END:
            case ELSE:
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

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_statement; }
     
        public StatementContext() { }
        public void copyFrom(StatementContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class StatementAssignmentContext extends StatementContext {
        public ExpressionContext i;
        public ExpressionContext v;
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public StatementAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementAssignment(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementAssignment(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementAssignment(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementReturnContext extends StatementContext {
        public TerminalNode RETURN() { return getToken(JParser.RETURN, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementReturn(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementReturn(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementReturn(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementForContext extends StatementContext {
        public List<TerminalNode> FOR() { return getTokens(JParser.FOR); }
        public TerminalNode FOR(int i) {
            return getToken(JParser.FOR, i);
        }
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public TerminalNode TO() { return getToken(JParser.TO, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public TerminalNode THEN() { return getToken(JParser.THEN, 0); }
        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class,0);
        }
        public TerminalNode END() { return getToken(JParser.END, 0); }
        public TerminalNode STEP() { return getToken(JParser.STEP, 0); }
        public TermContext term() {
            return getRuleContext(TermContext.class,0);
        }
        public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementFor(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementFor(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementFor(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementDeclarationContext extends StatementContext {
        public Assignment_listContext assignment_list() {
            return getRuleContext(Assignment_listContext.class,0);
        }
        public TerminalNode CONST_TYPE() { return getToken(JParser.CONST_TYPE, 0); }
        public TerminalNode VAR() { return getToken(JParser.VAR, 0); }
        public StatementDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementDeclaration(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementForAssignmentContext extends StatementContext {
        public List<TerminalNode> FOR() { return getTokens(JParser.FOR); }
        public TerminalNode FOR(int i) {
            return getToken(JParser.FOR, i);
        }
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public TerminalNode TO() { return getToken(JParser.TO, 0); }
        public TerminalNode THEN() { return getToken(JParser.THEN, 0); }
        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class,0);
        }
        public TerminalNode END() { return getToken(JParser.END, 0); }
        public TerminalNode STEP() { return getToken(JParser.STEP, 0); }
        public TermContext term() {
            return getRuleContext(TermContext.class,0);
        }
        public StatementForAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementForAssignment(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementForAssignment(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementForAssignment(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementFunctionCallContext extends StatementContext {
        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class,0);
        }
        public StatementFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementFunctionCall(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementFunctionCall(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementWhileContext extends StatementContext {
        public List<TerminalNode> WHILE() { return getTokens(JParser.WHILE); }
        public TerminalNode WHILE(int i) {
            return getToken(JParser.WHILE, i);
        }
        public Or_expressionContext or_expression() {
            return getRuleContext(Or_expressionContext.class,0);
        }
        public TerminalNode THEN() { return getToken(JParser.THEN, 0); }
        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class,0);
        }
        public TerminalNode END() { return getToken(JParser.END, 0); }
        public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementWhile(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementWhile(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementWhile(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StatementIfContext extends StatementContext {
        public List<TerminalNode> IF() { return getTokens(JParser.IF); }
        public TerminalNode IF(int i) {
            return getToken(JParser.IF, i);
        }
        public List<Or_expressionContext> or_expression() {
            return getRuleContexts(Or_expressionContext.class);
        }
        public Or_expressionContext or_expression(int i) {
            return getRuleContext(Or_expressionContext.class,i);
        }
        public List<TerminalNode> THEN() { return getTokens(JParser.THEN); }
        public TerminalNode THEN(int i) {
            return getToken(JParser.THEN, i);
        }
        public List<Statement_listContext> statement_list() {
            return getRuleContexts(Statement_listContext.class);
        }
        public Statement_listContext statement_list(int i) {
            return getRuleContext(Statement_listContext.class,i);
        }
        public TerminalNode END() { return getToken(JParser.END, 0); }
        public List<TerminalNode> ELSE() { return getTokens(JParser.ELSE); }
        public TerminalNode ELSE(int i) {
            return getToken(JParser.ELSE, i);
        }
        public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterStatementIf(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitStatementIf(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitStatementIf(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(148);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
            case 1:
                _localctx = new StatementDeclarationContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(75);
                _la = _input.LA(1);
                if ( !(_la==VAR || _la==CONST_TYPE) ) {
                _errHandler.recoverInline(this);
                }
                else {
                    if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(76);
                assignment_list();
                }
                break;
            case 2:
                _localctx = new StatementAssignmentContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(77);
                match(ID);
                setState(82);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==T__2) {
                    {
                    setState(78);
                    match(T__2);
                    setState(79);
                    ((StatementAssignmentContext)_localctx).i = expression();
                    setState(80);
                    match(T__3);
                    }
                }

                setState(84);
                match(T__4);
                setState(85);
                ((StatementAssignmentContext)_localctx).v = expression();
                }
                break;
            case 3:
                _localctx = new StatementIfContext(_localctx);
                enterOuterAlt(_localctx, 3);
                {
                setState(86);
                match(IF);
                setState(87);
                or_expression();
                setState(88);
                match(THEN);
                setState(89);
                statement_list();
                setState(98);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                        {
                        setState(90);
                        match(ELSE);
                        setState(91);
                        match(IF);
                        setState(92);
                        or_expression();
                        setState(93);
                        match(THEN);
                        setState(94);
                        statement_list();
                        }
                        } 
                    }
                    setState(100);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
                }
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==ELSE) {
                    {
                    setState(101);
                    match(ELSE);
                    setState(102);
                    statement_list();
                    }
                }

                setState(105);
                match(END);
                setState(106);
                match(IF);
                }
                break;
            case 4:
                _localctx = new StatementWhileContext(_localctx);
                enterOuterAlt(_localctx, 4);
                {
                setState(108);
                match(WHILE);
                setState(109);
                or_expression();
                setState(110);
                match(THEN);
                setState(111);
                statement_list();
                setState(112);
                match(END);
                setState(113);
                match(WHILE);
                }
                break;
            case 5:
                _localctx = new StatementForAssignmentContext(_localctx);
                enterOuterAlt(_localctx, 5);
                {
                setState(115);
                match(FOR);
                setState(116);
                match(ID);
                setState(117);
                match(T__4);
                setState(118);
                expression();
                setState(119);
                match(TO);
                setState(120);
                expression();
                setState(123);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==STEP) {
                    {
                    setState(121);
                    match(STEP);
                    setState(122);
                    term();
                    }
                }

                setState(125);
                match(THEN);
                setState(126);
                statement_list();
                setState(127);
                match(END);
                setState(128);
                match(FOR);
                }
                break;
            case 6:
                _localctx = new StatementForContext(_localctx);
                enterOuterAlt(_localctx, 6);
                {
                setState(130);
                match(FOR);
                setState(131);
                match(ID);
                setState(132);
                match(TO);
                setState(133);
                expression();
                setState(136);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==STEP) {
                    {
                    setState(134);
                    match(STEP);
                    setState(135);
                    term();
                    }
                }

                setState(138);
                match(THEN);
                setState(139);
                statement_list();
                setState(140);
                match(END);
                setState(141);
                match(FOR);
                }
                break;
            case 7:
                _localctx = new StatementReturnContext(_localctx);
                enterOuterAlt(_localctx, 7);
                {
                setState(143);
                match(RETURN);
                setState(145);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
                case 1:
                    {
                    setState(144);
                    expression();
                    }
                    break;
                }
                }
                break;
            case 8:
                _localctx = new StatementFunctionCallContext(_localctx);
                enterOuterAlt(_localctx, 8);
                {
                setState(147);
                function_call();
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

    public static class ExpressionContext extends ParserRuleContext {
        public Add_expressionContext add_expression() {
            return getRuleContext(Add_expressionContext.class,0);
        }
        public Or_expressionContext or_expression() {
            return getRuleContext(Or_expressionContext.class,0);
        }
        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class,0);
        }
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_expression; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitExpression(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_expression);
        try {
            setState(153);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                setState(150);
                add_expression();
                }
                break;
            case 2:
                enterOuterAlt(_localctx, 2);
                {
                setState(151);
                or_expression();
                }
                break;
            case 3:
                enterOuterAlt(_localctx, 3);
                {
                setState(152);
                function_call();
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

    public static class Add_expressionContext extends ParserRuleContext {
        public Add_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_add_expression; }
     
        public Add_expressionContext() { }
        public void copyFrom(Add_expressionContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class Add_expressionAddOpContext extends Add_expressionContext {
        public Token op;
        public Mult_expressionContext mult_expression() {
            return getRuleContext(Mult_expressionContext.class,0);
        }
        public Add_expressionContext add_expression() {
            return getRuleContext(Add_expressionContext.class,0);
        }
        public Add_expressionAddOpContext(Add_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAdd_expressionAddOp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAdd_expressionAddOp(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAdd_expressionAddOp(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class Add_expressionMultExpressionContext extends Add_expressionContext {
        public Mult_expressionContext mult_expression() {
            return getRuleContext(Mult_expressionContext.class,0);
        }
        public Add_expressionMultExpressionContext(Add_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAdd_expressionMultExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAdd_expressionMultExpression(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAdd_expressionMultExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Add_expressionContext add_expression() throws RecognitionException {
        Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_add_expression);
        int _la;
        try {
            setState(160);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
            case 1:
                _localctx = new Add_expressionAddOpContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(155);
                mult_expression();
                setState(156);
                ((Add_expressionAddOpContext)_localctx).op = _input.LT(1);
                _la = _input.LA(1);
                if ( !(_la==T__5 || _la==T__6) ) {
                    ((Add_expressionAddOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
                }
                else {
                    if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(157);
                add_expression();
                }
                break;
            case 2:
                _localctx = new Add_expressionMultExpressionContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(159);
                mult_expression();
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

    public static class Mult_expressionContext extends ParserRuleContext {
        public Mult_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_mult_expression; }
     
        public Mult_expressionContext() { }
        public void copyFrom(Mult_expressionContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class Mult_expressionMultOpContext extends Mult_expressionContext {
        public Token op;
        public TermContext term() {
            return getRuleContext(TermContext.class,0);
        }
        public Mult_expressionContext mult_expression() {
            return getRuleContext(Mult_expressionContext.class,0);
        }
        public Mult_expressionMultOpContext(Mult_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterMult_expressionMultOp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitMult_expressionMultOp(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMult_expressionMultOp(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class Mult_expressionTermContext extends Mult_expressionContext {
        public TermContext term() {
            return getRuleContext(TermContext.class,0);
        }
        public Mult_expressionTermContext(Mult_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterMult_expressionTerm(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitMult_expressionTerm(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMult_expressionTerm(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Mult_expressionContext mult_expression() throws RecognitionException {
        Mult_expressionContext _localctx = new Mult_expressionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_mult_expression);
        int _la;
        try {
            setState(167);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
            case 1:
                _localctx = new Mult_expressionMultOpContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(162);
                term();
                setState(163);
                ((Mult_expressionMultOpContext)_localctx).op = _input.LT(1);
                _la = _input.LA(1);
                if ( !(_la==T__7 || _la==T__8) ) {
                    ((Mult_expressionMultOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
                }
                else {
                    if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(164);
                mult_expression();
                }
                break;
            case 2:
                _localctx = new Mult_expressionTermContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(166);
                term();
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

    public static class TermContext extends ParserRuleContext {
        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_term; }
     
        public TermContext() { }
        public void copyFrom(TermContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class TermStringContext extends TermContext {
        public TerminalNode CONST_STRING() { return getToken(JParser.CONST_STRING, 0); }
        public TermStringContext(TermContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterTermString(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitTermString(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTermString(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class TermIntContext extends TermContext {
        public TerminalNode CONST_INT() { return getToken(JParser.CONST_INT, 0); }
        public TermIntContext(TermContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterTermInt(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitTermInt(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTermInt(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class TermFunctionCallContext extends TermContext {
        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class,0);
        }
        public TermFunctionCallContext(TermContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterTermFunctionCall(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitTermFunctionCall(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTermFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class TermVariableContext extends TermContext {
        public ExpressionContext i;
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public TermVariableContext(TermContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterTermVariable(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitTermVariable(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTermVariable(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class TermFloatContext extends TermContext {
        public TerminalNode CONST_FLOAT() { return getToken(JParser.CONST_FLOAT, 0); }
        public TermFloatContext(TermContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterTermFloat(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitTermFloat(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTermFloat(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class TermExpressionContext extends TermContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public TermExpressionContext(TermContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterTermExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitTermExpression(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTermExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_term);
        int _la;
        try {
            setState(184);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
            case 1:
                _localctx = new TermExpressionContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(169);
                match(T__0);
                setState(170);
                expression();
                setState(171);
                match(T__1);
                }
                break;
            case 2:
                _localctx = new TermVariableContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(173);
                match(ID);
                setState(178);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==T__2) {
                    {
                    setState(174);
                    match(T__2);
                    setState(175);
                    ((TermVariableContext)_localctx).i = expression();
                    setState(176);
                    match(T__3);
                    }
                }

                }
                break;
            case 3:
                _localctx = new TermIntContext(_localctx);
                enterOuterAlt(_localctx, 3);
                {
                setState(180);
                match(CONST_INT);
                }
                break;
            case 4:
                _localctx = new TermFloatContext(_localctx);
                enterOuterAlt(_localctx, 4);
                {
                setState(181);
                match(CONST_FLOAT);
                }
                break;
            case 5:
                _localctx = new TermStringContext(_localctx);
                enterOuterAlt(_localctx, 5);
                {
                setState(182);
                match(CONST_STRING);
                }
                break;
            case 6:
                _localctx = new TermFunctionCallContext(_localctx);
                enterOuterAlt(_localctx, 6);
                {
                setState(183);
                function_call();
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

    public static class Or_expressionContext extends ParserRuleContext {
        public Or_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_or_expression; }
     
        public Or_expressionContext() { }
        public void copyFrom(Or_expressionContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class Or_expressionOpContext extends Or_expressionContext {
        public List<And_expressionContext> and_expression() {
            return getRuleContexts(And_expressionContext.class);
        }
        public And_expressionContext and_expression(int i) {
            return getRuleContext(And_expressionContext.class,i);
        }
        public TerminalNode OR() { return getToken(JParser.OR, 0); }
        public Or_expressionOpContext(Or_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterOr_expressionOp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitOr_expressionOp(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitOr_expressionOp(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class Or_expressionAndContext extends Or_expressionContext {
        public And_expressionContext and_expression() {
            return getRuleContext(And_expressionContext.class,0);
        }
        public Or_expressionAndContext(Or_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterOr_expressionAnd(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitOr_expressionAnd(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitOr_expressionAnd(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Or_expressionContext or_expression() throws RecognitionException {
        Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_or_expression);
        try {
            setState(191);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
            case 1:
                _localctx = new Or_expressionOpContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(186);
                and_expression();
                setState(187);
                match(OR);
                setState(188);
                and_expression();
                }
                break;
            case 2:
                _localctx = new Or_expressionAndContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(190);
                and_expression();
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

    public static class And_expressionContext extends ParserRuleContext {
        public And_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_and_expression; }
     
        public And_expressionContext() { }
        public void copyFrom(And_expressionContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class And_expressionOpContext extends And_expressionContext {
        public List<Bool_termContext> bool_term() {
            return getRuleContexts(Bool_termContext.class);
        }
        public Bool_termContext bool_term(int i) {
            return getRuleContext(Bool_termContext.class,i);
        }
        public TerminalNode AND() { return getToken(JParser.AND, 0); }
        public And_expressionOpContext(And_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAnd_expressionOp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAnd_expressionOp(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAnd_expressionOp(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class And_expressionTermContext extends And_expressionContext {
        public Bool_termContext bool_term() {
            return getRuleContext(Bool_termContext.class,0);
        }
        public And_expressionTermContext(And_expressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAnd_expressionTerm(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAnd_expressionTerm(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAnd_expressionTerm(this);
            else return visitor.visitChildren(this);
        }
    }

    public final And_expressionContext and_expression() throws RecognitionException {
        And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_and_expression);
        try {
            setState(198);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
            case 1:
                _localctx = new And_expressionOpContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(193);
                bool_term();
                setState(194);
                match(AND);
                setState(195);
                bool_term();
                }
                break;
            case 2:
                _localctx = new And_expressionTermContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(197);
                bool_term();
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

    public static class Bool_termContext extends ParserRuleContext {
        public Bool_termContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_bool_term; }
     
        public Bool_termContext() { }
        public void copyFrom(Bool_termContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class Bool_termNotContext extends Bool_termContext {
        public TerminalNode NOT() { return getToken(JParser.NOT, 0); }
        public Bool_termContext bool_term() {
            return getRuleContext(Bool_termContext.class,0);
        }
        public Bool_termNotContext(Bool_termContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterBool_termNot(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitBool_termNot(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBool_termNot(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class Bool_termExpressionContext extends Bool_termContext {
        public Or_expressionContext or_expression() {
            return getRuleContext(Or_expressionContext.class,0);
        }
        public Bool_termExpressionContext(Bool_termContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterBool_termExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitBool_termExpression(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBool_termExpression(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class Bool_termCompareContext extends Bool_termContext {
        public List<Add_expressionContext> add_expression() {
            return getRuleContexts(Add_expressionContext.class);
        }
        public Add_expressionContext add_expression(int i) {
            return getRuleContext(Add_expressionContext.class,i);
        }
        public TerminalNode COMPARE_OP() { return getToken(JParser.COMPARE_OP, 0); }
        public Bool_termCompareContext(Bool_termContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterBool_termCompare(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitBool_termCompare(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBool_termCompare(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class Bool_termConstContext extends Bool_termContext {
        public Token b;
        public TerminalNode TRUE() { return getToken(JParser.TRUE, 0); }
        public TerminalNode FALSE() { return getToken(JParser.FALSE, 0); }
        public Bool_termConstContext(Bool_termContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterBool_termConst(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitBool_termConst(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBool_termConst(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Bool_termContext bool_term() throws RecognitionException {
        Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_bool_term);
        int _la;
        try {
            setState(211);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
            case 1:
                _localctx = new Bool_termExpressionContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(200);
                match(T__0);
                setState(201);
                or_expression();
                setState(202);
                match(T__1);
                }
                break;
            case 2:
                _localctx = new Bool_termCompareContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(204);
                add_expression();
                setState(205);
                match(COMPARE_OP);
                setState(206);
                add_expression();
                }
                break;
            case 3:
                _localctx = new Bool_termConstContext(_localctx);
                enterOuterAlt(_localctx, 3);
                {
                setState(208);
                ((Bool_termConstContext)_localctx).b = _input.LT(1);
                _la = _input.LA(1);
                if ( !(_la==TRUE || _la==FALSE) ) {
                    ((Bool_termConstContext)_localctx).b = (Token)_errHandler.recoverInline(this);
                }
                else {
                    if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                }
                break;
            case 4:
                _localctx = new Bool_termNotContext(_localctx);
                enterOuterAlt(_localctx, 4);
                {
                setState(209);
                match(NOT);
                setState(210);
                bool_term();
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

    public static class Assignment_listContext extends ParserRuleContext {
        public Assignment_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_assignment_list; }
     
        public Assignment_listContext() { }
        public void copyFrom(Assignment_listContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class AssignmentListNonArrayContext extends Assignment_listContext {
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class,0);
        }
        public Assignment_listContext assignment_list() {
            return getRuleContext(Assignment_listContext.class,0);
        }
        public AssignmentListNonArrayContext(Assignment_listContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAssignmentListNonArray(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAssignmentListNonArray(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAssignmentListNonArray(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class AssignmentListArrayContext extends Assignment_listContext {
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public Assignment_listContext assignment_list() {
            return getRuleContext(Assignment_listContext.class,0);
        }
        public Expression_listContext expression_list() {
            return getRuleContext(Expression_listContext.class,0);
        }
        public AssignmentListArrayContext(Assignment_listContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAssignmentListArray(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAssignmentListArray(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAssignmentListArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Assignment_listContext assignment_list() throws RecognitionException {
        Assignment_listContext _localctx = new Assignment_listContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_assignment_list);
        int _la;
        try {
            setState(234);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case ID:
                _localctx = new AssignmentListNonArrayContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(213);
                match(ID);
                setState(214);
                assignment();
                setState(218);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                case EOF:
                case END:
                case FUNCTION:
                case RETURN:
                case IF:
                case ELSE:
                case WHILE:
                case FOR:
                case VAR:
                case WRITE:
                case READ:
                case TYPEOF:
                case DYNAMIC:
                case CONST_TYPE:
                case ID:
                    {
                    }
                    break;
                case T__9:
                    {
                    setState(216);
                    match(T__9);
                    setState(217);
                    assignment_list();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
                }
                }
                break;
            case T__10:
                _localctx = new AssignmentListArrayContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(220);
                match(T__10);
                setState(221);
                match(ID);
                setState(227);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==T__4) {
                    {
                    setState(222);
                    match(T__4);
                    setState(223);
                    match(T__0);
                    setState(224);
                    expression_list();
                    setState(225);
                    match(T__1);
                    }
                }

                setState(232);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                case EOF:
                case END:
                case FUNCTION:
                case RETURN:
                case IF:
                case ELSE:
                case WHILE:
                case FOR:
                case VAR:
                case WRITE:
                case READ:
                case TYPEOF:
                case DYNAMIC:
                case CONST_TYPE:
                case ID:
                    {
                    }
                    break;
                case T__9:
                    {
                    setState(230);
                    match(T__9);
                    setState(231);
                    assignment_list();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
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

    public static class AssignmentContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_assignment; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterAssignment(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitAssignment(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_assignment);
        try {
            setState(239);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case T__4:
                enterOuterAlt(_localctx, 1);
                {
                setState(236);
                match(T__4);
                setState(237);
                expression();
                }
                break;
            case EOF:
            case T__9:
            case END:
            case FUNCTION:
            case RETURN:
            case IF:
            case ELSE:
            case WHILE:
            case FOR:
            case VAR:
            case WRITE:
            case READ:
            case TYPEOF:
            case DYNAMIC:
            case CONST_TYPE:
            case ID:
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

    public static class Expression_listContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public Expression_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_expression_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterExpression_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitExpression_list(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitExpression_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Expression_listContext expression_list() throws RecognitionException {
        Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_expression_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
            setState(241);
            expression();
            setState(246);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la==T__9) {
                {
                {
                setState(242);
                match(T__9);
                setState(243);
                expression();
                }
                }
                setState(248);
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

    public static class Id_listContext extends ParserRuleContext {
        public List<TerminalNode> ID() { return getTokens(JParser.ID); }
        public TerminalNode ID(int i) {
            return getToken(JParser.ID, i);
        }
        public Id_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_id_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterId_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitId_list(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitId_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Id_listContext id_list() throws RecognitionException {
        Id_listContext _localctx = new Id_listContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_id_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
            setState(249);
            match(ID);
            setState(254);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la==T__9) {
                {
                {
                setState(250);
                match(T__9);
                setState(251);
                match(ID);
                }
                }
                setState(256);
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

    public static class Function_callContext extends ParserRuleContext {
        public Function_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_function_call; }
     
        public Function_callContext() { }
        public void copyFrom(Function_callContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class FunctionCallDynamicContext extends Function_callContext {
        public TerminalNode DYNAMIC() { return getToken(JParser.DYNAMIC, 0); }
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public FunctionCallDynamicContext(Function_callContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunctionCallDynamic(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunctionCallDynamic(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunctionCallDynamic(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class FunctionCallReadContext extends Function_callContext {
        public TerminalNode READ() { return getToken(JParser.READ, 0); }
        public FunctionCallReadContext(Function_callContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunctionCallRead(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunctionCallRead(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunctionCallRead(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class FunctionCallCastContext extends Function_callContext {
        public TerminalNode CONST_TYPE() { return getToken(JParser.CONST_TYPE, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public FunctionCallCastContext(Function_callContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunctionCallCast(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunctionCallCast(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunctionCallCast(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class FunctionCallWriteContext extends Function_callContext {
        public TerminalNode WRITE() { return getToken(JParser.WRITE, 0); }
        public Expression_listContext expression_list() {
            return getRuleContext(Expression_listContext.class,0);
        }
        public FunctionCallWriteContext(Function_callContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunctionCallWrite(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunctionCallWrite(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunctionCallWrite(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class FunctionCallTypeofContext extends Function_callContext {
        public TerminalNode TYPEOF() { return getToken(JParser.TYPEOF, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public FunctionCallTypeofContext(Function_callContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunctionCallTypeof(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunctionCallTypeof(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunctionCallTypeof(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class FunctionCallIdContext extends Function_callContext {
        public TerminalNode ID() { return getToken(JParser.ID, 0); }
        public Expression_listContext expression_list() {
            return getRuleContext(Expression_listContext.class,0);
        }
        public FunctionCallIdContext(Function_callContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).enterFunctionCallId(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JListener ) ((JListener)listener).exitFunctionCallId(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFunctionCallId(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Function_callContext function_call() throws RecognitionException {
        Function_callContext _localctx = new Function_callContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_function_call);
        int _la;
        try {
            setState(284);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case WRITE:
                _localctx = new FunctionCallWriteContext(_localctx);
                enterOuterAlt(_localctx, 1);
                {
                setState(257);
                match(WRITE);
                setState(258);
                match(T__0);
                setState(259);
                expression_list();
                setState(260);
                match(T__1);
                }
                break;
            case ID:
                _localctx = new FunctionCallIdContext(_localctx);
                enterOuterAlt(_localctx, 2);
                {
                setState(262);
                match(ID);
                setState(267);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==T__0) {
                    {
                    setState(263);
                    match(T__0);
                    setState(264);
                    expression_list();
                    setState(265);
                    match(T__1);
                    }
                }

                }
                break;
            case DYNAMIC:
                _localctx = new FunctionCallDynamicContext(_localctx);
                enterOuterAlt(_localctx, 3);
                {
                setState(269);
                match(DYNAMIC);
                setState(270);
                match(T__0);
                setState(271);
                match(ID);
                setState(272);
                match(T__1);
                }
                break;
            case CONST_TYPE:
                _localctx = new FunctionCallCastContext(_localctx);
                enterOuterAlt(_localctx, 4);
                {
                setState(273);
                match(CONST_TYPE);
                setState(274);
                match(T__0);
                setState(275);
                expression();
                setState(276);
                match(T__1);
                }
                break;
            case TYPEOF:
                _localctx = new FunctionCallTypeofContext(_localctx);
                enterOuterAlt(_localctx, 5);
                {
                setState(278);
                match(TYPEOF);
                setState(279);
                match(T__0);
                setState(280);
                expression();
                setState(281);
                match(T__1);
                }
                break;
            case READ:
                _localctx = new FunctionCallReadContext(_localctx);
                enterOuterAlt(_localctx, 6);
                {
                setState(283);
                match(READ);
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

    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0121\4\2\t\2"+
        "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
        "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
        "\3\2\3\2\5\2\'\n\2\3\2\3\2\6\2+\n\2\r\2\16\2,\3\3\6\3\60\n\3\r\3\16\3"+
        "\61\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\5\4@\n\4\3\4\3"+
        "\4\3\4\3\4\3\5\6\5G\n\5\r\5\16\5H\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
        "\3\6\5\6U\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6c\n\6"+
        "\f\6\16\6f\13\6\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
        "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
        "\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094"+
        "\n\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b\5"+
        "\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
        "\3\n\3\n\3\n\5\n\u00b5\n\n\3\n\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\3\13"+
        "\3\13\3\13\5\13\u00c2\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00c9\n\f\3\r\3\r\3"+
        "\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\16\3\16\3\16\3\16\3"+
        "\16\5\16\u00dd\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e6\n\16"+
        "\3\16\3\16\3\16\5\16\u00eb\n\16\5\16\u00ed\n\16\3\17\3\17\3\17\5\17\u00f2"+
        "\n\17\3\20\3\20\3\20\7\20\u00f7\n\20\f\20\16\20\u00fa\13\20\3\21\3\21"+
        "\3\21\7\21\u00ff\n\21\f\21\16\21\u0102\13\21\3\22\3\22\3\22\3\22\3\22"+
        "\3\22\3\22\3\22\3\22\3\22\5\22\u010e\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
        "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011f\n\22\3\22\2\2"+
        "\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2\36\36%%\3\2\b\t"+
        "\3\2\n\13\3\2\37 \2\u0141\2&\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bK\3\2"+
        "\2\2\n\u0096\3\2\2\2\f\u009b\3\2\2\2\16\u00a2\3\2\2\2\20\u00a9\3\2\2\2"+
        "\22\u00ba\3\2\2\2\24\u00c1\3\2\2\2\26\u00c8\3\2\2\2\30\u00d5\3\2\2\2\32"+
        "\u00ec\3\2\2\2\34\u00f1\3\2\2\2\36\u00f3\3\2\2\2 \u00fb\3\2\2\2\"\u011e"+
        "\3\2\2\2$%\7\22\2\2%\'\7\60\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(+\5\6"+
        "\4\2)+\5\n\6\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3"+
        "\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
        "\65\3\2\2\2\63\65\3\2\2\2\64/\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66\67"+
        "\7\23\2\2\678\7\60\2\28:\7\3\2\29;\5 \21\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2"+
        "\2<?\7\4\2\2=>\7\24\2\2>@\7%\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\b\5"+
        "\2BC\7\21\2\2CD\7\23\2\2D\7\3\2\2\2EG\5\n\6\2FE\3\2\2\2GH\3\2\2\2HF\3"+
        "\2\2\2HI\3\2\2\2IL\3\2\2\2JL\3\2\2\2KF\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN"+
        "\t\2\2\2N\u0097\5\32\16\2OT\7\60\2\2PQ\7\5\2\2QR\5\f\7\2RS\7\6\2\2SU\3"+
        "\2\2\2TP\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\7\2\2W\u0097\5\f\7\2XY\7\30\2"+
        "\2YZ\5\24\13\2Z[\7\35\2\2[d\5\b\5\2\\]\7\31\2\2]^\7\30\2\2^_\5\24\13\2"+
        "_`\7\35\2\2`a\5\b\5\2ac\3\2\2\2b\\\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
        "\2ei\3\2\2\2fd\3\2\2\2gh\7\31\2\2hj\5\b\5\2ig\3\2\2\2ij\3\2\2\2jk\3\2"+
        "\2\2kl\7\21\2\2lm\7\30\2\2m\u0097\3\2\2\2no\7\32\2\2op\5\24\13\2pq\7\35"+
        "\2\2qr\5\b\5\2rs\7\21\2\2st\7\32\2\2t\u0097\3\2\2\2uv\7\33\2\2vw\7\60"+
        "\2\2wx\7\7\2\2xy\5\f\7\2yz\7\26\2\2z}\5\f\7\2{|\7\34\2\2|~\5\22\n\2}{"+
        "\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\35\2\2\u0080\u0081\5\b\5\2"+
        "\u0081\u0082\7\21\2\2\u0082\u0083\7\33\2\2\u0083\u0097\3\2\2\2\u0084\u0085"+
        "\7\33\2\2\u0085\u0086\7\60\2\2\u0086\u0087\7\26\2\2\u0087\u008a\5\f\7"+
        "\2\u0088\u0089\7\34\2\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2\u008a"+
        "\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\35\2\2\u008d\u008e\5"+
        "\b\5\2\u008e\u008f\7\21\2\2\u008f\u0090\7\33\2\2\u0090\u0097\3\2\2\2\u0091"+
        "\u0093\7\25\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2\u0093\u0094\3"+
        "\2\2\2\u0094\u0097\3\2\2\2\u0095\u0097\5\"\22\2\u0096M\3\2\2\2\u0096O"+
        "\3\2\2\2\u0096X\3\2\2\2\u0096n\3\2\2\2\u0096u\3\2\2\2\u0096\u0084\3\2"+
        "\2\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\13\3\2\2\2\u0098\u009c"+
        "\5\16\b\2\u0099\u009c\5\24\13\2\u009a\u009c\5\"\22\2\u009b\u0098\3\2\2"+
        "\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\r\3\2\2\2\u009d\u009e"+
        "\5\20\t\2\u009e\u009f\t\3\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a3\3\2\2\2"+
        "\u00a1\u00a3\5\20\t\2\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\17"+
        "\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\t\4\2\2\u00a6\u00a7\5\20\t\2"+
        "\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a4\3\2\2\2\u00a9\u00a8"+
        "\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\5\f\7\2\u00ad"+
        "\u00ae\7\4\2\2\u00ae\u00bb\3\2\2\2\u00af\u00b4\7\60\2\2\u00b0\u00b1\7"+
        "\5\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\7\6\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
        "\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bb\3\2\2\2\u00b6\u00bb\7("+
        "\2\2\u00b7\u00bb\7*\2\2\u00b8\u00bb\7+\2\2\u00b9\u00bb\5\"\22\2\u00ba"+
        "\u00ab\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2"+
        "\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bd"+
        "\5\26\f\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c2\3\2\2"+
        "\2\u00c0\u00c2\5\26\f\2\u00c1\u00bc\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
        "\25\3\2\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\5\30"+
        "\r\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5\30\r\2\u00c8\u00c3\3\2\2\2\u00c8"+
        "\u00c7\3\2\2\2\u00c9\27\3\2\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\5\24\13"+
        "\2\u00cc\u00cd\7\4\2\2\u00cd\u00d6\3\2\2\2\u00ce\u00cf\5\16\b\2\u00cf"+
        "\u00d0\7\'\2\2\u00d0\u00d1\5\16\b\2\u00d1\u00d6\3\2\2\2\u00d2\u00d6\t"+
        "\5\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d6\5\30\r\2\u00d5\u00ca\3\2\2\2\u00d5"+
        "\u00ce\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\31\3\2\2"+
        "\2\u00d7\u00d8\7\60\2\2\u00d8\u00dc\5\34\17\2\u00d9\u00dd\3\2\2\2\u00da"+
        "\u00db\7\f\2\2\u00db\u00dd\5\32\16\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3"+
        "\2\2\2\u00dd\u00ed\3\2\2\2\u00de\u00df\7\r\2\2\u00df\u00e5\7\60\2\2\u00e0"+
        "\u00e1\7\7\2\2\u00e1\u00e2\7\3\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7"+
        "\4\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
        "\u00ea\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00eb\5\32"+
        "\16\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
        "\u00d7\3\2\2\2\u00ec\u00de\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ef\7\7\2"+
        "\2\u00ef\u00f2\5\f\7\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0"+
        "\3\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f8\5\f\7\2\u00f4\u00f5\7\f\2\2\u00f5"+
        "\u00f7\5\f\7\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
        "\2\2\u00f8\u00f9\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0100"+
        "\7\60\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00ff\7\60\2\2\u00fe\u00fc\3\2\2\2"+
        "\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101!\3"+
        "\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7!\2\2\u0104\u0105\7\3\2\2\u0105"+
        "\u0106\5\36\20\2\u0106\u0107\7\4\2\2\u0107\u011f\3\2\2\2\u0108\u010d\7"+
        "\60\2\2\u0109\u010a\7\3\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\4\2\2"+
        "\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u011f"+
        "\3\2\2\2\u010f\u0110\7$\2\2\u0110\u0111\7\3\2\2\u0111\u0112\7\60\2\2\u0112"+
        "\u011f\7\4\2\2\u0113\u0114\7%\2\2\u0114\u0115\7\3\2\2\u0115\u0116\5\f"+
        "\7\2\u0116\u0117\7\4\2\2\u0117\u011f\3\2\2\2\u0118\u0119\7#\2\2\u0119"+
        "\u011a\7\3\2\2\u011a\u011b\5\f\7\2\u011b\u011c\7\4\2\2\u011c\u011f\3\2"+
        "\2\2\u011d\u011f\7\"\2\2\u011e\u0103\3\2\2\2\u011e\u0108\3\2\2\2\u011e"+
        "\u010f\3\2\2\2\u011e\u0113\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011d\3\2"+
        "\2\2\u011f#\3\2\2\2#&*,\61\64:?HKTdi}\u008a\u0093\u0096\u009b\u00a2\u00a9"+
        "\u00b4\u00ba\u00c1\u00c8\u00d5\u00dc\u00e5\u00ea\u00ec\u00f1\u00f8\u0100"+
        "\u010d\u011e";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}