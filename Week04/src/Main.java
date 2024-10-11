import java.util.Scanner;
import java.util.StringTokenizer;

/*
    S -> aA | bB
    A -> aBb | bBb | cBb
    B -> d | e | f
 */

public class Main {
    static String nextSymbol;
    static StringTokenizer st;

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String added = String.join(",", input.split(""));   // 글자마다 ,를 넣은 후 토큰화
            st = new StringTokenizer(added, ",");

            // 첫번째 토큰 읽기 & 논 터미널 S로 처리 시작
            nextSymbol = st.nextToken();
            pS();

            // 중간에 throw 가 없었다면 성공
            System.out.println("OK");

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println("FAIL");
        }
    }


    // 논터미널 S 처리
    private static void pS() throws Exception{
        switch (nextSymbol) {
            case "a":
                pa();
                pA();
                break;
            case "b":
                pb();
                pB();
                break;
            default:
                throw new Exception("failed at pS, by ".concat(nextSymbol));
        }
    }

    // 논터미널 A 처리
    private static void pA() throws Exception {
        switch (nextSymbol) {
            case "a":
                pa();
                pB();
                pb();
                break;
            case "b":
                pb();
                pB();
                pb();
                break;
            case "c":
                pc();
                pB();
                pb();
                break;
            default:
                throw new Exception("failed at pA, by ".concat(nextSymbol));
        }
    }

    // 논터미널 B 처리
    private static void pB() throws Exception {
        switch (nextSymbol) {
            case "d":
                pd();
                break;
            case "e":
                pe();
                break;
            case "f":
                pf();
                break;
            default:
                throw new Exception("failed at pB, by ".concat(nextSymbol));
        }
    }

    // 터미널 a 처리, 다음 토큰이 있을때만 읽음
    private static void pa() throws Exception {
        if (nextSymbol.equals("a")) {
            if (st.hasMoreTokens())
                nextSymbol = st.nextToken();
        } else {
            throw new Exception("FAIL at pa, by ".concat(nextSymbol));
        }
    }

    // 터미널 b 처리
    private static void pb() throws Exception {
        if (nextSymbol.equals("b")) {
            if (st.hasMoreTokens())
                nextSymbol = st.nextToken();
        } else {
            throw new Exception("FAIL at pb, by ".concat(nextSymbol));
        }
    }

    // 터미널 c 처리
    private static void pc() throws Exception {
        if (nextSymbol.equals("c")) {
            if (st.hasMoreTokens())
                nextSymbol = st.nextToken();
        } else {
            throw new Exception("FAIL at pc, by ".concat(nextSymbol));
        }
    }

    // 터미널 d 처리
    private static void pd() throws Exception {
        if (nextSymbol.equals("d")) {
            if (st.hasMoreTokens())
                nextSymbol = st.nextToken();
        } else {
            throw new Exception("FAIL at pd, by ".concat(nextSymbol));
        }
    }

    // 터미널 e 처리
    private static void pe() throws Exception {
        if (nextSymbol.equals("e")) {
            if (st.hasMoreTokens())
                nextSymbol = st.nextToken();
        } else {
            throw new Exception("FAIL at pe, by ".concat(nextSymbol));
        }
    }

    // 터미널 f 처리
    private static void pf() throws Exception {
        if (nextSymbol.equals("f")) {
            if (st.hasMoreTokens())
                nextSymbol = st.nextToken();
        } else {
            throw new Exception("FAIL at pf, by ".concat(nextSymbol));
        }
    }
}