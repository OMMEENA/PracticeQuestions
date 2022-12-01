package quesAndAns;

import java.util.ArrayList;
import java.util.Collections;

public class AddingArrToArrList {
    public static void main(String[] args) {
        int[] arr = {33, 4, 22, 5, 21, 1};
        fun(arr);

    }
    public static void fun(int[] arr){
        ArrayList<Integer> array_list =
                new ArrayList<Integer>();

        // Using add() method to add elements in array_list
        for (int i = 0; i < arr.length; i++)
            array_list.add(arr[i]);
        System.out.print(array_list);

        //using .sort to sort arraylist
        System.out.println(" After sortting ");
        Collections.sort(array_list);
        System.out.println(array_list);
    }
}
