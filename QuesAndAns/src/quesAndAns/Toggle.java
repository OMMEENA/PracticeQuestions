package quesAndAns;

import java.util.Scanner;

//Write a program in Java to Toggle the case of every character of a string.
// For instance, if the input string is “ApPLe”, the output should be “aPplE”.
public class Toggle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            }
        }
        String ans = sb.toString();
        System.out.println("The string after toggling becomes: " + ans);
    }
}
