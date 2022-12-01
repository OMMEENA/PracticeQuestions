package cnJava.recursion;

public class CheckArrSorted {
    public static void main(String[] args) {
int[]arr = {1,6,3,4};
        System.out.println(sort(arr));
    }

    public static boolean sort(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }

        int output[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            output[i - 1] = arr[i];
        }
        boolean ans = sort(output);

        if(!ans){
            return false;
        }
        if (arr[0] <= arr[1]){
            return true;
        }
        else {
            return false;
        }
    }
}
