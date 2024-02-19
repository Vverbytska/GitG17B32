package week3_Natalia;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("isPrime(1) = " + isPrime(1));
        System.out.println("isPrime(2) = " + isPrime(2));
        System.out.println("isPrime(3) = " + isPrime(3));
        System.out.println("isPrime(4) = " + isPrime(4));
        System.out.println("isPrime(5) = " + isPrime(5));
        System.out.println("isPrime(6) = " + isPrime(6));
    }

    public static boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num%i == 0){
                count++;
            }
        }
        return count==2;
    }

}
//1. Numbers -- Prime Number
//Write a method that can check if a number is
//prime or not
