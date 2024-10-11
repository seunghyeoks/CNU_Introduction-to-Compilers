import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import generated.tinyR4Lexer;
import generated.tinyR4Parser;
public class TestMain {
    public static void main(String[] args) throws Exception {
        tinyR4Lexer lexer = new tinyR4Lexer(CharStreams.fromFileName("./src/202002473.tr"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tinyR4Parser parser = new tinyR4Parser(tokens);
        ParseTree tree = parser.program();
    }
}

/*
3-2     param 과 ,를 보아 여러개의 인자가 있을 경우 파싱되는 부분 같음
4       param 과 :를 보아, 입력받는 인자에서 : 을 통해 타입을 지정할때 사용됨
5       U32라고 되어있는걸 보아 가능한 타입 종류를 나타내는 터미널이라고 추측,
6-2     터미널 이름을 보아 리턴 타입을 지정할때 사용된다고 추측
10-2    다른 변수로 새 변수를 assign 할때 사용되는 듯
11-4    리턴문
13-3    = expr 결과값을 id에 넣을때 사용되는 듯
15-1    곱셈, 나눗셈, 나머지 연산 등에 사용되는 듯
16-1    덧셈과 뺄셈, not 여산에 사용되는 듯
17-2    괄호
21      리턴문, 11-4에서 불려짐
22-2    17-3에서 불림, 함수 사용때 쓰이는듯

 */