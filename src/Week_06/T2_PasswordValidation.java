package Week_06;

public class T2_PasswordValidation {

    public static void main(String[] args) {
        String password = "Pas%hj 4jk";
        System.out.println(isValidPassword(password));
    }

    public static boolean isValidPassword(String password) {
        if (password.length() >= 6 && !password.contains(" ")) {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
        }

        return false;
    }
}




//String -- Password Validation Task
    //    1. Write a return method that can verify if a password is valid or not. requirements:
     //   1. Password MUST be at least have 6 characters and should not contain space
//   2. PassWord should at least contain one upper case letter
     //   3. PassWord should at least contain one lowercase letter
      //  4. Password should at least contain one special characters
      //  5. Password should at least contain a digit
       // if all requirements above are met, the method returns true, otherwise returns false