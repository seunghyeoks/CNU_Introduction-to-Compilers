import generated.tinyR4BaseListener;
import generated.tinyR4Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class tinyR4PrintListener extends tinyR4BaseListener implements ParseTreeListener {
    private static String output;
    ParseTreeProperty<String> r4tree = new ParseTreeProperty<>();

    public static String getOutput() {
        return output;
    }

    @Override public void exitProgram(tinyR4Parser.ProgramContext ctx) {
        String program = "";
        for (int i = 0; i < ctx.decl().size(); i++)
            program += r4tree.get(ctx.decl(i));
        output = program;
    }

    @Override public void exitDecl(tinyR4Parser.DeclContext ctx) {
        String fun_decl = r4tree.get(ctx.fun_decl());
        r4tree.put(ctx, fun_decl);
    }

    @Override public void exitFun_decl(tinyR4Parser.Fun_declContext ctx) {
        String func_sentence;

        String FUNC = ctx.FUNC().getText();
        String id = r4tree.get(ctx.id());
        String params = r4tree.get(ctx.params());
        String ret_type_spec = r4tree.get(ctx.ret_type_spec());
        String compound_stmt = r4tree.get(ctx.compound_stmt());

        func_sentence = FUNC + ' ' + id + " (" + params + ") " + ret_type_spec + compound_stmt;
        r4tree.put(ctx, func_sentence);
    }

    @Override public void exitParams(tinyR4Parser.ParamsContext ctx) {
        String params = "";

        for (int i = 0; i < ctx.param().size(); i++) {
            params += r4tree.get(ctx.param(i));
            if (i < ctx.param().size() - 1)
                params += ", ";
        }

        r4tree.put(ctx, params);
    }

    @Override public void exitParam(tinyR4Parser.ParamContext ctx) {
        String id = r4tree.get(ctx.id());
        String type_spec = r4tree.get(ctx.type_spec());

        r4tree.put(ctx, id + ':' + type_spec);
    }

    @Override public void exitType_spec(tinyR4Parser.Type_specContext ctx) {
        String U32 = ctx.U32().getText();
        r4tree.put(ctx, U32);
    }

    @Override public void exitRet_type_spec(tinyR4Parser.Ret_type_specContext ctx) {
        String exitRet_type_spec = "";

        if (ctx.RARROW() != null) {
            String RARROW = ctx.RARROW().getText();
            String type_spec = r4tree.get(ctx.type_spec());
            exitRet_type_spec += RARROW + ' ' + type_spec + ' ';
        }

        r4tree.put(ctx, exitRet_type_spec);
    }

    @Override public void exitCompound_stmt(tinyR4Parser.Compound_stmtContext ctx) {
        String compound_stmt = "";

        compound_stmt += "{\n";
        for (int i = 0; i < ctx.local_decl().size(); i++)
            compound_stmt += r4tree.get(ctx.local_decl(i));
        for (int i = 0; i < ctx.stmt().size(); i++)
            compound_stmt += r4tree.get(ctx.stmt(i));
        compound_stmt += "}\n";

        r4tree.put(ctx, compound_stmt);
    }

    @Override public void exitLocal_decl(tinyR4Parser.Local_declContext ctx) {
        String local_decl = "";

        String dec_spec = r4tree.get(ctx.dec_spec());
        String id = r4tree.get(ctx.id());
        String val = r4tree.get(ctx.val());
        if (ctx.type_spec() != null) {
            String type_spec = r4tree.get(ctx.type_spec());

            local_decl += dec_spec + ' ' + id + ':' + type_spec + '=' + val + ";\n";
        } else {
            local_decl += dec_spec + ' ' + id + '=' + val + ";\n";
        }

        r4tree.put(ctx, local_decl);
    }

    @Override public void exitDec_spec(tinyR4Parser.Dec_specContext ctx) {
        String let = ctx.LET().getText();
        if (ctx.MUT() != null) {
            String mut = ctx.MUT().getText();
            r4tree.put(ctx, let + ' ' + mut);
        } else {
            r4tree.put(ctx, let);
        }
    }

    @Override public void exitVal(tinyR4Parser.ValContext ctx) {
        if (ctx.literal() != null) {
            String literal = r4tree.get(ctx.literal());
            r4tree.put(ctx, literal);
        } else {
            String id = r4tree.get(ctx.id());
            r4tree.put(ctx, id);
        }
    }

    @Override public void exitStmt(tinyR4Parser.StmtContext ctx) {
        if (ctx.expr_stmt() != null) {
            String expr_stmt = r4tree.get(ctx.expr_stmt());
            r4tree.put(ctx, expr_stmt);
        } else if (ctx.compound_stmt() != null) {
            String compound_stmt = r4tree.get(ctx.compound_stmt());
            r4tree.put(ctx, compound_stmt);
        } else if (ctx.if_stmt() != null) {
            String if_stmt = r4tree.get(ctx.if_stmt());
            r4tree.put(ctx, if_stmt);
        } else if (ctx.for_stmt() != null) {
            String for_stmt = r4tree.get(ctx.for_stmt());
            r4tree.put(ctx, for_stmt);
        } else if (ctx.return_stmt() != null) {
            String return_stmt = r4tree.get(ctx.return_stmt());
            r4tree.put(ctx, return_stmt);
        } else if (ctx.break_stmt() != null) {
            String break_stmt = r4tree.get(ctx.break_stmt());
            r4tree.put(ctx, break_stmt);
        } else if (ctx.loop_stmt() != null) {
            String loop_stmt = r4tree.get(ctx.loop_stmt());
            r4tree.put(ctx, loop_stmt);
        }
    }

    @Override public void exitReturn_stmt(tinyR4Parser.Return_stmtContext ctx) {
        String ret = ctx.RETURN().getText();
        String expr = r4tree.get(ctx.expr());

        r4tree.put(ctx, ret + ' ' + expr + ";\n");
    }

    @Override public void exitExpr_stmt(tinyR4Parser.Expr_stmtContext ctx) {
        String expr_stmt = "";

        String expr = r4tree.get(ctx.expr());
        expr_stmt += expr + ";\n";

        r4tree.put(ctx, expr_stmt);
    }

    @Override public void exitExpr(tinyR4Parser.ExprContext ctx) {
        if (ctx.additive_expr() != null) {
            String additive_expr = r4tree.get(ctx.additive_expr());
            r4tree.put(ctx, additive_expr);
        } else if (ctx.relative_expr() != null) {
            String relative_expr = r4tree.get(ctx.relative_expr());
            r4tree.put(ctx, relative_expr);
        } else if (ctx.id() != null) {
            String id = r4tree.get(ctx.id());
            String expr = r4tree.get(ctx.expr());
            r4tree.put(ctx, id + '=' + expr);
        }
    }

    @Override public void exitAdditive_expr(tinyR4Parser.Additive_exprContext ctx) {
        if (ctx.left == ctx.additive_expr() && ctx.op != null && (ctx.op.getText().equals("+") || ctx.op.getText().equals("-")) && ctx.right == ctx.multiplicative_expr()) {
            String left = r4tree.get(ctx.additive_expr());
            String op = ctx.op.getText();
            String right = r4tree.get(ctx.multiplicative_expr());
            r4tree.put(ctx, left + ' ' + op + ' ' + right);
        } else {
            String multiplicative_expr = r4tree.get(ctx.multiplicative_expr());
            r4tree.put(ctx, multiplicative_expr);
        }
    }

    @Override public void exitMultiplicative_expr(tinyR4Parser.Multiplicative_exprContext ctx) {
        if (ctx.left == ctx.multiplicative_expr() && ctx.op != null && (ctx.op.getText().equals("*") || ctx.op.getText().equals("/") || ctx.op.getText().equals("%")) && ctx.right == ctx.unary_expr()) {
            String left = r4tree.get(ctx.multiplicative_expr());
            String op = ctx.op.getText();
            String right = r4tree.get(ctx.unary_expr());
            r4tree.put(ctx, left + ' ' + op + ' ' + right);
        } else {
            String unary_expr = r4tree.get(ctx.unary_expr());
            r4tree.put(ctx, unary_expr);
        }
    }

    @Override public void exitUnary_expr(tinyR4Parser.Unary_exprContext ctx) {
        if (ctx.op != null && (ctx.op.getText().equals("-") || ctx.op.getText().equals("+") || ctx.op.getText().equals("--") || ctx.op.getText().equals("++") || ctx.op.getText().equals("!"))) {
            String op = ctx.op.getText();
            String expr = r4tree.get(ctx.expr());
            r4tree.put(ctx, op + expr);
        } else {
            String factor = r4tree.get(ctx.factor());
            r4tree.put(ctx, factor);
        }
    }

    @Override
    public void exitFactor(tinyR4Parser.FactorContext ctx) {
        if (ctx.literal() != null) {
            String literal = r4tree.get(ctx.literal());
            r4tree.put(ctx, literal);
        } else if (ctx.id() != null && ctx.args() == null) {
            String id = r4tree.get(ctx.id());
            r4tree.put(ctx, id);
        } else if (ctx.expr() != null) {
            String expr = r4tree.get(ctx.expr());
            r4tree.put(ctx, '(' + expr + ')');
        } else if (ctx.id() != null && ctx.args() != null) {
            String id = r4tree.get(ctx.id());
            String args = r4tree.get(ctx.args());

            if (ctx.getChild(1).getText().equals("!")) {
                r4tree.put(ctx, id + '!' + '(' + args + ')');
            } else {
                r4tree.put(ctx, id + '(' + args + ')');
            }
        }
    }



    @Override public void exitArgs(tinyR4Parser.ArgsContext ctx) {
        String args = "";

        for (int i = 0; i < ctx.expr().size(); i++) {
            args += r4tree.get(ctx.expr(i));
            if (i < ctx.expr().size() - 1) {
                args += ", ";
            }
        }

        r4tree.put(ctx, args);
    }



    @Override public void exitLiteral(tinyR4Parser.LiteralContext ctx) {
        String literal = ctx.LITERAL().getText();
        r4tree.put(ctx, literal);
    }

    @Override public void exitId(tinyR4Parser.IdContext ctx) {
        String id = ctx.ID().getText();
        r4tree.put(ctx, id);
    }


}
