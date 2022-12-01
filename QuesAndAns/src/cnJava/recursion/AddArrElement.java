package cnJava.recursion;

public class AddArrElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(sum(arr, 0));
    }

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    public static int sum(int[] arr, int index) {
        if (arr.length == index) {
            return 0;
        }

        return arr[index] + sum(arr, index + 1);

    }
}
