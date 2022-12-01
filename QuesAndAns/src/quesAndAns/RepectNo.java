package quesAndAns;

import java.util.Scanner;

public class RepectNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        repectNO();
//        reverseno();
    }

    //it just prints no of 5 repect in the integer
    public static void repectNO() {
        int n = 15595345;
        int temp = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) { // number of 5 in the interger
                temp++;
            }
            n = n / 10;
        }
        System.out.println(temp);
    }


    public static void reverseno() {
        int n = 12345;
        int temp = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            temp = temp * 10 + rem;
        }
        System.out.println(temp);

    }
}
