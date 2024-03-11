package week6_mehtap;

import java.util.InputMismatchException;

public class IsValidPassword {
    public static void main(String[] args) {
        System.out.println(isValidPassword("Abc#28"));
    }

    public static boolean isValidPassword(String str){
        if(str.contains(" ") || str.length()<6 ){
            throw new InputMismatchException("enter at least 6 characters with no space");
        }
        int upperCaseCount=0, lowerCaseCount=0, digitCount=0, specialCharCount=0;
        char[] arr = str.toCharArray();
        for (char each : arr) {
           if(Character.isUpperCase(each)){
               upperCaseCount++;
           } else if( Character.isLowerCase(each)){
               lowerCaseCount++;
           }else if(Character.isDigit(each)){
               digitCount++;
           }else{
               specialCharCount++;}
        }
        if (upperCaseCount>=1 && lowerCaseCount>=1 && digitCount>=1 && specialCharCount>=1){
            return true;
        }
            return false;
    }

}
