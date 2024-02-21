package week3_Betul;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
    }


    public static boolean isPrime(int n){

        if (n<2){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n%i == 0){
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