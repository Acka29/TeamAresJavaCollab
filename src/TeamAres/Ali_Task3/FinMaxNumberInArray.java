package TeamAres.Ali_Task3;

public class FinMaxNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {10, 2, 3, 4, 5, 7, 8, -99, 4, 78};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];

            }
        }
        System.out.println("max number is : "+ max);

    }


}

