package cnJava.Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 22,3,41,22,4,5,2};
        insertonsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertonsort(int... arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i -1;
            int temp = arr[i];
            while (j >= 0 && arr[j]> temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= temp;
        }
    }
}
