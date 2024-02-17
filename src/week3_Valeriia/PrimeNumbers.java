package week3_Valeriia;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(isPrimeNumber(11));
    }

    public static boolean isPrimeNumber(int n){
        if(n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
}
/*
Write a method that can check if a number is
prime or not
 */