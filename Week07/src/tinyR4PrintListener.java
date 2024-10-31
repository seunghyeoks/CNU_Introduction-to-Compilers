import generated.tinyR4BaseListener;
import generated.tinyR4Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class tinyR4PrintListener extends tinyR4BaseListener implements ParseTreeListener {
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
        else {
            StringBuilder params = new StringBuilder();

            for (int i = 0; i < ctx.param().size(); i++) {
                params.append(r4Tree.get(ctx.param(i)));
                if (i < ctx.param().size() - 1)
                    params.append(", ");
            }

            r4Tree.put(ctx, params.toString());
        }
    }


    @Override public void exitParam(tinyR4Parser.ParamContext ctx) {
        String id = r4Tree.get(ctx.id());
        String type_spec = r4Tree.get(ctx.type_spec());

        r4Tree.put(ctx, id + ':' + type_spec);
    }


    @Override public void exitType_spec(tinyR4Parser.Type_specContext ctx) {
        String U32 = ctx.U32().getText();
        r4Tree.put(ctx, U32);
    }

    @Override public void exitRet_type_spec(tinyR4Parser.Ret_type_specContext ctx) {
        if (ctx.getChildCount() == 0)
            r4Tree.put(ctx, "");
        else if (ctx.RARROW() != null) {
            String RARROW = ctx.RARROW().getText();
            String type_spec = r4Tree.get(ctx.type_spec());
            r4Tree.put(ctx, RARROW + ' ' + type_spec + ' ');
        }
    }

    @Override public void exitCompound_stmt(tinyR4Parser.Compound_stmtContext ctx) {
        StringBuilder result = new StringBuilder();
        int local_count = ctx.local_decl().size();
        int stmt_count = ctx.stmt().size();
        for (int i = 0; i < local_count; i++)
            result.append(r4Tree.get(ctx.local_decl(i)));
        for (int i = 0; i < stmt_count; i++)
            result.append(r4Tree.get(ctx.stmt(i)));
        r4Tree.put(ctx, "{\n" + result + "}\n");
    }

    @Override public void exitLocal_decl(tinyR4Parser.Local_declContext ctx) {
        String local_decl = "";

        String dec_spec = r4Tree.get(ctx.dec_spec());
        String id = r4Tree.get(ctx.id());
        String val = r4Tree.get(ctx.val());
        local_decl += dec_spec + ' ' + id;
        if (ctx.type_spec() != null) {
            String type_spec = r4Tree.get(ctx.type_spec());

            local_decl += ":" + type_spec;
        }
        local_decl += " = " + val + ";\n";

        r4Tree.put(ctx, local_decl);
    }

    @Override public void exitDec_spec(tinyR4Parser.Dec_specContext ctx) {
        String let = ctx.LET().getText();
        if (ctx.MUT() != null) {
            String mut = ctx.MUT().getText();
            r4Tree.put(ctx, let + ' ' + mut);
        } else {
            r4Tree.put(ctx, let);
        }
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
        if (ctx.expr_stmt() != null)
            result = r4Tree.get(ctx.expr_stmt());
        else if (ctx.compound_stmt() != null)
            result = r4Tree.get(ctx.compound_stmt());
        else if (ctx.if_stmt() != null)
            result = r4Tree.get(ctx.if_stmt());
        else if (ctx.for_stmt() != null)
            result = r4Tree.get(ctx.for_stmt());
        else if (ctx.return_stmt() != null)
            result = r4Tree.get(ctx.return_stmt());
        else if (ctx.break_stmt() != null)
            result = r4Tree.get(ctx.break_stmt());
        else if (ctx.loop_stmt() != null)
            result = r4Tree.get(ctx.loop_stmt());

        r4Tree.put(ctx, result);
    }

    @Override public void exitExpr_stmt(tinyR4Parser.Expr_stmtContext ctx) {
        String expr = r4Tree.get(ctx.expr());
        r4Tree.put(ctx, expr + ";\n");
    }

    @Override public void exitExpr(tinyR4Parser.ExprContext ctx) {
        String result = "";
        if(ctx.additive_expr() != null)
            result = r4Tree.get(ctx.additive_expr());
        else if(ctx.relative_expr() != null)
            result = r4Tree.get(ctx.relative_expr());
        else if (ctx.id() != null) {
            result += r4Tree.get(ctx.id());
            result += " = ";
            result += r4Tree.get(ctx.expr());
        }
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
        else if (ctx.args() != null) {
            result += r4Tree.get(ctx.id());
            if (ctx.getChild(1).getText().equals("!"))
                result += "!";
            result += '(' + r4Tree.get(ctx.args()) + ')';
        } else {
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

    @Override public void exitIf_stmt(tinyR4Parser.If_stmtContext ctx) {
        String result = "";
        result += ctx.IF().getText();
        result += r4Tree.get(ctx.relative_expr());
        result += r4Tree.get(ctx.compound_stmt(0));
        if (ctx.ELSE() != null) {
            result += ctx.ELSE();
            result += r4Tree.get(ctx.compound_stmt(1));
        }
        r4Tree.put(ctx, result);
    }

    @Override public void exitFor_stmt(tinyR4Parser.For_stmtContext ctx) {
        String result = "";
        result += ctx.FOR().getText() + " ";
        result += r4Tree.get(ctx.id());
        result += " in ";
        result += r4Tree.get(ctx.range()) + " ";
        result += r4Tree.get(ctx.compound_stmt());
        r4Tree.put(ctx, result);
    }

    @Override public void exitLoop_stmt(tinyR4Parser.Loop_stmtContext ctx) {
        String result = "";
        result += ctx.LOOP().getText() + " ";
        result += r4Tree.get(ctx.compound_stmt());
        r4Tree.put(ctx, result);
    }

    @Override public void exitRange(tinyR4Parser.RangeContext ctx) {
        String result = "";
        result += ctx.literal(0).getText() + "..";
        if (ctx.getChild(1).getText().equals("="))
            result += "=";
        result += ctx.literal(1).getText();
        r4Tree.put(ctx, result);
    }

    @Override public void exitReturn_stmt(tinyR4Parser.Return_stmtContext ctx) {
        String ret = ctx.RETURN().getText();
        String expr = r4Tree.get(ctx.expr());

        r4Tree.put(ctx, ret + ' ' + expr + ";\n");
    }

    @Override public void exitBreak_stmt(tinyR4Parser.Break_stmtContext ctx) {
        r4Tree.put(ctx, ctx.BREAK().getText() + ";\n");
    }

    @Override public void exitArgs(tinyR4Parser.ArgsContext ctx) {
        int count = ctx.getChildCount();
        if(count == 0)
            r4Tree.put(ctx, "");
        else {
            StringBuilder params = new StringBuilder();

            for (int i = 0; i < ctx.expr().size(); i++) {
                params.append(r4Tree.get(ctx.expr(i)));
                if (i < ctx.expr().size() - 1)
                    params.append(", ");
            }

            r4Tree.put(ctx, params.toString());
        }
    }

    @Override public void exitLiteral(tinyR4Parser.LiteralContext ctx) {
        r4Tree.put(ctx, ctx.LITERAL().getText());
    }

    @Override public void exitId(tinyR4Parser.IdContext ctx) {
        r4Tree.put(ctx, ctx.ID().getText());
    }
}
