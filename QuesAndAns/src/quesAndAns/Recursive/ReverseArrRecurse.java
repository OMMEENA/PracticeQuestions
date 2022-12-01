package quesAndAns.Recursive;

import java.util.Arrays;

public class ReverseArrRecurse {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6 ,5,6,8,9,0,6,3,2};
        int start = 0;
        int end = arr.length - 1;
        reverseArr(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void reverseArr(int[] arr, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr, start + 1, end - 1);
    }
}


