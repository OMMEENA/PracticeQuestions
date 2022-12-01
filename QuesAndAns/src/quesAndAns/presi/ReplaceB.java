package quesAndAns.presi;

public class ReplaceB {
    public static String replaceB(String str){
        if (str.length() == 0){
            return str;
        }
    String ans = "";

        if (str.charAt(0) == 'b'){
            ans = ans + str.charAt(0) + 'x';
        }
        String small= str.substring(1);
        return small+ans;
    }

    public static void main(String[] args) {
        String str ="abbacb";
        System.out.println(replaceB(str));
    }
}
