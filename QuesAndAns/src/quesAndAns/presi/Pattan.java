package quesAndAns.presi;

import java.util.Scanner;

public class Pattan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
//        System.out.print("Enter Symbol : ");
//        char num = sc.next().charAt(0);
//        int k = n * num - 1;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
                System.out.println(i);
                for (int k = 2 * (n - i); k >= 0; k--) {
                    System.out.print(" ");
                    System.out.println(i);
                }
                for (int l = 0; l < n; l++)
                    System.out.print(" ");
                System.out.println(n);

                for (int m = n - 1; m >= 1; m--) {
                    for (int o = 1; o < i; o++)
                        System.out.print(" ");
                    System.out.println(n);
                    for (int a = 2 * (n - i); a >= 0; a--)
                        System.out.print(" ");
                    System.out.println(n);
                }
            }
        }
    }
}

