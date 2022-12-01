package cnJava.string;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        int n = name.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(name.charAt(k));
                    
                }
                System.out.println();
            }
        }

    }


//    public static void reverse(Scanner scn) {
//
//        String str = scn.nextLine();
//        char ch = 0;
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            nstr = ch + str;
//        }
//        System.out.println(nstr + " ");
//    }
}
