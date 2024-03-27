package week7_Natalia;

import java.util.Arrays;

public class DescendingOrderArray {
    public static void main(String[] args) {
        int[] array = {34, 78, 1, 7, 98, -2};
        System.out.println("sortDescending(array) = " + Arrays.toString(sortDescending(array)));
    }

    public static int[] sortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
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
