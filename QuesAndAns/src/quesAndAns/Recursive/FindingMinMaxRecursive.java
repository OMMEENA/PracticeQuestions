package quesAndAns.Recursive;

public class FindingMinMaxRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 7, 8, 9, 99};
        int n = arr.length;
        System.out.println("Max Element is: "+findmax(arr,n));
        System.out.println("Min Element is: "+findmin(arr,n));
    }

    public static int findmax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n-1], findmax(arr, n-1));
    }
    public static int findmin(int []arr , int n){
        if (n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1] , findmin(arr, n-1));
    }
}
