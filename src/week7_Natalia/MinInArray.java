package week7_Natalia;

public class MinInArray {
    public static void main(String[] args) {
        int[] array = {1,7,34,78,98,-2};
        System.out.println("minNumber(array) = " + minNumber(array));

    }
    public static int minNumber(int[] array){
        int min = array[0];
        for (int each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }
}
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
