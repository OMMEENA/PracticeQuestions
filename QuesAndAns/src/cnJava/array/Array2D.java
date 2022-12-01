package cnJava.array;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int[][] input = takeinput();

//        int[][] arr= {{1,2,3},{4,5,6}};
        print(input);
    }

    public static void print(int[][] input) {
        int rows = input.length;
        int col = input[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] takeinput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no of rows: ");
        int rows = scan.nextInt();
        System.out.println("enter no of cols: ");
        int col = scan.nextInt();
        int[][] input = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("input element for " + i + " rows " + j + " cols");
                input[i][j] = scan.nextInt();
            }
        }
        return input;
    }
}
