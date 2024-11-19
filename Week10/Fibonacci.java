public class Fibonacci {
    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int a = 0;
        int b = 1;
        int count = 2;
        
        while (count <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        
        return b;
    }
    
    public static void main(java.lang.String[] args) {
		int n = 10;
		System.out.println(fib(n));
	}
    
}