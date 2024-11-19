// Generated from /Users/BookShelf/WorkSpace/CNU/Introduction-to-Compilers/Week12/src/tinyR3.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinyR3Parser}.
 */
public interface tinyR3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tinyR3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tinyR3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(tinyR3Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(tinyR3Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#main_decl}.
	 * @param ctx the parse tree
	 */
	void enterMain_decl(tinyR3Parser.Main_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#main_decl}.
	 * @param ctx the parse tree
	 */
	void exitMain_decl(tinyR3Parser.Main_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(tinyR3Parser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(tinyR3Parser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(tinyR3Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(tinyR3Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#local_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocal_decl(tinyR3Parser.Local_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#local_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocal_decl(tinyR3Parser.Local_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#dec_spec}.
	 * @param ctx the parse tree
	 */
	void enterDec_spec(tinyR3Parser.Dec_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#dec_spec}.
	 * @param ctx the parse tree
	 */
	void exitDec_spec(tinyR3Parser.Dec_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(tinyR3Parser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(tinyR3Parser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(tinyR3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(tinyR3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(tinyR3Parser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(tinyR3Parser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tinyR3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tinyR3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expr(tinyR3Parser.Additive_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expr(tinyR3Parser.Additive_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expr(tinyR3Parser.Multiplicative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expr(tinyR3Parser.Multiplicative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(tinyR3Parser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(tinyR3Parser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tinyR3Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tinyR3Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(tinyR3Parser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(tinyR3Parser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(tinyR3Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(tinyR3Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(tinyR3Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(tinyR3Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(tinyR3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(tinyR3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyR3Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(tinyR3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyR3Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(tinyR3Parser.IdContext ctx);
}