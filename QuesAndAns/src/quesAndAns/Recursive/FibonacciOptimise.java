package quesAndAns.Recursive;

public class FibonacciOptimise {
    private static long[] fiboCache;
    public static void main(String[] args) {
        int n = 20;
        fiboCache = new long[n + 1];
//        System.out.println(fibo(n));
        fibo(n);
    }
    private static long fibo(int n) {
        if (n <= 2) {
            return n;
        }
        if (fiboCache[n] != 0) {
            return fiboCache[n];
        }
        long Nthfibo = (fibo(n - 1) + fibo(n - 2));
        fiboCache[n] = Nthfibo;
        System.out.print(Nthfibo +" ");
        return Nthfibo;
    }
}
