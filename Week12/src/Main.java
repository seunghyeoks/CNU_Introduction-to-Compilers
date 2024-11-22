import generated.tinyR3Lexer;
import generated.tinyR3Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class Main {
    public static void main(String[] args) throws Exception {
        CharStream code = CharStreams.fromFileName("./src/Test.tr");
        tinyR3Lexer lexer = new tinyR3Lexer(code);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        try {
            tinyR3Parser parser = new tinyR3Parser(tokens);
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new tinyR3PrintListener(), tree);

            try (OutputStream output = new FileOutputStream("./src/Test.j")) {
                output.write(tinyR3PrintListener.getOutput().getBytes());
                System.out.println(tinyR3PrintListener.getOutput());
            }

        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }
}