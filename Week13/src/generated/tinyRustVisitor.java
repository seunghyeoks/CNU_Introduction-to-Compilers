// Generated from /Users/BookShelf/WorkSpace/CNU/Introduction-to-Compilers/Week13/src/tinyRust.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tinyRustParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tinyRustVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tinyRustParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(tinyRustParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#fun_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_decl(tinyRustParser.Fun_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#main_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_decl(tinyRustParser.Main_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(tinyRustParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(tinyRustParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(tinyRustParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#ret_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_type_spec(tinyRustParser.Ret_type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(tinyRustParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#local_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_decl(tinyRustParser.Local_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#dec_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_spec(tinyRustParser.Dec_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(tinyRustParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(tinyRustParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(tinyRustParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tinyRustParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expr(tinyRustParser.Additive_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expr(tinyRustParser.Multiplicative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(tinyRustParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(tinyRustParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#comparative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_expr(tinyRustParser.Comparative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#relative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative_expr(tinyRustParser.Relative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(tinyRustParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(tinyRustParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(tinyRustParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(tinyRustParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(tinyRustParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(tinyRustParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(tinyRustParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(tinyRustParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(tinyRustParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(tinyRustParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyRustParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(tinyRustParser.IdContext ctx);
}