// Generated from /Users/BookShelf/WorkSpace/Java/CP/Week05/src/tinyR4.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinyR4Parser}.
 */
public interface tinyR4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tinyR4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tinyR4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(tinyR4Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(tinyR4Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl(tinyR4Parser.Fun_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl(tinyR4Parser.Fun_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(tinyR4Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(tinyR4Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(tinyR4Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(tinyR4Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(tinyR4Parser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(tinyR4Parser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#ret_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterRet_type_spec(tinyR4Parser.Ret_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#ret_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitRet_type_spec(tinyR4Parser.Ret_type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(tinyR4Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(tinyR4Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#local_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocal_decl(tinyR4Parser.Local_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#local_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocal_decl(tinyR4Parser.Local_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#dec_spec}.
	 * @param ctx the parse tree
	 */
	void enterDec_spec(tinyR4Parser.Dec_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#dec_spec}.
	 * @param ctx the parse tree
	 */
	void exitDec_spec(tinyR4Parser.Dec_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(tinyR4Parser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(tinyR4Parser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(tinyR4Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(tinyR4Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(tinyR4Parser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(tinyR4Parser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tinyR4Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tinyR4Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expr(tinyR4Parser.Additive_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expr(tinyR4Parser.Additive_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expr(tinyR4Parser.Multiplicative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expr(tinyR4Parser.Multiplicative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(tinyR4Parser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(tinyR4Parser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tinyR4Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tinyR4Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#relative_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelative_expr(tinyR4Parser.Relative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#relative_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelative_expr(tinyR4Parser.Relative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#comparative_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparative_expr(tinyR4Parser.Comparative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#comparative_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparative_expr(tinyR4Parser.Comparative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(tinyR4Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(tinyR4Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(tinyR4Parser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(tinyR4Parser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(tinyR4Parser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(tinyR4Parser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(tinyR4Parser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(tinyR4Parser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(tinyR4Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(tinyR4Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(tinyR4Parser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(tinyR4Parser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(tinyR4Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(tinyR4Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(tinyR4Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(tinyR4Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR4Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(tinyR4Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR4Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(tinyR4Parser.IdContext ctx);
}