package quesAndAns;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int []arr1= Arrays.copyOfRange(arr,3,5);
        System.out.println(Arrays.toString(arr1));

        String s = "om";
        boolean r ;
        r = s instanceof String;
        System.out.println(r);
    }
}
