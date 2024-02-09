package week2_mehtap;

public class SwapNumbers {
    public static void main(String[] args) {
        swap(4,5);
    }

    public static void swap(int a , int b){
        a = a+b;//9
        b = a-b;//9-5=4
        a = a-b;//9-4=5
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
    /*
   Swap two variable values without using a third variable
         */

