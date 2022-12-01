package quesAndAns.Recursive;

import java.util.Scanner;

public class PrimeNoRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scan.nextInt();

//for print prime number from 200 to 500
        //if n == 500
//        for (int i = n; i >= 200; i--) {
//            if (printprime(i, i - 1) == 1) {
//                System.out.println(i + " is a prime no");
//            } else {
//                System.out.println(i + " is not a prime no");
//            }
//        }

        // for checking no is prime number or not

        if (prime(n, 2)){
            System.out.println("Yes It's A Prime Number");
        }else {
            System.out.println("No It's Not A Prime Number");
        }
    }
    public static boolean prime(int n, int i) {

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return prime(n, i + 1);
    }
    public static int printprime(int n, int i) {
        if (i == 1) {
            return 1;
        }
        if (n % i == 0) {
            return 0;
        } else
            return printprime(n, i - 1);
    }
}
