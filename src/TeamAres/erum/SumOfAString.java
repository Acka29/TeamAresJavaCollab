package TeamAres.erum;

public class SumOfAString {
    public static int sumOfDigitsInAString(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if (Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str=("1,2,3,4");
        System.out.println(sumOfDigitsInAString(str));
    }
}
