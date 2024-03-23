package week7_mehtap;

import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArrayAscending(9, 8, 7, 6, 3, 1, 0)));
    }
    public static int[] sortArrayAscending(int... arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                   int temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        return arr;

    }


}
