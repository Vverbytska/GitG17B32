package week6_Natalia;

public class MaxInArray {
    public static void main(String[] args) {

        int[] arr = {345,754,45,67,35,667,32,-345,-24,-2345};
        System.out.println("maxNum(arr) = " + maxNum(arr));

    }

    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

}
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
