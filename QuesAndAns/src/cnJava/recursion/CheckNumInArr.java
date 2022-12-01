package cnJava.recursion;

public class CheckNumInArr {
    public static void main(String[] args) {
        int []arr = {1,2, 3,4,5};
        int index = arr[0];
        int target = 4;
        System.out.println(check(arr,index,target));
    }

    public static boolean check(int []arr, int index, int target){
        if (index == arr.length)
            return false;
        if (arr.length ==0){
            return true;
        }
        return check(arr,index+1,target);
    }
    public static boolean check(int []arr, int target ){
        return check(arr,0,target);
    }
}
