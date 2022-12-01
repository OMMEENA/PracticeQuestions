package quesAndAns;

public class PyramidPattern {
    public static void main(String[] args) {
        int row = 5;
        pyramid(5);
    }

    public static void pyramid(int row) {
        for (int i = 0; i < row; i++) {

            for (int j = row - i; j > 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0;  j<= i; j++)
            {
                System.out.print("* ");
            }
//            for (int j = row - 1; j > 1; j--)
//            {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }

}
