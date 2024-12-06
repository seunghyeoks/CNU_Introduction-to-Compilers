// Generated from /Users/BookShelf/WorkSpace/CNU/Introduction-to-Compilers/Week14/src/tinyRust.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinyRustParser}.
 */
public interface tinyRustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tinyRustParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tinyRustParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(tinyRustParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(tinyRustParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl(tinyRustParser.Fun_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl(tinyRustParser.Fun_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#main_decl}.
	 * @param ctx the parse tree
	 */
	void enterMain_decl(tinyRustParser.Main_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#main_decl}.
	 * @param ctx the parse tree
	 */
	void exitMain_decl(tinyRustParser.Main_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(tinyRustParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(tinyRustParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(tinyRustParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(tinyRustParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(tinyRustParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(tinyRustParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#ret_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterRet_type_spec(tinyRustParser.Ret_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#ret_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitRet_type_spec(tinyRustParser.Ret_type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(tinyRustParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(tinyRustParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#local_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocal_decl(tinyRustParser.Local_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#local_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocal_decl(tinyRustParser.Local_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#dec_spec}.
	 * @param ctx the parse tree
	 */
	void enterDec_spec(tinyRustParser.Dec_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#dec_spec}.
	 * @param ctx the parse tree
	 */
	void exitDec_spec(tinyRustParser.Dec_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(tinyRustParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(tinyRustParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(tinyRustParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(tinyRustParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(tinyRustParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(tinyRustParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tinyRustParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tinyRustParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expr(tinyRustParser.Additive_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expr(tinyRustParser.Additive_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expr(tinyRustParser.Multiplicative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expr(tinyRustParser.Multiplicative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(tinyRustParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(tinyRustParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tinyRustParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tinyRustParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#comparative_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparative_expr(tinyRustParser.Comparative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#comparative_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparative_expr(tinyRustParser.Comparative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#relative_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelative_expr(tinyRustParser.Relative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#relative_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelative_expr(tinyRustParser.Relative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(tinyRustParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(tinyRustParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(tinyRustParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(tinyRustParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(tinyRustParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(tinyRustParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(tinyRustParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(tinyRustParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(tinyRustParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(tinyRustParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(tinyRustParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(tinyRustParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(tinyRustParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(tinyRustParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(tinyRustParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(tinyRustParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(tinyRustParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(tinyRustParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(tinyRustParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(tinyRustParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyRustParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(tinyRustParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyRustParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(tinyRustParser.IdContext ctx);
}