package quesAndAns.Recursive;

import java.util.Scanner;

public class Fibonaccci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
