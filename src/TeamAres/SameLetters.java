package TeamAres;

import java.util.Arrays;

public class SameLetters { //

    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    //OPTION 1
    public static boolean sameLetters(String a, String b){

        //checking the length
        if(a.length() != b.length()){
            return false;
        }
        //transform to arrays
        char string1ToArray[] = a.toCharArray();
        char string2ToArray[] = b.toCharArray();

        //sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        //checking the letters
        for (int i = 0; i < a.length(); i++) {
            if(string1ToArray[i] != string2ToArray[i]){
                return false;
            }
        }
        return true;
    }

    //OPTION 2
    public static void Anagram(String a, String b){

        //transform to arrays
        char string1ToArray[] = a.toCharArray();
        char string2ToArray[] = b.toCharArray();

        //sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        //checking if they are equal
        Boolean result = Arrays.equals(string1ToArray, string2ToArray);

        if(result == true){
            System.out.println("Strings are Anagram");
        } else{
            System.out.println("Strings are not Anagram");
        }

    }

    public static void AnagramWithSpaces(String a, String b){

        //replace blank space and putting in lower case
        a = a.replace(" ", "").toLowerCase();
        b = b.replace(" ", "").toLowerCase();

        //transform to arrays
        char string1ToArray[] = a.toCharArray();
        char string2ToArray[] = b.toCharArray();

        //sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        //checking if they are equal
        Boolean result = Arrays.equals(string1ToArray, string2ToArray);

        if(result == true){
            System.out.println("Strings are Anagram");
        } else{
            System.out.println("Strings are not Anagram");
        }

    }

    public static void main(String[] args) {
        String a = "He is silent";
        String b = "Is he Listen";
       AnagramWithSpaces(a, b);
    }

}
