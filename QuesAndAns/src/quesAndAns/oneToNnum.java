package quesAndAns;

import java.util.Scanner;

public class oneToNnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 2;
        int x = 3;
        for (int i = 4; i <= 50; i++) {
            if (i % n == 0) {
                System.out.println(i + " is divide by 2");
            }
            if (i % x == 0) {
                System.out.println(i + " is divide by 3");
            }
        }
    }
}
