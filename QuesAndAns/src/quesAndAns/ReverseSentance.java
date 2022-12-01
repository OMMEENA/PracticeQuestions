package quesAndAns;

public class ReverseSentance {
    public static void main(String[] args) {
        //  https://www.scaler.com/topics/reverse-a-sentence-in-java/
        // reverse sentence

        String str = "i.am.in.interview";
        String nstr = reverse(str);
        System.out.println(nstr);
    }

    private static String reverse(String str) {
        int x = str.indexOf(".");
        if (x == -1) {
            return str;
        }
        return reverse(str.substring(x + 1)) + "." + str.substring(0, x);

    }
}