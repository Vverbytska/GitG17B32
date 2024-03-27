package week7_Valeriia;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = new int[] {10,1, 20,7, 55, 8, 90};
        System.out.println(maxNum(arr));
        System.out.println(Arrays.toString(sortDesc(arr)));
        System.out.println(Arrays.toString(sortAsc(arr)));
    }

    public static int maxNum(int[] arr){

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


    public static int[] sortAsc(int [] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] sortDesc(int [] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */