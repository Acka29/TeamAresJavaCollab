package TeamAres;

public class Task9 {
    public static void main(String[] args) {
        String word = "AAABJJJKK";
        String str = "";

        for (int i = 0; i < word.length(); i++) {

            int count=0;

            for (int j = 0; j < word.length() ; j++) {

                if(word.charAt(i)==word.charAt(j)){

                    count++;
                }
            }
            if(!str.contains(word.charAt(i)+"")){

                str+=""+word.charAt(i)+count;
            }
        }

    }


}
