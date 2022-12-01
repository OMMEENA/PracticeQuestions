package quesAndAns;

import java.util.Scanner;
//Java Code to Count Vowels and Consonants in a String

public class NumOfVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = scan.nextLine();

        int vowels = 0;
        int Consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Vowel(ch) == true) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z' && Vowel(ch) == false)
                Consonants++;
        }
        System.out.println("vowel is: " + vowels);
        System.out.println("Consonants are: " + Consonants);
    }
    public static boolean Vowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
