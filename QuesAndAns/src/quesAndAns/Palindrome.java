package quesAndAns;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s = "nayan";
        Palandrom(s);
        Scanner scan = new Scanner(System.in);
        String original = "nayan", reverse = "";
        for (int i = original.length() -1; i >= 0 ; i--) {
        reverse = reverse + original.charAt(i);
        }
        System.out.print(reverse);

        if (original.equals(reverse))
            System.out.print(" is palindrome");
        else
            System.out.print(" not palindrome");

    }
    public static void Palandrom(String s){
        String nstr = "";
        for (int i = s.length()- 1; i >= 0; i--) {
         nstr = nstr + s.charAt(i);
        }
        System.out.println(nstr);
        System.out.println(s);
        if(s.equals(nstr)){
            System.out.println("String is palandrome");
        }
        else {
            System.out.println("String is not a palandrome");
        }

    }
}
