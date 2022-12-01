package cnJava.Sorting;

public class MargeTwoArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 9, 10};
        int[] arr1 = {2, 5, 6, 8};
        print(marge(arr, arr1));
//        System.out.println(Arrays.toString(marge(arr, arr1)));
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] marge(int[] arr, int[] arr1) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr.length + arr1.length];
        while (i < arr.length && j < arr1.length) {

            if (arr[i] < arr1[j]) {
                ans[k] = arr[i];
                k++;
                i++;

            } else {
                ans[k] = arr1[j];
                j++;
                k++;
            }
        }
        while (i < arr.length) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < arr1.length) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        return ans;
    }
}