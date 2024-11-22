import generated.tinyR3BaseListener;
import generated.tinyR3Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class tinyR3PrintListener extends tinyR3BaseListener implements ParseTreeListener {
    private static String output;
    private int depth = 0;  // {} 레벨
    ParseTreeProperty<String> r3Tree = new ParseTreeProperty<>();

    public static String getOutput() {
        return output;
    }

    // @Override public void enterProgram(tinyR3Parser.ProgramContext ctx) {}

    @Override public void exitProgram(tinyR3Parser.ProgramContext ctx) {
        StringBuilder program = new StringBuilder();
        for (int i = 0; i < ctx.decl().size(); i++)
            program.append(r3Tree.get(ctx.decl(i)));
        output = program.toString();
    }

    @Override public void enterDecl(tinyR3Parser.DeclContext ctx) {
        String prologue = """
                .class public Test
                .super java/lang/Object
                ; strandard initializer
                .method public <init>()V
                aload_0
                invokenonvirtual java/lang/Object/<init>()V
                return
                .end method
                """;
        r3Tree.put(ctx, prologue);
    }

    @Override public void exitDecl(tinyR3Parser.DeclContext ctx) {
        String prologue = r3Tree.get(ctx);
        String fun_decl = r3Tree.get(ctx.main_decl());
        r3Tree.put(ctx, prologue + fun_decl);
    }

    @Override public void enterMain_decl(tinyR3Parser.Main_declContext ctx) {
        String prologue = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 32
                .limit locals 32
                """;
        r3Tree.put(ctx, prologue);
    }

    @Override public void exitMain_decl(tinyR3Parser.Main_declContext ctx) {
        String prologue = r3Tree.get(ctx);
        String compound_stmt = r3Tree.get(ctx.compound_stmt());
        String epilogue = ".end method";
        r3Tree.put(ctx, prologue + compound_stmt + epilogue);
    }

    @Override public void enterType_spec(tinyR3Parser.Type_specContext ctx) {

    }

    @Override public void exitType_spec(tinyR3Parser.Type_specContext ctx) {
        String U32 = ctx.U32().getText();
        r3Tree.put(ctx, U32);
    }

    // {} 마다 중첩 횟수를 계산 하기 위해 depth 를 사용
    @Override public void enterCompound_stmt(tinyR3Parser.Compound_stmtContext ctx) {
        depth++;
    }

    // 나갈때는 depth 줄이기
    @Override public void exitCompound_stmt(tinyR3Parser.Compound_stmtContext ctx) {
        StringBuilder result = new StringBuilder();
        int local_count = ctx.local_decl().size();
        int stmt_count = ctx.stmt().size();
        for (int i = 0; i < local_count; i++) {
            result.append("\t".repeat(Math.max(0, depth)));
            result.append(r3Tree.get(ctx.local_decl(i)));
        }
        for (int i = 0; i < stmt_count; i++) {
            result.append("\t".repeat(Math.max(0, depth)));
            result.append(r3Tree.get(ctx.stmt(i)));
        }

        depth--;
        result.append("\t".repeat(Math.max(0, depth)));
        r3Tree.put(ctx, "{\n" + result + "}\n");
    }

    @Override public void enterLocal_decl(tinyR3Parser.Local_declContext ctx) {

    }

    @Override public void exitLocal_decl(tinyR3Parser.Local_declContext ctx) {
        String local_decl = "";

        String dec_spec = r3Tree.get(ctx.dec_spec());
        String id = r3Tree.get(ctx.id());
        String val = r3Tree.get(ctx.val());
        local_decl += dec_spec + ' ' + id;
        if (ctx.type_spec() != null) {
            String type_spec = r3Tree.get(ctx.type_spec());

            local_decl += ":" + type_spec;
        }
        local_decl += " = " + val + ";\n";

        r3Tree.put(ctx, local_decl);
    }

    @Override public void enterDec_spec(tinyR3Parser.Dec_specContext ctx) {

    }

    @Override public void exitDec_spec(tinyR3Parser.Dec_specContext ctx) {
        String let = ctx.LET().getText();
        if (ctx.MUT() != null) {
            String mut = ctx.MUT().getText();
            r3Tree.put(ctx, let + ' ' + mut);
        } else {
            r3Tree.put(ctx, let);
        }
    }

    @Override public void enterVal(tinyR3Parser.ValContext ctx) { }

    @Override public void exitVal(tinyR3Parser.ValContext ctx) {
        String result = "";
        if(ctx.literal() != null)
            result = r3Tree.get(ctx.literal());
        else if(ctx.id() != null)
            result = r3Tree.get(ctx.id());
        r3Tree.put(ctx, result);
    }

    @Override public void enterStmt(tinyR3Parser.StmtContext ctx) { }

    @Override public void exitStmt(tinyR3Parser.StmtContext ctx) {
        String result = "";
        if (ctx.expr_stmt() != null)
            result = r3Tree.get(ctx.expr_stmt());
        else if (ctx.compound_stmt() != null)
            result = r3Tree.get(ctx.compound_stmt());

        r3Tree.put(ctx, result);
    }

    @Override public void enterExpr_stmt(tinyR3Parser.Expr_stmtContext ctx) { }

    @Override public void exitExpr_stmt(tinyR3Parser.Expr_stmtContext ctx) {
        String expr = r3Tree.get(ctx.expr());
        r3Tree.put(ctx, expr + ";\n");
    }

    @Override public void enterExpr(tinyR3Parser.ExprContext ctx) { }

    @Override public void exitExpr(tinyR3Parser.ExprContext ctx) {
        String result = "";
        if(ctx.additive_expr() != null)
            result = r3Tree.get(ctx.additive_expr());
        else if (ctx.id() != null) {
            result += r3Tree.get(ctx.id());
            result += " = ";
            result += r3Tree.get(ctx.expr());
        }
        r3Tree.put(ctx, result);
    }

    @Override public void enterAdditive_expr(tinyR3Parser.Additive_exprContext ctx) { }

    @Override public void exitAdditive_expr(tinyR3Parser.Additive_exprContext ctx) {
        String result;
        if(ctx.additive_expr() != null) {
            String left = r3Tree.get(ctx.additive_expr());
            String op = ctx.getChild(1).getText();
            String right = r3Tree.get(ctx.multiplicative_expr());
            result = left + " " + op + " " + right;
        } else
            result = r3Tree.get(ctx.multiplicative_expr());
        r3Tree.put(ctx, result);
    }

    @Override public void enterMultiplicative_expr(tinyR3Parser.Multiplicative_exprContext ctx) { }

    @Override public void exitMultiplicative_expr(tinyR3Parser.Multiplicative_exprContext ctx) {
        String result;
        if(ctx.multiplicative_expr() != null) {
            String left = r3Tree.get(ctx.multiplicative_expr());
            String op = ctx.getChild(1).getText();
            String right = r3Tree.get(ctx.unary_expr());
            result = left + " " + op + " " + right;
        } else
            result = r3Tree.get(ctx.unary_expr());
        r3Tree.put(ctx, result);
    }

    @Override public void enterUnary_expr(tinyR3Parser.Unary_exprContext ctx) { }

    @Override public void exitUnary_expr(tinyR3Parser.Unary_exprContext ctx) {
        String result;
        if(ctx.expr() != null) {
            String op = ctx.getChild(0).getText();
            String expr = r3Tree.get(ctx.expr());
            result = op + expr;
        } else
            result = r3Tree.get(ctx.factor());
        r3Tree.put(ctx, result);
    }

    @Override public void enterFactor(tinyR3Parser.FactorContext ctx) { }

    @Override public void exitFactor(tinyR3Parser.FactorContext ctx) {
        String result = "";
        if(ctx.expr() != null)
            result = "(" + r3Tree.get(ctx.expr()) + ")";
        else if (ctx.args() != null) {
            result += r3Tree.get(ctx.id());
            if (ctx.getChild(1).getText().equals("!"))
                result += "!";
            result += '(' + r3Tree.get(ctx.args()) + ')';
        } else {
            if(ctx.literal() != null)
                result = r3Tree.get(ctx.literal());
            else
                result = r3Tree.get(ctx.id());
        }
        r3Tree.put(ctx, result);
    }

    @Override public void enterPrint_stmt(tinyR3Parser.Print_stmtContext ctx) { }

    @Override public void exitPrint_stmt(tinyR3Parser.Print_stmtContext ctx) { }

    @Override public void enterReturn_stmt(tinyR3Parser.Return_stmtContext ctx) { }

    @Override public void exitReturn_stmt(tinyR3Parser.Return_stmtContext ctx) {
        String result = "";
        result += ctx.RETURN().getText();
        if (ctx.expr() != null)
            result += " " + r3Tree.get(ctx.expr());

        r3Tree.put(ctx, result + ";\n");
    }

    @Override public void enterArgs(tinyR3Parser.ArgsContext ctx) { }

    @Override public void exitArgs(tinyR3Parser.ArgsContext ctx) {
        int count = ctx.getChildCount();
        if(count == 0)
            r3Tree.put(ctx, "");
        else {
            StringBuilder params = new StringBuilder();

            for (int i = 0; i < ctx.expr().size(); i++) {
                params.append(r3Tree.get(ctx.expr(i)));
                if (i < ctx.expr().size() - 1)
                    params.append(", ");
            }

            r3Tree.put(ctx, params.toString());
        }
    }

    @Override public void enterLiteral(tinyR3Parser.LiteralContext ctx) { }

    @Override public void exitLiteral(tinyR3Parser.LiteralContext ctx) {
        r3Tree.put(ctx, ctx.LITERAL().getText());
    }

    @Override public void enterId(tinyR3Parser.IdContext ctx) { }

    @Override public void exitId(tinyR3Parser.IdContext ctx) {
        r3Tree.put(ctx, ctx.ID().getText());
    }
}
