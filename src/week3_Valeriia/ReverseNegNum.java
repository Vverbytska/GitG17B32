package week3_Valeriia;

public class ReverseNegNum {
    public static void main(String[] args) {

        System.out.println(reverseNegNum(-1234567));
    }

    public static int reverseNegNum(int n){
        int numToReverse = n;
        if(n < 0){
            numToReverse *= -1;
        }
        //int numToReverse = Math.abs(n);

        int reversed = 0;
        int modified = numToReverse / 10;

        while (numToReverse != 0){
            int remainder = numToReverse % 10;
            reversed = reversed * 10 + remainder;
            numToReverse = numToReverse / 10;
        }

        return n < 0 ? reversed * -1 : reversed;

    }
}
/*
Write a return method that can reverse
negative number and return it as int
 */