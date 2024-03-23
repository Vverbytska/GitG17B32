package week6_betul;

import java.util.Arrays;
import java.util.Collections;

public class findMaximum {

    public static void main(String[] args) {

        System.out.println(maxNum1(new Integer[]{2, 4, 7, 5, 9}));
        System.out.println(maxNum2(new int[]{2, 4, 7, 5, 9}));
    }


    public static int maxNum1(Integer[] num) {
        // using Collections.max() to
        return Collections.max(Arrays.asList(num));
    }

    public static int maxNum2(int[] num) {
        int max = num[0];
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}


/*
Array -- Find Maximum Write a method that can find the maximum number from an int Array
*/
