import generated.tinyR4BaseListener;
import generated.tinyR4Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class tinyR4UglyPrintListener extends tinyR4BaseListener implements ParseTreeListener {
    private static String output;
    ParseTreeProperty<String> r4Tree = new ParseTreeProperty<>();

    public static String getOutput() {
        return output;
    }

    @Override public void exitProgram(tinyR4Parser.ProgramContext ctx) {
        StringBuilder program = new StringBuilder();
        for (int i = 0; i < ctx.decl().size(); i++)
            program.append(r4Tree.get(ctx.decl(i)));
        output = program.toString();
    }

    @Override public void exitDecl(tinyR4Parser.DeclContext ctx) {
        String fun_decl = r4Tree.get(ctx.fun_decl());
        r4Tree.put(ctx, fun_decl);
    }

    @Override public void exitFun_decl(tinyR4Parser.Fun_declContext ctx) {
        String fun = ctx.FUNC().getText();
        String id = r4Tree.get(ctx.id());
        String params = r4Tree.get(ctx.params());
        String ret_type_spec = r4Tree.get(ctx.ret_type_spec());
        String compound_stmt = r4Tree.get(ctx.compound_stmt());
        r4Tree.put(ctx, fun + " " + id + "(" + params + ") " + ret_type_spec + compound_stmt);
    }

    @Override public void exitParams(tinyR4Parser.ParamsContext ctx) {
        int count = ctx.getChildCount();
        if(count == 0)
            r4Tree.put(ctx, "");
    }

    @Override public void exitRet_type_spec(tinyR4Parser.Ret_type_specContext ctx) {
        if(ctx.getChildCount() == 0)
            r4Tree.put(ctx, "");
    }

    @Override public void exitCompound_stmt(tinyR4Parser.Compound_stmtContext ctx) {
        StringBuilder result = new StringBuilder();
        int local_count = ctx.local_decl().size();
        int stmt_count = ctx.stmt().size();
        for (int i = 0; i < local_count; i++)
            result.append(r4Tree.get(ctx.local_decl(i)));
        for (int i = 0; i < stmt_count; i++)
            result.append(r4Tree.get(ctx.stmt(i)));
        r4Tree.put(ctx, "{" + result + "}");
    }

    @Override public void exitVal(tinyR4Parser.ValContext ctx) {
        String result = "";
        if(ctx.literal() != null)
            result = r4Tree.get(ctx.literal());
        else if(ctx.id() != null)
            result = r4Tree.get(ctx.id());
        r4Tree.put(ctx, result);
    }

    @Override public void exitStmt(tinyR4Parser.StmtContext ctx) {
        String result = "";
        if(ctx.expr_stmt() != null)
            result = r4Tree.get(ctx.expr_stmt());
        r4Tree.put(ctx, result);
    }

    @Override public void exitExpr_stmt(tinyR4Parser.Expr_stmtContext ctx) {
        String expr = r4Tree.get(ctx.expr());
        r4Tree.put(ctx, expr + ";");
    }

    @Override public void exitExpr(tinyR4Parser.ExprContext ctx) {
        String result = "";
        if(ctx.additive_expr() != null)
            result = r4Tree.get(ctx.additive_expr());
        else if(ctx.relative_expr() != null)
            result = r4Tree.get(ctx.relative_expr());
        r4Tree.put(ctx, result);
    }

    @Override public void exitAdditive_expr(tinyR4Parser.Additive_exprContext ctx) {
        String result = "";
        if(ctx.additive_expr() != null) {
            String left = r4Tree.get(ctx.additive_expr());
            String op = ctx.getChild(1).getText();
            String right = r4Tree.get(ctx.multiplicative_expr());
            result = left + " " + op + " " + right;
        } else
            result = r4Tree.get(ctx.multiplicative_expr());
        r4Tree.put(ctx, result);
    }

    @Override public void exitMultiplicative_expr(tinyR4Parser.Multiplicative_exprContext ctx) {
        String result = "";
        if(ctx.multiplicative_expr() != null) {
            String left = r4Tree.get(ctx.multiplicative_expr());
            String op = ctx.getChild(1).getText();
            String right = r4Tree.get(ctx.unary_expr());
            result = left + " " + op + " " + right;
        } else
            result = r4Tree.get(ctx.unary_expr());
        r4Tree.put(ctx, result);
    }

    @Override public void exitUnary_expr(tinyR4Parser.Unary_exprContext ctx) {
        String result = "";
        if(ctx.expr() != null) {
            String op = ctx.getChild(0).getText();
            String expr = r4Tree.get(ctx.expr());
            result = op + expr;
        } else
            result = r4Tree.get(ctx.factor());
        r4Tree.put(ctx, result);
    }

    @Override public void exitFactor(tinyR4Parser.FactorContext ctx) {
        String result = "";
        if(ctx.expr() != null)
            result = "(" + r4Tree.get(ctx.expr()) + ")";
        else {
            if(ctx.literal() != null)
                result = r4Tree.get(ctx.literal());
            else
                result = r4Tree.get(ctx.id());
        }
        r4Tree.put(ctx, result);
    }

    @Override public void exitRelative_expr(tinyR4Parser.Relative_exprContext ctx) {
        String result = "";
        if(ctx.relative_expr() != null) {
            String left = r4Tree.get(ctx.relative_expr());
            String op = ctx.getChild(1).getText();
            String right = r4Tree.get(ctx.comparative_expr());
            result = left + " " + op + " " + right;
        } else
            result = r4Tree.get(ctx.comparative_expr());
        r4Tree.put(ctx, result);
    }

    @Override public void exitComparative_expr(tinyR4Parser.Comparative_exprContext ctx) {
        String result = "";
        if(ctx.comparative_expr() != null) {
            String left = r4Tree.get(ctx.comparative_expr());
            String op = ctx.getChild(1).getText();
            String right = r4Tree.get(ctx.additive_expr());
            result = left + " " + op + " " + right;
        } else
            result = r4Tree.get(ctx.additive_expr());
        r4Tree.put(ctx, result);
    }

    @Override public void exitLiteral(tinyR4Parser.LiteralContext ctx) {
        r4Tree.put(ctx, ctx.LITERAL().getText());
    }

    @Override public void exitId(tinyR4Parser.IdContext ctx) {
        r4Tree.put(ctx, ctx.ID().getText());
    }

}
