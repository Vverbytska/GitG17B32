package week6_Valeriia;

import java.util.InputMismatchException;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(passwordValidation("#s1g2klQ"));
    }

    public static boolean passwordValidation(String str) {

        boolean isValid = false;

            if (str.length() > 6 && !str.contains(" ")) {

                int upper = 0;
                int lower = 0;
                int special =0;
                int digit=0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 64 && str.charAt(i) <= 90) {
                        upper ++;
                    }else if (str.charAt(i) > 96 && str.charAt(i) <= 122) {
                        lower++;
                    }else if (str.charAt(i) > 48 && str.charAt(i) <= 57) {
                        digit++;
                    } else {
                        special++;
                    }
                }

                if(upper>0 && lower>0 && special>0 && digit>0) {
                    isValid = true;
                }
            }else {
                throw new InputMismatchException("Password must be more than 6 characters long and contain no spaces");
            }

        return isValid;
    }
}


/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

 */