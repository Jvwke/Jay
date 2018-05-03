package com.jay.lang;

// Generated from J.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link JParser#program}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(JParser.ProgramContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#imports}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImports(JParser.ImportsContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#function_list}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction_list(JParser.Function_listContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#function}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction(JParser.FunctionContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#statement_list}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement_list(JParser.Statement_listContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementDeclaration}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementDeclaration(JParser.StatementDeclarationContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementAssignment}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementAssignment(JParser.StatementAssignmentContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementIf}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementIf(JParser.StatementIfContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementWhile}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementWhile(JParser.StatementWhileContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementForAssignment}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementForAssignment(JParser.StatementForAssignmentContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementFor}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementFor(JParser.StatementForContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementReturn}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementReturn(JParser.StatementReturnContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementBreak}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementBreak(JParser.StatementBreakContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementContinue}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementContinue(JParser.StatementContinueContext ctx);
    /**
     * Visit a parse tree produced by the {@code statementFunctionCall}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementFunctionCall(JParser.StatementFunctionCallContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(JParser.ExpressionContext ctx);
    /**
     * Visit a parse tree produced by the {@code add_expressionAddOp}
     * labeled alternative in {@link JParser#add_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdd_expressionAddOp(JParser.Add_expressionAddOpContext ctx);
    /**
     * Visit a parse tree produced by the {@code add_expressionMultExpression}
     * labeled alternative in {@link JParser#add_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdd_expressionMultExpression(JParser.Add_expressionMultExpressionContext ctx);
    /**
     * Visit a parse tree produced by the {@code mult_expressionMultOp}
     * labeled alternative in {@link JParser#mult_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMult_expressionMultOp(JParser.Mult_expressionMultOpContext ctx);
    /**
     * Visit a parse tree produced by the {@code mult_expressionTerm}
     * labeled alternative in {@link JParser#mult_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMult_expressionTerm(JParser.Mult_expressionTermContext ctx);
    /**
     * Visit a parse tree produced by the {@code termExpression}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTermExpression(JParser.TermExpressionContext ctx);
    /**
     * Visit a parse tree produced by the {@code termVariable}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTermVariable(JParser.TermVariableContext ctx);
    /**
     * Visit a parse tree produced by the {@code termInt}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTermInt(JParser.TermIntContext ctx);
    /**
     * Visit a parse tree produced by the {@code termFloat}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTermFloat(JParser.TermFloatContext ctx);
    /**
     * Visit a parse tree produced by the {@code termString}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTermString(JParser.TermStringContext ctx);
    /**
     * Visit a parse tree produced by the {@code termFunctionCall}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTermFunctionCall(JParser.TermFunctionCallContext ctx);
    /**
     * Visit a parse tree produced by the {@code or_expressionOp}
     * labeled alternative in {@link JParser#or_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr_expressionOp(JParser.Or_expressionOpContext ctx);
    /**
     * Visit a parse tree produced by the {@code or_expressionAnd}
     * labeled alternative in {@link JParser#or_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr_expressionAnd(JParser.Or_expressionAndContext ctx);
    /**
     * Visit a parse tree produced by the {@code and_expressionOp}
     * labeled alternative in {@link JParser#and_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd_expressionOp(JParser.And_expressionOpContext ctx);
    /**
     * Visit a parse tree produced by the {@code and_expressionTerm}
     * labeled alternative in {@link JParser#and_expression}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd_expressionTerm(JParser.And_expressionTermContext ctx);
    /**
     * Visit a parse tree produced by the {@code bool_termExpression}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBool_termExpression(JParser.Bool_termExpressionContext ctx);
    /**
     * Visit a parse tree produced by the {@code bool_termCompare}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBool_termCompare(JParser.Bool_termCompareContext ctx);
    /**
     * Visit a parse tree produced by the {@code bool_termConst}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBool_termConst(JParser.Bool_termConstContext ctx);
    /**
     * Visit a parse tree produced by the {@code bool_termNot}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBool_termNot(JParser.Bool_termNotContext ctx);
    /**
     * Visit a parse tree produced by the {@code assignmentListNonArray}
     * labeled alternative in {@link JParser#assignment_list}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignmentListNonArray(JParser.AssignmentListNonArrayContext ctx);
    /**
     * Visit a parse tree produced by the {@code assignmentListArray}
     * labeled alternative in {@link JParser#assignment_list}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignmentListArray(JParser.AssignmentListArrayContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#assignment}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(JParser.AssignmentContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#expression_list}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression_list(JParser.Expression_listContext ctx);
    /**
     * Visit a parse tree produced by {@link JParser#id_list}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId_list(JParser.Id_listContext ctx);
    /**
     * Visit a parse tree produced by the {@code functionCallWrite}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallWrite(JParser.FunctionCallWriteContext ctx);
    /**
     * Visit a parse tree produced by the {@code functionCallId}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallId(JParser.FunctionCallIdContext ctx);
    /**
     * Visit a parse tree produced by the {@code functionCallDynamic}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallDynamic(JParser.FunctionCallDynamicContext ctx);
    /**
     * Visit a parse tree produced by the {@code functionCallCast}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallCast(JParser.FunctionCallCastContext ctx);
    /**
     * Visit a parse tree produced by the {@code functionCallTypeof}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallTypeof(JParser.FunctionCallTypeofContext ctx);
    /**
     * Visit a parse tree produced by the {@code functionCallRead}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallRead(JParser.FunctionCallReadContext ctx);
}