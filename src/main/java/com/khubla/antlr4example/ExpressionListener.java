// Generated from Expression.g4 by ANTLR 4.7.1
package com.khubla.antlr4example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ExpressionParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ExpressionParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(ExpressionParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(ExpressionParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(ExpressionParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(ExpressionParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ExpressionParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ExpressionParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionExterna}.
	 * @param ctx the parse tree
	 */
	void enterExpresionExterna(ExpressionParser.ExpresionExternaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionExterna}.
	 * @param ctx the parse tree
	 */
	void exitExpresionExterna(ExpressionParser.ExpresionExternaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionIf}.
	 * @param ctx the parse tree
	 */
	void enterExpresionIf(ExpressionParser.ExpresionIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionIf}.
	 * @param ctx the parse tree
	 */
	void exitExpresionIf(ExpressionParser.ExpresionIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#ramasElse}.
	 * @param ctx the parse tree
	 */
	void enterRamasElse(ExpressionParser.RamasElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#ramasElse}.
	 * @param ctx the parse tree
	 */
	void exitRamasElse(ExpressionParser.RamasElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionCase}.
	 * @param ctx the parse tree
	 */
	void enterExpresionCase(ExpressionParser.ExpresionCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionCase}.
	 * @param ctx the parse tree
	 */
	void exitExpresionCase(ExpressionParser.ExpresionCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#ramasCase}.
	 * @param ctx the parse tree
	 */
	void enterRamasCase(ExpressionParser.RamasCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#ramasCase}.
	 * @param ctx the parse tree
	 */
	void exitRamasCase(ExpressionParser.RamasCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#ramaCase}.
	 * @param ctx the parse tree
	 */
	void enterRamaCase(ExpressionParser.RamaCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#ramaCase}.
	 * @param ctx the parse tree
	 */
	void exitRamaCase(ExpressionParser.RamaCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionLet}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLet(ExpressionParser.ExpresionLetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionLet}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLet(ExpressionParser.ExpresionLetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionLambda}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLambda(ExpressionParser.ExpresionLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionLambda}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLambda(ExpressionParser.ExpresionLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionInterna}.
	 * @param ctx the parse tree
	 */
	void enterExpresionInterna(ExpressionParser.ExpresionInternaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionInterna}.
	 * @param ctx the parse tree
	 */
	void exitExpresionInterna(ExpressionParser.ExpresionInternaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(ExpressionParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(ExpressionParser.OperadorBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(ExpressionParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(ExpressionParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionAplicacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAplicacion(ExpressionParser.ExpresionAplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionAplicacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAplicacion(ExpressionParser.ExpresionAplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expresionAtomica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAtomica(ExpressionParser.ExpresionAtomicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expresionAtomica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAtomica(ExpressionParser.ExpresionAtomicaContext ctx);
}