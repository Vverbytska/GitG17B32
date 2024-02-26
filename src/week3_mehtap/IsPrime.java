package week3_mehtap;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

       return true;
    }


/*
write a method that can check  if the number is prime or not. A prime number is a whole number greater than 1 whose only factors are 1 and itself.
 */
}
