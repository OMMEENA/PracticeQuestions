package cnJava.recursion;

public class CountDigit {
    public static void main(String[] args) {
int n = -5623;
        System.out.println(
                countno(n)
        );
    }
    public static int countno(int n){
        if (n == 0){
            return 0;
        }
        int small = countno(n /10);
        int ans = small + 1;
    return ans;
    }
}
