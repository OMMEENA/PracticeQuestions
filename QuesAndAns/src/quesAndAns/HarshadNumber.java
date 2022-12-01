package quesAndAns;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no: ");
        int n = scan.nextInt();
        int rem = 0, sum = 0;
        int num = n;

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }


        if (num % sum == 0) {
            System.out.println(num + " is Harshad Number");
        } else {
            System.out.println(num + " is not a Hashad Number");
        }
    }
}
