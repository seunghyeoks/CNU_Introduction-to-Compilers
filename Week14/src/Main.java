import generated.tinyRustLexer;
import generated.tinyRustParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream code = CharStreams.fromFileName("./src/Test.tr");
        tinyRustLexer lexer = new tinyRustLexer(code);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        try {
            tinyRustParser parser = new tinyRustParser(tokens);
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new tinyRustListener(), tree);

        } catch (RuntimeException e) {
            System.out.println("ERROR :" + e.getMessage());
        }
    }
}
