// Generated from /Users/BookShelf/WorkSpace/CNU/Introduction-to-Compilers/Week12/src/tinyR3.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tinyR3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tinyR3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tinyR3Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(tinyR3Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#main_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_decl(tinyR3Parser.Main_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(tinyR3Parser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(tinyR3Parser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#local_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_decl(tinyR3Parser.Local_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#dec_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_spec(tinyR3Parser.Dec_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(tinyR3Parser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(tinyR3Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(tinyR3Parser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tinyR3Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expr(tinyR3Parser.Additive_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#multiplicative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expr(tinyR3Parser.Multiplicative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(tinyR3Parser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(tinyR3Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(tinyR3Parser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(tinyR3Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(tinyR3Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(tinyR3Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyR3Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(tinyR3Parser.IdContext ctx);
}