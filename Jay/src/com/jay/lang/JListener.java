package com.jay.lang;

// Generated from J.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JParser}.
 */
public interface JListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link JParser#program}.
     * @param ctx the parse tree
     */
    void enterProgram(JParser.ProgramContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#program}.
     * @param ctx the parse tree
     */
    void exitProgram(JParser.ProgramContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#imports}.
     * @param ctx the parse tree
     */
    void enterImports(JParser.ImportsContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#imports}.
     * @param ctx the parse tree
     */
    void exitImports(JParser.ImportsContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#function_list}.
     * @param ctx the parse tree
     */
    void enterFunction_list(JParser.Function_listContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#function_list}.
     * @param ctx the parse tree
     */
    void exitFunction_list(JParser.Function_listContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#function}.
     * @param ctx the parse tree
     */
    void enterFunction(JParser.FunctionContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#function}.
     * @param ctx the parse tree
     */
    void exitFunction(JParser.FunctionContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#statement_list}.
     * @param ctx the parse tree
     */
    void enterStatement_list(JParser.Statement_listContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#statement_list}.
     * @param ctx the parse tree
     */
    void exitStatement_list(JParser.Statement_listContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementDeclaration}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementDeclaration(JParser.StatementDeclarationContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementDeclaration}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementDeclaration(JParser.StatementDeclarationContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementAssignment}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementAssignment(JParser.StatementAssignmentContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementAssignment}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementAssignment(JParser.StatementAssignmentContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementIf}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementIf(JParser.StatementIfContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementIf}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementIf(JParser.StatementIfContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementWhile}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementWhile(JParser.StatementWhileContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementWhile}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementWhile(JParser.StatementWhileContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementForAssignment}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementForAssignment(JParser.StatementForAssignmentContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementForAssignment}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementForAssignment(JParser.StatementForAssignmentContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementFor}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementFor(JParser.StatementForContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementFor}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementFor(JParser.StatementForContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementReturn}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementReturn(JParser.StatementReturnContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementReturn}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementReturn(JParser.StatementReturnContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementBreak}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementBreak(JParser.StatementBreakContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementBreak}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementBreak(JParser.StatementBreakContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementContinue}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementContinue(JParser.StatementContinueContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementContinue}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementContinue(JParser.StatementContinueContext ctx);
    /**
     * Enter a parse tree produced by the {@code statementFunctionCall}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatementFunctionCall(JParser.StatementFunctionCallContext ctx);
    /**
     * Exit a parse tree produced by the {@code statementFunctionCall}
     * labeled alternative in {@link JParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatementFunctionCall(JParser.StatementFunctionCallContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#expression}.
     * @param ctx the parse tree
     */
    void enterExpression(JParser.ExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#expression}.
     * @param ctx the parse tree
     */
    void exitExpression(JParser.ExpressionContext ctx);
    /**
     * Enter a parse tree produced by the {@code add_expressionAddOp}
     * labeled alternative in {@link JParser#add_expression}.
     * @param ctx the parse tree
     */
    void enterAdd_expressionAddOp(JParser.Add_expressionAddOpContext ctx);
    /**
     * Exit a parse tree produced by the {@code add_expressionAddOp}
     * labeled alternative in {@link JParser#add_expression}.
     * @param ctx the parse tree
     */
    void exitAdd_expressionAddOp(JParser.Add_expressionAddOpContext ctx);
    /**
     * Enter a parse tree produced by the {@code add_expressionMultExpression}
     * labeled alternative in {@link JParser#add_expression}.
     * @param ctx the parse tree
     */
    void enterAdd_expressionMultExpression(JParser.Add_expressionMultExpressionContext ctx);
    /**
     * Exit a parse tree produced by the {@code add_expressionMultExpression}
     * labeled alternative in {@link JParser#add_expression}.
     * @param ctx the parse tree
     */
    void exitAdd_expressionMultExpression(JParser.Add_expressionMultExpressionContext ctx);
    /**
     * Enter a parse tree produced by the {@code mult_expressionMultOp}
     * labeled alternative in {@link JParser#mult_expression}.
     * @param ctx the parse tree
     */
    void enterMult_expressionMultOp(JParser.Mult_expressionMultOpContext ctx);
    /**
     * Exit a parse tree produced by the {@code mult_expressionMultOp}
     * labeled alternative in {@link JParser#mult_expression}.
     * @param ctx the parse tree
     */
    void exitMult_expressionMultOp(JParser.Mult_expressionMultOpContext ctx);
    /**
     * Enter a parse tree produced by the {@code mult_expressionTerm}
     * labeled alternative in {@link JParser#mult_expression}.
     * @param ctx the parse tree
     */
    void enterMult_expressionTerm(JParser.Mult_expressionTermContext ctx);
    /**
     * Exit a parse tree produced by the {@code mult_expressionTerm}
     * labeled alternative in {@link JParser#mult_expression}.
     * @param ctx the parse tree
     */
    void exitMult_expressionTerm(JParser.Mult_expressionTermContext ctx);
    /**
     * Enter a parse tree produced by the {@code termExpression}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void enterTermExpression(JParser.TermExpressionContext ctx);
    /**
     * Exit a parse tree produced by the {@code termExpression}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void exitTermExpression(JParser.TermExpressionContext ctx);
    /**
     * Enter a parse tree produced by the {@code termVariable}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void enterTermVariable(JParser.TermVariableContext ctx);
    /**
     * Exit a parse tree produced by the {@code termVariable}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void exitTermVariable(JParser.TermVariableContext ctx);
    /**
     * Enter a parse tree produced by the {@code termInt}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void enterTermInt(JParser.TermIntContext ctx);
    /**
     * Exit a parse tree produced by the {@code termInt}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void exitTermInt(JParser.TermIntContext ctx);
    /**
     * Enter a parse tree produced by the {@code termFloat}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void enterTermFloat(JParser.TermFloatContext ctx);
    /**
     * Exit a parse tree produced by the {@code termFloat}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void exitTermFloat(JParser.TermFloatContext ctx);
    /**
     * Enter a parse tree produced by the {@code termString}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void enterTermString(JParser.TermStringContext ctx);
    /**
     * Exit a parse tree produced by the {@code termString}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void exitTermString(JParser.TermStringContext ctx);
    /**
     * Enter a parse tree produced by the {@code termFunctionCall}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void enterTermFunctionCall(JParser.TermFunctionCallContext ctx);
    /**
     * Exit a parse tree produced by the {@code termFunctionCall}
     * labeled alternative in {@link JParser#term}.
     * @param ctx the parse tree
     */
    void exitTermFunctionCall(JParser.TermFunctionCallContext ctx);
    /**
     * Enter a parse tree produced by the {@code or_expressionOp}
     * labeled alternative in {@link JParser#or_expression}.
     * @param ctx the parse tree
     */
    void enterOr_expressionOp(JParser.Or_expressionOpContext ctx);
    /**
     * Exit a parse tree produced by the {@code or_expressionOp}
     * labeled alternative in {@link JParser#or_expression}.
     * @param ctx the parse tree
     */
    void exitOr_expressionOp(JParser.Or_expressionOpContext ctx);
    /**
     * Enter a parse tree produced by the {@code or_expressionAnd}
     * labeled alternative in {@link JParser#or_expression}.
     * @param ctx the parse tree
     */
    void enterOr_expressionAnd(JParser.Or_expressionAndContext ctx);
    /**
     * Exit a parse tree produced by the {@code or_expressionAnd}
     * labeled alternative in {@link JParser#or_expression}.
     * @param ctx the parse tree
     */
    void exitOr_expressionAnd(JParser.Or_expressionAndContext ctx);
    /**
     * Enter a parse tree produced by the {@code and_expressionOp}
     * labeled alternative in {@link JParser#and_expression}.
     * @param ctx the parse tree
     */
    void enterAnd_expressionOp(JParser.And_expressionOpContext ctx);
    /**
     * Exit a parse tree produced by the {@code and_expressionOp}
     * labeled alternative in {@link JParser#and_expression}.
     * @param ctx the parse tree
     */
    void exitAnd_expressionOp(JParser.And_expressionOpContext ctx);
    /**
     * Enter a parse tree produced by the {@code and_expressionTerm}
     * labeled alternative in {@link JParser#and_expression}.
     * @param ctx the parse tree
     */
    void enterAnd_expressionTerm(JParser.And_expressionTermContext ctx);
    /**
     * Exit a parse tree produced by the {@code and_expressionTerm}
     * labeled alternative in {@link JParser#and_expression}.
     * @param ctx the parse tree
     */
    void exitAnd_expressionTerm(JParser.And_expressionTermContext ctx);
    /**
     * Enter a parse tree produced by the {@code bool_termExpression}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void enterBool_termExpression(JParser.Bool_termExpressionContext ctx);
    /**
     * Exit a parse tree produced by the {@code bool_termExpression}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void exitBool_termExpression(JParser.Bool_termExpressionContext ctx);
    /**
     * Enter a parse tree produced by the {@code bool_termCompare}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void enterBool_termCompare(JParser.Bool_termCompareContext ctx);
    /**
     * Exit a parse tree produced by the {@code bool_termCompare}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void exitBool_termCompare(JParser.Bool_termCompareContext ctx);
    /**
     * Enter a parse tree produced by the {@code bool_termConst}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void enterBool_termConst(JParser.Bool_termConstContext ctx);
    /**
     * Exit a parse tree produced by the {@code bool_termConst}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void exitBool_termConst(JParser.Bool_termConstContext ctx);
    /**
     * Enter a parse tree produced by the {@code bool_termNot}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void enterBool_termNot(JParser.Bool_termNotContext ctx);
    /**
     * Exit a parse tree produced by the {@code bool_termNot}
     * labeled alternative in {@link JParser#bool_term}.
     * @param ctx the parse tree
     */
    void exitBool_termNot(JParser.Bool_termNotContext ctx);
    /**
     * Enter a parse tree produced by the {@code assignmentListNonArray}
     * labeled alternative in {@link JParser#assignment_list}.
     * @param ctx the parse tree
     */
    void enterAssignmentListNonArray(JParser.AssignmentListNonArrayContext ctx);
    /**
     * Exit a parse tree produced by the {@code assignmentListNonArray}
     * labeled alternative in {@link JParser#assignment_list}.
     * @param ctx the parse tree
     */
    void exitAssignmentListNonArray(JParser.AssignmentListNonArrayContext ctx);
    /**
     * Enter a parse tree produced by the {@code assignmentListArray}
     * labeled alternative in {@link JParser#assignment_list}.
     * @param ctx the parse tree
     */
    void enterAssignmentListArray(JParser.AssignmentListArrayContext ctx);
    /**
     * Exit a parse tree produced by the {@code assignmentListArray}
     * labeled alternative in {@link JParser#assignment_list}.
     * @param ctx the parse tree
     */
    void exitAssignmentListArray(JParser.AssignmentListArrayContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#assignment}.
     * @param ctx the parse tree
     */
    void enterAssignment(JParser.AssignmentContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#assignment}.
     * @param ctx the parse tree
     */
    void exitAssignment(JParser.AssignmentContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#expression_list}.
     * @param ctx the parse tree
     */
    void enterExpression_list(JParser.Expression_listContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#expression_list}.
     * @param ctx the parse tree
     */
    void exitExpression_list(JParser.Expression_listContext ctx);
    /**
     * Enter a parse tree produced by {@link JParser#id_list}.
     * @param ctx the parse tree
     */
    void enterId_list(JParser.Id_listContext ctx);
    /**
     * Exit a parse tree produced by {@link JParser#id_list}.
     * @param ctx the parse tree
     */
    void exitId_list(JParser.Id_listContext ctx);
    /**
     * Enter a parse tree produced by the {@code functionCallWrite}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void enterFunctionCallWrite(JParser.FunctionCallWriteContext ctx);
    /**
     * Exit a parse tree produced by the {@code functionCallWrite}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void exitFunctionCallWrite(JParser.FunctionCallWriteContext ctx);
    /**
     * Enter a parse tree produced by the {@code functionCallId}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void enterFunctionCallId(JParser.FunctionCallIdContext ctx);
    /**
     * Exit a parse tree produced by the {@code functionCallId}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void exitFunctionCallId(JParser.FunctionCallIdContext ctx);
    /**
     * Enter a parse tree produced by the {@code functionCallDynamic}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void enterFunctionCallDynamic(JParser.FunctionCallDynamicContext ctx);
    /**
     * Exit a parse tree produced by the {@code functionCallDynamic}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void exitFunctionCallDynamic(JParser.FunctionCallDynamicContext ctx);
    /**
     * Enter a parse tree produced by the {@code functionCallCast}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void enterFunctionCallCast(JParser.FunctionCallCastContext ctx);
    /**
     * Exit a parse tree produced by the {@code functionCallCast}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void exitFunctionCallCast(JParser.FunctionCallCastContext ctx);
    /**
     * Enter a parse tree produced by the {@code functionCallTypeof}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void enterFunctionCallTypeof(JParser.FunctionCallTypeofContext ctx);
    /**
     * Exit a parse tree produced by the {@code functionCallTypeof}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void exitFunctionCallTypeof(JParser.FunctionCallTypeofContext ctx);
    /**
     * Enter a parse tree produced by the {@code functionCallRead}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void enterFunctionCallRead(JParser.FunctionCallReadContext ctx);
    /**
     * Exit a parse tree produced by the {@code functionCallRead}
     * labeled alternative in {@link JParser#function_call}.
     * @param ctx the parse tree
     */
    void exitFunctionCallRead(JParser.FunctionCallReadContext ctx);
}