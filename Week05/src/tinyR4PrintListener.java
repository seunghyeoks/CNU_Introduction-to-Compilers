import generated.tinyR4BaseListener;
import generated.tinyR4Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class tinyR4PrintListner extends tinyR4BaseListener implements ParseTreeListener {
    private static String output;
    ParseTreeProperty<String> r4tree = new ParseTreeProperty<>();

    public static String getOutput() {
        return output;
    }

    @Override public void exitProgram(tinyR4Parser.DeclContext ctx) {
        String program;
        for (int i = 0; i < ctx.decl().size(); i++)
            program += r4tree.get(ctx.decl());
        output = program;
    }
}
