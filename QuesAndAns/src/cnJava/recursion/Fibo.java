package cnJava.recursion;


public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        int ans = fibo(n - 1) + fibo(n - 2);
        return ans;
    }
}
