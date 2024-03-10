package week6_Natalia;

public class PasswordValidationTask {
    public static void main(String[] args) {
        String str = "1Ba23!";
        System.out.println("passwordValidation(str) = " + passwordValidation(str));

    }

    public static boolean passwordValidation(String str) {
        boolean lengthAndSpase = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialCharacter = false;
        boolean digit = false;
//Password MUST be at least have 6 characters and should not contain space
        if (str.length() >= 6 && !str.contains(" ")) {
            lengthAndSpase = true;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    upperCase = true;
                }else if (Character.isLowerCase(str.charAt(i))) {
                    lowerCase = true;
                }else if (!Character.isLetterOrDigit(str.charAt(i))) {
                    specialCharacter = true;
                }else if (Character.isDigit(str.charAt(i))) {
                    digit = true;
                }
            }
        }
        return lengthAndSpase && upperCase && lowerCase && specialCharacter && digit;
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
