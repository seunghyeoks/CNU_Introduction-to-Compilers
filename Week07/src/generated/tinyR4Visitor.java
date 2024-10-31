// Generated from /Users/BookShelf/WorkSpace/Java/CP/Week07/src/tinyR4.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tinyR4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tinyR4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tinyR4Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(tinyR4Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#fun_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_decl(tinyR4Parser.Fun_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(tinyR4Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(tinyR4Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(tinyR4Parser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#ret_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_type_spec(tinyR4Parser.Ret_type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(tinyR4Parser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#local_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_decl(tinyR4Parser.Local_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#dec_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_spec(tinyR4Parser.Dec_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(tinyR4Parser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(tinyR4Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(tinyR4Parser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tinyR4Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expr(tinyR4Parser.Additive_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#multiplicative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expr(tinyR4Parser.Multiplicative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(tinyR4Parser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(tinyR4Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#relative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative_expr(tinyR4Parser.Relative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#comparative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_expr(tinyR4Parser.Comparative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(tinyR4Parser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(tinyR4Parser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(tinyR4Parser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(tinyR4Parser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(tinyR4Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(tinyR4Parser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(tinyR4Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(tinyR4Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR4Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(tinyR4Parser.IdContext ctx);
}