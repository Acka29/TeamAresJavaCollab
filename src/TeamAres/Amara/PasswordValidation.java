package TeamAres.Amara;

public class PasswordValidation {
    public static void main(String[] args) {
        String str = "Strong12!3";
        System.out.println(passwordValidation(str));

    }

    public static boolean passwordValidation(String str){
        int uCase = 0;
        int lcase = 0;
        int digit = 0;
        int symbol = 0;
        int a = 0;

            if (str.length() >= 6 && !str.contains(" ")) {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        uCase = 1;
                    }
                    if (Character.isLowerCase(ch)) {
                        lcase = 1;
                    }
                    if (!Character.isLetterOrDigit(ch)) {
                        digit = 1;
                    }
                    if (Character.isDigit(ch)) {
                        symbol = 1;
                    }
                }

            }else {
                System.out.println(false);
            }

            a = uCase + lcase + digit + symbol;

        if(a==4){
            return true;
        }else{
            return false;
        }

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