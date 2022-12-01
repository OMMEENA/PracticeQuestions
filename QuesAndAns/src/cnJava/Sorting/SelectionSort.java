package cnJava.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 567, 322, 6, 7, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] selection(int []arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
