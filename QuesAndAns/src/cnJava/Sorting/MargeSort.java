package cnJava.Sorting;

public class MargeSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
//        marge(arr, start, end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int indx1 = start;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= end) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }

            while (indx1 <= mid) {
                merged[x++] = arr[indx1++];
            }
            while (indx2 <= end) {
                merged[x++] = arr[indx2++];
            }
            for (int i = 0, j = start; i < merged.length; i++, j++) {
                arr[j] = merged[i];
            }
        }

    }
}
