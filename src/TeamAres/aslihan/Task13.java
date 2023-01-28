package TeamAres.aslihan;

public class Task13 {

        public static void main(String[] args) {
            String str = "Blue";
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            System.out.println(reverse);

        }
    }