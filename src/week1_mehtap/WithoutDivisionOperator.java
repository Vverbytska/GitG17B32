package week1_mehtap;

public class WithoutDivisionOperator {
    public static void main(String[] args) {
        withoutDivisionOperator(12,5 );
    }

    //12-5-->7-5
    public static void withoutDivisionOperator(int a, int b ){
        int count =0;
        int remainder= a;
        if(b==0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        while(remainder>=b){
            remainder-=b;
            count++;
        }
        System.out.println(a + " : " + b + " = " + count + " with a remainder of " + remainder  );

    }

//I overloaded this method with double numbers just in case you want us to use both integer and decimal numbers for the division task.
    public static void withoutDivisionOperator(double a, double b ){
        int count =0;
        double remainder= a;
        if(b==0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        while(remainder>=b){
            remainder-=b;
            count++;
        }
        System.out.println(a + " : " + b + " = " + count + " with a remainder of " + remainder  );

    }


}


/*
write a method that can divide two numbers without using division operator.
 */

