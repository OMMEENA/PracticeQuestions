package quesAndAns;

import java.util.Scanner;

public class SqureRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double  sr = num/2;
        double temp ;
        do {
             temp = sr;
            sr = (temp + (num/ temp)) / 2;
        }while ((temp - sr )!= 0);
        System.out.println(sr);
    }
}
