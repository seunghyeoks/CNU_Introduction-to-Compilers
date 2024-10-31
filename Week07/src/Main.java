import generated.tinyR4Lexer;
import generated.tinyR4Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {
    public static void main(String[] args) throws Exception {
        CharStream code = CharStreams.fromFileName("./src/test.tr");
        tinyR4Lexer lexer = new tinyR4Lexer(code);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        try {
            tinyR4Parser parser = new tinyR4Parser(tokens);
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new tinyR4PrintListener(), tree);

            System.out.println(tinyR4PrintListener.getOutput());
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }
}