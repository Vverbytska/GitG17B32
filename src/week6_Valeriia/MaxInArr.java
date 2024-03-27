package week6_Valeriia;

import java.util.Arrays;

public class MaxInArr {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 10, -10};
        System.out.println(maxInArr(arr));

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.println(max);
    }

    public static int maxInArr(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }



}
//Write a method that can find the maximum number from an int Array