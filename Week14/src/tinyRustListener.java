import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import generated.tinyRustBaseListener;
import generated.tinyRustParser;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class tinyRustListener extends tinyRustBaseListener implements ParseTreeListener{
    ParseTreeProperty<String> rustTree = new ParseTreeProperty<>();

    private static FileWriter fw;
    static HashMap<String, Integer> localVarMap;
    static HashMap<String, String> globalFuncMap;
    static int localVar_curIdx = 0;
    static int labelNum = 0;
    static String tempLabel_True, tempLabel_Else, tempLabel_End, tempLabel_Temp;  // If
    static String tempLabel_Break, tempLabel_Loop, tempI;  // For, Loop

    private static void assignLocalVar(String VarName){
        if(!(localVarMap.containsKey(VarName))) localVarMap.put(VarName, localVar_curIdx);
        localVar_curIdx++;
    }

    private static int getLocalVarTableIdx(String VarName) {
        return localVarMap.get(VarName);
    }


    @Override public void enterProgram(tinyRustParser.ProgramContext ctx) {
        // 파일 출력
        File outputFile = new File("./src/Test.j");

        globalFuncMap = new HashMap<>();

        try {
            if (!outputFile.exists()) {
                if(!outputFile.createNewFile()) throw new Exception("파일 생성 실패");
            }

            fw = new FileWriter(outputFile);
            fw.write("""
                .class public Test
                .super java/lang/Object
                ; strandard initializer
                .method public <init>()V
                aload_0
                invokenonvirtual java/lang/Object/<init>()V
                return
                .end method
                
                """);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test 클래스 정의 및 기본 생성자

    }

    @Override public void exitProgram(tinyRustParser.ProgramContext ctx) {
        StringBuilder program = new StringBuilder();
        for (int i = 0; i < ctx.decl().size(); i++)
            program.append(rustTree.get(ctx.decl(i)));
        // 프로그램 끝 : output 파일에 write
        try {
            fw.write(program.toString());
            fw.flush();

            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override public void enterDecl(tinyRustParser.DeclContext ctx) {
        localVarMap = new HashMap<>();
        localVar_curIdx = 0;
        labelNum = 0;
    }

    @Override public void exitDecl(tinyRustParser.DeclContext ctx) {
        if (ctx.main_decl() != null) {
            String main_decl = rustTree.get(ctx.main_decl());
            rustTree.put(ctx, main_decl);
        } else {
            String fun_decl = rustTree.get(ctx.fun_decl());
            rustTree.put(ctx, fun_decl);
        }
    }

    @Override public void exitFun_decl(tinyRustParser.Fun_declContext ctx) {
        String func = ctx.id().getText() + rustTree.get(ctx.params()) + rustTree.get(ctx.ret_type_spec());
        globalFuncMap.put(ctx.id().getText(), func);

        String result = "";
        result += ".method public static " + func + "\n";
        result += ".limit stack 32\n.limit locals 32\n";
        result += rustTree.get(ctx.compound_stmt());
        result += ".end method\n\n";

        rustTree.put(ctx, result);
    }

    @Override public void exitMain_decl(tinyRustParser.Main_declContext ctx) {
        String result = "";
        result += """
        .method public static main([Ljava/lang/String;)V
        .limit stack 32
        .limit locals 32
        """;
        result += rustTree.get(ctx.compound_stmt());
        result += ".end method\n\n";
        rustTree.put(ctx, result);
    }

    @Override public void exitParams(tinyRustParser.ParamsContext ctx) {
        StringBuilder result = new StringBuilder("(");
        for (tinyRustParser.ParamContext param : ctx.param()) {
            result.append(rustTree.get(param));
        }
        result.append(")");
        rustTree.put(ctx, result.toString());
    }

    @Override public void exitParam(tinyRustParser.ParamContext ctx) {
        assignLocalVar(ctx.id().getText());
        if (ctx.type_spec() != null) {
            rustTree.put(ctx, "I");
        }
    }

    @Override public void exitType_spec(tinyRustParser.Type_specContext ctx) {
        rustTree.put(ctx, "");
    }

    @Override public void exitRet_type_spec(tinyRustParser.Ret_type_specContext ctx) {
        if (ctx.type_spec() != null) {
            rustTree.put(ctx, "I");
        } else {
            rustTree.put(ctx, "V");
        }
    }

    @Override public void exitCompound_stmt(tinyRustParser.Compound_stmtContext ctx) {
        StringBuilder result = new StringBuilder();
        int local_count = ctx.local_decl().size();
        int stmt_count = ctx.stmt().size();
        for (int i = 0; i < local_count; i++)
            result.append(rustTree.get(ctx.local_decl(i)));
        for (int i = 0; i < stmt_count; i++)
            result.append(rustTree.get(ctx.stmt(i)));
        rustTree.put(ctx, result.toString());
    }

    @Override public void exitLocal_decl(tinyRustParser.Local_declContext ctx) {//변수 할당(Assignment)
        String result = "";
        String val = rustTree.get(ctx.val());
        String id = rustTree.get(ctx.id());
        if(localVarMap.containsKey(id))
            result = "istore_" + getLocalVarTableIdx(id);
        else {
            result = "istore_" + localVar_curIdx;
            assignLocalVar(id);
        }
        rustTree.put(ctx, val + result + "\n");
    }

    @Override public void exitVal(tinyRustParser.ValContext ctx) {//변수 할당 우변의, 할당될 값
        String result = "";
        if(ctx.literal() != null)
            result = "bipush " + rustTree.get(ctx.literal());
        else if(ctx.id() != null)
            result = "iload_" + getLocalVarTableIdx(rustTree.get(ctx.id()));
        rustTree.put(ctx, result + "\n");
    }

    @Override public void exitStmt(tinyRustParser.StmtContext ctx) {
        String result = "";
        if(ctx.expr_stmt() != null)
            result = rustTree.get(ctx.expr_stmt());
        else if(ctx.assignment_stmt() != null)
            result = rustTree.get(ctx.assignment_stmt());
        else if(ctx.compound_stmt() != null)
            result = rustTree.get(ctx.compound_stmt());
        else if(ctx.if_stmt() != null)
            result = rustTree.get(ctx.if_stmt());
        else if(ctx.for_stmt() != null)
            result = rustTree.get(ctx.for_stmt());
        else if(ctx.return_stmt() != null)
            result = rustTree.get(ctx.return_stmt());
        else if(ctx.break_stmt() != null)
            result = rustTree.get(ctx.break_stmt());
        else if(ctx.loop_stmt() != null)
            result = rustTree.get(ctx.loop_stmt());
        else if(ctx.print_stmt() != null)
            result = rustTree.get(ctx.print_stmt());
        rustTree.put(ctx, result);
    }

    @Override public void exitExpr_stmt(tinyRustParser.Expr_stmtContext ctx) {
        rustTree.put(ctx, rustTree.get(ctx.expr()));
    }

    @Override public void exitExpr(tinyRustParser.ExprContext ctx) {
        rustTree.put(ctx, rustTree.get(ctx.relative_expr()));
    }

    @Override public void exitAdditive_expr(tinyRustParser.Additive_exprContext ctx) {
        String result = "";
        String op, left, right;
        if(ctx.additive_expr() != null) {
            left = rustTree.get(ctx.additive_expr());
            op = ctx.getChild(1).getText();
            if(op.equals("+"))
                op = "iadd\n";
            else if(op.equals("-"))
                op = "isub\n";
            right = rustTree.get(ctx.multiplicative_expr());
            result = left + right + op;
        } else
            result = rustTree.get(ctx.multiplicative_expr());
        rustTree.put(ctx, result);
    }

    @Override public void exitMultiplicative_expr(tinyRustParser.Multiplicative_exprContext ctx) {
        String result = "";
        String op, left, right;
        if(ctx.multiplicative_expr() != null) {
            left = rustTree.get(ctx.multiplicative_expr());
            op = ctx.getChild(1).getText();
            switch (op) {
                case "*" -> op = "imul\n";
                case "/" -> op = "idiv\n";
                case "%" -> op = "irem\n";
            }
            right = rustTree.get(ctx.unary_expr());
            result = left + right + op;
        } else
            result = rustTree.get(ctx.unary_expr());
        rustTree.put(ctx, result);
    }

    @Override public void exitUnary_expr(tinyRustParser.Unary_exprContext ctx) {
        String result = rustTree.get(ctx.factor());
        rustTree.put(ctx, result);
    }

    @Override public void exitFactor(tinyRustParser.FactorContext ctx) {//expr 막바지에 호출, literal, id 터미널 호출하거나 괄호 연산
        String result = "";
        if (ctx.args() != null) {
            String id = ctx.id().getText();
            result += rustTree.get(ctx.args());
            result += "invokestatic Test/" + globalFuncMap.get(id);
        } else if (ctx.id() != null) {
            result = "iload_" + getLocalVarTableIdx(rustTree.get(ctx.id()));
        } else if (ctx.literal() != null) {
            result = "bipush " + rustTree.get(ctx.literal());
        } else if (ctx.expr() != null) {
            result += rustTree.get(ctx.expr());
        }
        rustTree.put(ctx, result + "\n");
    }

    @Override public void exitComparative_expr(tinyRustParser.Comparative_exprContext ctx) {
        String result = "";
        String op, left, right;
        if(ctx.comparative_expr() != null) {
            left = rustTree.get(ctx.comparative_expr());
            op = ctx.getChild(1).getText();
            switch (op) {
                case "==" -> op = "if_icmpne" + " " + tempLabel_Else + "\n";  // 트릴경우 True 부분을 건너뛰게, Else 부분으로 점프
                case "!=" -> op = "if_icmpeq" + " " + tempLabel_Else + "\n";
                case "<=" -> op = "if_icmpgt" + " " + tempLabel_Else + "\n";
                case "<"  -> op = "if_icmpge" + " " + tempLabel_Else + "\n";
                case ">=" -> op = "if_icmplt" + " " + tempLabel_Else + "\n";
                case ">"  -> op = "if_icmple" + " " + tempLabel_Else + "\n";
            }
            right = rustTree.get(ctx.additive_expr());
            result = left + right + op;
        } else
            result = rustTree.get(ctx.additive_expr());
        rustTree.put(ctx, result);
    }

    @Override public void exitRelative_expr(tinyRustParser.Relative_exprContext ctx) {
        String result = "";
        String op, left, right;
        if(ctx.relative_expr() != null) {
            left = rustTree.get(ctx.relative_expr());
            right = rustTree.get(ctx.comparative_expr());
            op = ctx.getChild(1).getText();
            switch (op) {
                case "&&" -> {
                    //left += " " + tempLabel_Else + "\n";
                    //right += " " + tempLabel_Else + "\n";
                }
                case "||" -> {
                    int lastSpaceIndex = left.lastIndexOf(" "); // 앞에 점프를 Else에서 Temp로 변경
                    if (lastSpaceIndex != -1)
                        left = left.substring(0, lastSpaceIndex);
                    left += " " + tempLabel_Temp + "\n";        // left가 True면 바로 True 부분으로 점프,
                    left += "goto " + tempLabel_True + "\n";    // 아니면 Temp를 이용해 right로 진행
                    left += tempLabel_Temp + ":\n";
                    //right += " " + tempLabel_Else + "\n";
                }
            }
            result = left + right;
        } else
            result = rustTree.get(ctx.comparative_expr());
        rustTree.put(ctx, result);
    }

    @Override public void exitAssignment_stmt(tinyRustParser.Assignment_stmtContext ctx) {
        String result = "";
        if (ctx.id() != null) {
            String id = ctx.id().getText();
            result += rustTree.get(ctx.expr());
            result += "istore_" + getLocalVarTableIdx(id) + "\n";
        }
        rustTree.put(ctx, result);
    }

    @Override public void enterIf_stmt(tinyRustParser.If_stmtContext ctx) {
        tempLabel_True = "LABEL_True_" + labelNum++; // if true
        tempLabel_Else = "LABEL_Else_" + labelNum++; // else
        tempLabel_End  = "LABEL_End_" + labelNum++;  // end
        tempLabel_Temp = "LABEL_temp_" + labelNum++; // for OR operation
    }

    @Override public void exitIf_stmt(tinyRustParser.If_stmtContext ctx) {
        String result = "";
        result += rustTree.get(ctx.relative_expr());
        result += tempLabel_True + ":\n";
        result += rustTree.get(ctx.compound_stmt(0));
        result += "goto " + tempLabel_End + "\n";
        result += tempLabel_Else + ":\n";
        if (ctx.ELSE() != null) result += rustTree.get(ctx.compound_stmt(1));
        result += tempLabel_End + ":\n";

        rustTree.put(ctx, result);
    }

    @Override public void enterFor_stmt(tinyRustParser.For_stmtContext ctx) {
        tempI = ctx.id().getText();
        assignLocalVar(tempI);  // i 저장
        tempLabel_Loop = "LABEL_Loop_" + labelNum++;
        tempLabel_Break = "LABEL_Break_" + labelNum++;
    }

    @Override public void exitFor_stmt(tinyRustParser.For_stmtContext ctx) {
        String result = "";

        // id는 enter랑 range 에서

        // range
        result += rustTree.get(ctx.range());

        // loop stmt
        result += rustTree.get(ctx.compound_stmt());  // break는 stmt에서 처리

        // i++ 및 탈출 설정
        result += "iload_" + getLocalVarTableIdx(tempI) + "\n";
        result += "bipush 1\n";
        result += "iadd\n";
        result += "istore_" + getLocalVarTableIdx(tempI) + "\n";
        result += "goto " + tempLabel_Loop + "\n";
        result += tempLabel_Break + ":\n";

        rustTree.put(ctx, result);
    }

    @Override public void enterLoop_stmt(tinyRustParser.Loop_stmtContext ctx) {
        tempLabel_Loop = "LABEL_Loop_" + labelNum++;
        tempLabel_Break = "LABEL_Break_" + labelNum++;
    }

    @Override public void exitLoop_stmt(tinyRustParser.Loop_stmtContext ctx) {
        String result = "";

        result += tempLabel_Loop + ":\n";
        result += rustTree.get(ctx.compound_stmt());
        result += "goto " + tempLabel_Loop + "\n";
        result += tempLabel_Break + ":\n";

        rustTree.put(ctx, result);
    }

    @Override public void exitPrint_stmt(tinyRustParser.Print_stmtContext ctx) {
        String result = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        result += "iload_" + getLocalVarTableIdx(rustTree.get(ctx.id())) + "\n";
        result += "invokevirtual java/io/PrintStream.println(I)V\n";
        rustTree.put(ctx, result);
    }

    @Override public void exitRange(tinyRustParser.RangeContext ctx) {
        String result = "";

        String literal1 = rustTree.get(ctx.literal(0));
        result += "bipush " + literal1 + "\n";
        result += "istore_" + getLocalVarTableIdx(tempI) + "\n";
        result += tempLabel_Loop + ":\n";
        result += "iload_" + getLocalVarTableIdx(tempI) + "\n";

        String literal2 = rustTree.get(ctx.literal(1));
        result += "bipush " + literal2 + "\n";

        if (!ctx.getChild(2).getText().equals("=")) {
            result += "if_icmpge " + tempLabel_Break + "\n";  // ..
        } else {
            result += "if_icmpgt " + tempLabel_Break + "\n";  // ..=
        }

        rustTree.put(ctx, result);
    }

    @Override public void exitReturn_stmt(tinyRustParser.Return_stmtContext ctx) {
        if (ctx.expr() != null) {
            String result = "";
            result += rustTree.get(ctx.expr());
            result += "ireturn\n";
            rustTree.put(ctx, result);
        } else {
            rustTree.put(ctx, "return\n");
        }
    }

    @Override public void exitBreak_stmt(tinyRustParser.Break_stmtContext ctx) {
        String result = "";
        result += "goto " + tempLabel_Break + "\n";
        rustTree.put(ctx, result);
    }

    @Override public void exitArgs(tinyRustParser.ArgsContext ctx) {
        StringBuilder result = new StringBuilder();
        for (tinyRustParser.ExprContext expr : ctx.expr()) {
            result.append(rustTree.get(expr));
        }
        rustTree.put(ctx, result.toString());
    }

    @Override public void exitLiteral(tinyRustParser.LiteralContext ctx) {
        rustTree.put(ctx, ctx.LITERAL().getText());
    }

    @Override public void exitId(tinyRustParser.IdContext ctx) {
        rustTree.put(ctx, ctx.ID().getText());
    }

}
