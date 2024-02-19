package week2_Ali;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        if (number <2){
            System.out.println("Number should be greater than 2");
            System.exit(0);
        }

        int flag =10;

        for (int i = 2; i <number-1 ; i++) {
            if (number % i ==0){
                flag++;
            }

        }
        if (flag ==10){
            System.out.println("Prime number");
        }else {
            System.out.println("Not a prime number!");
        }

    }
}
