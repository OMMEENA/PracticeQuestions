package quesAndAns;

import java.util.Arrays;

public class AddTwoArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {5,4,3,2,1};
//        System.out.println(Arrays.toString(arr) + "  " + Arrays.toString(arr1));
        System.out.println(Arrays.toString(array(arr, arr1)));
    }
    public static int[] array(int arr[], int arr1[]){
        int m = arr.length;
        int n = arr1.length;
        int z = m + n;
        int sum[] = new int[z];
        for (int i = 0; i < m; i++) {
            sum[i] = arr[i];
        }
        for (int j = 0; j < n; j++) {
            sum[j+m] = arr1[j];
        }
        return sum;
    }
}
