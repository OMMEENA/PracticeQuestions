package quesAndAns;

public class PrimeNOBtwTwoNo {
    public static void main(String[] args) {
        int low = 200; int high = 500;
        while (low < high){
            boolean flag = false;
//            for (int i = 2; i <= low/2 ; i++) {
            for (int i = 2; i <= Math.sqrt(low) ; i++) {
                if (low % i == 0){

                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }
    }
}
