package quesAndAns;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNo();
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Number To: ");
//        int n = scan.nextInt();
//
//        int count = 0;
//        if (n <= 1) {
//            System.out.println("NOT PRIME");
//            return;
//        }
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        if (count > 1) {
//            System.out.println("The Number Is Not A PRIME");
//        } else System.out.println("The Number Is Prime Number");
    }

    public static void primeNo() {
        int temp = 0;
        for (int i = 2; i <= 100; i++) {
//            for (int j = 2; j <= i/2; j++) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print("("+i +")"); // prime number
            } else {
                temp = 0;
                System.out.print(" -"+i +"- "); // composite numbers
            }
        }
    }
}



