package cnJava.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,24,5,6,1,77 };
        sort(arr);
        System.out.println(Arrays.toString(arr));;
    }
    public static void sort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j+1] < arr[j] ){
                    int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
}
