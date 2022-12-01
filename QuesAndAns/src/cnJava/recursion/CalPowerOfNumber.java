package cnJava.recursion;

public class CalPowerOfNumber {

   /* Print Numbers

    Given is the code to print numbers from 1 to n in increasing order recursively.
     But it contains few bugs that you need to rectify such that all the test cases pass.
    Input Format :
    Integer n
    Output Format :
    Numbers from 1 to n (separated by space)
    Constraints :
            1 <= n <= 10000
    Sample Input 1 :
            6
    Sample Output 1 :
            1 2 3 4 5 6
    Sample Input 2 :
            4
    Sample Output 2 :
            1 2 3 4
            */

    public static void main(String[] args) {
        int power = 5;
        int num = 5;
        System.out.println(power1(num, power));
    }

    public static int power1(int num, int power) {
        if (num == 0 && power == 0) {
            return 1;
        }
        if (num == 0) {
            return 0;

        }
        if (power == 0) {
            return 1;
        }
        int ans = power1(num, power / 2);

        if (power % 2 == 0) {
            return ans * ans;
        } else {
            return num * ans * ans;
        }
    }
}
