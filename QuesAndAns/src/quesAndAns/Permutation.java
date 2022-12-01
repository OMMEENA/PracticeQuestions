//package quesAndAns;
//
//public class Permutation {
////    public static void main(String[] args) {
////        String str = "abc";
////        stringPermutation(str, "");
//
//
//        public static void main (String[] args) {
//
//            Scratchpad s = new Scratchpad();
//
//            ArrayList nums = s.makeList(500);
//
//            System.out.println(nums);
//            System.out.println(s.primesOnly(nums));
//
//        }
//    }
//
//    public static void stringPermutation(String str, String ans) {
//        if (str.length() == 0) {
//            System.out.println(ans + " ");
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            String ros = str.substring(0, i) + str.substring(i + 1);
//            stringPermutation(ros, ans + ch);
//        }
//    }
//}
