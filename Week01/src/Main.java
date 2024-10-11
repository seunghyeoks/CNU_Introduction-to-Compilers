import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.*;

public class Main {
    // 토큰별 경우의 수를 정규표현으로 정의
    static Pattern var = Pattern.compile("\\^{1,3}");
    static Pattern scanNum = Pattern.compile(":\\)");
    static Pattern scanStr = Pattern.compile(":\\):]");
    static Pattern printNum = Pattern.compile(":\\)\\)");
    static Pattern printStr = Pattern.compile(":\\)\\):]");
    static Pattern printBrk = Pattern.compile(":\\)\\):]]");
    static Pattern storeNum = Pattern.compile(":\\(\\)");
    static Pattern storeStr = Pattern.compile(":\\(\\):]");
    static Pattern calAdd = Pattern.compile(":}");
    static Pattern calMin = Pattern.compile(":}}");

    public static void main(String[] args) throws IOException {
        File imlg_file = new File("./src/test.imlg");
        File c_file = new File("./src/test.c");

        BufferedReader imlgReader = new BufferedReader(new FileReader(imlg_file));
        BufferedWriter cWriter = new BufferedWriter(new FileWriter(c_file));

        String singleLine;

        /* C언어 내용물 준비 */
        cWriter.write("#include <stdio.h>\n");
        cWriter.write("#include <stdlib.h>\n\n");
        cWriter.write("int main(){\n");
        cWriter.write("\tint a;\n");
        cWriter.write("\tint b;\n");
        cWriter.write("\tint c;\n");
        cWriter.write("\tchar* as = (char*)malloc(101 * sizeof(char));\n");
        cWriter.write("\tchar* bs = (char*)malloc(101 * sizeof(char));\n");
        cWriter.write("\tchar* cs = (char*)malloc(101 * sizeof(char));\n");
        cWriter.write("\t\n");

        // 한줄씩 별도 함수로 처리
        while ((singleLine = imlgReader.readLine()) != null)
            cWriter.write("\t" + regex_parsor(singleLine) + "\n");

        cWriter.write("\t\n");
        cWriter.write("\treturn 0;\n");
        cWriter.write("}");
        /* C언어 내용물 끝 */

        imlgReader.close();
        cWriter.close();
    }

    // 변수를 C에 맞게 변환
    private static String handle_var(String varToken, boolean isStr) {
        if (!isStr) {
            return switch (varToken) {
                case "^" -> "a";
                case "^^" -> "b";
                case "^^^" -> "c";
                default -> varToken;
            };
        } else {
            return switch (varToken) {
                case "^" -> "as";
                case "^^" -> "bs";
                case "^^^" -> "cs";
                default -> "\"" + varToken + "\"";
            };
        }
    }

    // 한 줄을 Tokenizer로 토큰화 한 뒤, 경우에 맞게 처리
    private static String regex_parsor(String singleline) {
        StringTokenizer st = new StringTokenizer(singleline);
        String retval = "";

        while (st.hasMoreTokens()) {
            String temp = st.nextToken();

            if (scanNum.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                if (var.matcher(temp2).matches())
                    retval += "scanf(\"%d\", &" + handle_var(temp2, false) + ");";

            } else if (scanStr.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                if (var.matcher(temp2).matches())
                    retval += "scanf(\"%s\", " + handle_var(temp2, true) + ");";

            } else if (printNum.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                retval += "printf(\"%d\", " + handle_var(temp2, false) + ");";

            } else if (printStr.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                retval += "printf(\"%s\", " + handle_var(temp2, true) + ");";

            } else if (printBrk.matcher(temp).matches()) {
                retval += "printf(\"\\n\");";

            } else if (storeNum.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                if (var.matcher(temp2).matches())
                    retval += handle_var(temp2, false) + " = ";

            } else if (storeStr.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                if (var.matcher(temp2).matches())
                    retval += handle_var(temp2, true) + " = ";

            } else if (calAdd.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                String temp3 = st.nextToken();
                retval += handle_var(temp2, false) + " + " + handle_var(temp3, false) + ";";

            } else if (calMin.matcher(temp).matches()) {
                String temp2 = st.nextToken();
                String temp3 = st.nextToken();
                retval += handle_var(temp2, false) + " - " + handle_var(temp3, false) + ";";

            } else {
                if (Pattern.matches("^-?[0-9]+$", temp))  // signed integer
                    retval += handle_var(temp, false) + ";";
                else
                    retval += handle_var(temp, true) + ";";
            }
        }

        System.out.printf("%-20s ===> %s", singleline, retval);  // 터미널 출력 (확인용)
        System.out.println();
        return retval;
    }
}