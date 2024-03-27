package week7_Natalia;

import java.util.Arrays;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int[] array = {34, 78, 1, 7, 98, -2};
        System.out.println("sortAscending(array) = " + Arrays.toString(sortAscending(array)));
    }

    public static int[] sortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0+i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
        }
        return array;

    }
}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
