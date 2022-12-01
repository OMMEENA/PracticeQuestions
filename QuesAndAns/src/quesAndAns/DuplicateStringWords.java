package quesAndAns;

public class DuplicateStringWords {
    //Write a Java Program to find the duplicate characters in a string.

    public static void main(String[] args) {
        String str = "hello worlde";
        dup(str);
        int count = 0;
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = '0';
                    System.out.print(ch[i]);
//                    break;
                }
            }
            if (count > 1 && ch[i] !='0')
                System.out.println(ch[i]);
        }
    }

    public static void dup(String str){
        char[] carry = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i +1; j < str.length(); j++) {

                if (carry[i] == carry[j]){
                    System.out.print(carry[j] + " ");
                    break;
                }
            }
        }
    }
}
