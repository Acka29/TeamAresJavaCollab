package teamAres.ajsa;

public class Task14_PasswordValidation {

    /*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
    public static void main(String[] args) {

        System.out.println(validPassword("djhdifidfjdj"));

    }
    public static boolean validPassword(String password){
        boolean hasUppercase = false,
                hasLowercase = false,
                hasDigit = false,
                hasSpecialChar = false,
                isValidPassword = false;
        if (password.length() <= 6 || password.contains(" ")){
            return false;
        }
        char [] chars = password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                hasUppercase = true;
            }else if(Character.isLowerCase(each)){
                hasLowercase = true;
            }else if(Character.isDigit(each)){
                hasDigit = true;
            }else{ //special char
                hasSpecialChar = true;
            }

            if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar){
                isValidPassword = true;
            }
        }
        return isValidPassword;
    }
}

