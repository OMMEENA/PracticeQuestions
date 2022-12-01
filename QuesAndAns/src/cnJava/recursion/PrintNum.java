package cnJava.recursion;

public class PrintNum {
    public static void main(String[] args) {
        int n = 5;
num(n);
    }
    public static void num(int n){
        if (n == 0){
            return ;
        }
        num( n - 1);
        System.out.print(n);   }
}
