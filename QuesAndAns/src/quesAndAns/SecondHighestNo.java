package quesAndAns;

public class SecondHighestNo {
    //Write a Java Program to find the second-highest number in an array.
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 555, 66, 7, 88, 77};
        secondHighest(arr);
//        int lagest = 0;
//        int secondlargest = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int j = arr[i];
//            if (j > lagest) {
//                secondlargest = lagest;
//                lagest = j;
//            } else if (j > secondlargest) {
//                secondlargest = j;
//            }
//        }
//        System.out.println(secondlargest);
//        System.out.println(lagest);
    }
    public static void secondHighest(int []arr){
        int n = arr.length;
        int small = 0;
        int large = 0;
        for (int i = 0; i < n; i++) {
            int j = arr[i];
            if(j > large){
                small = large;
                large = j;
            } else if (j > small){
                small = j;
            }

        }
        System.out.println( "largest no :"+large);
        System.out.println("second : "+small);
            }
        }




