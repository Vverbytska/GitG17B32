package week6_mehtap;

import java.util.Arrays;
import java.util.Collections;

public class FindMax {

    public static void main(String[] args) {
        System.out.println(findmax(new int[]{2, 3, 4, 8, 12, 90}));
        System.out.println(findMax2(new Integer[]{2, 3, 4, 8, 12, 90}));
    }
    public static int findmax(int[] nums){
        int max =nums[0];
        for(int each : nums){
            if(each>max){
                max=each;
            }
        }
        return max;
      
    }

    public static int findMax2(Integer[] nums){
        return Collections.max(Arrays.asList(nums));
    }
}
//write a method that accept int array and return max number from array