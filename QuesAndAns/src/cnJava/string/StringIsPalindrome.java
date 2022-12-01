package cnJava.string;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(palen(str));
    }

    public static boolean palen(String str) {
        if (str == null && str.length() == 0) return true;

        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}

//        String str = "Om MainA";
//        System.out.println(Arrays.toString(str.toCharArray()));
//        System.out.println(str.toLowerCase(Locale.ROOT));
//        System.out.println(str.strip());
//        System.out.println();
//        System.out.println(Arrays.toString(str.split(" ")));
//    }
//}
//    private static void bb(){
//        StringBuilder sb = new StringBuilder();
////        String str = "";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a' + i);
////            str = str + ch; // for reverse ch + str.
//            sb.append(ch);
//        }
//        System.out.println(sb.toString());
////        System.out.println(str);
//    }
//}
//
//    private static void mains() {
//        System.out.printf("my name is %s ,%n im %s lxc  ", "om ", " cool");
//        System.out.println();
//        System.out.println('a' + 'b');
//        System.out.println("a" + 3);
//        System.out.println('a' + 2);
//        System.out.println((char) ('a' + 2));
//        System.out.println("a" + 'b');
//        String ans = new Integer(56) + " " + new ArrayList<>();
//        System.out.println(ans);
//    }
//}
