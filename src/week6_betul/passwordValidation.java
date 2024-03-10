package week6_betul;

public class passwordValidation {
    public static void main(String[] args) {
        System.out.println(isValid("Izmir35!"));
    }

    //Password mustT be at least have 6 characters and should not contain space
    public static boolean isValid(String password) {
        if (password.contains(" ") || password.length() < 6) {
            return false;
        }

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper = true;

            } else if (Character.isLowerCase(ch)) {
                lower = true;


            } else if (Character.isDigit(ch)) {
                digit = true;
            } else {
                special = true;
            }

        }


        return upper && lower && special && digit;
    }
}
/*
String -- Password Validation Task

1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
