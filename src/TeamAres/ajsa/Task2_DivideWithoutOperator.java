package TeamAres.ajsa;

public class Task2_DivideWithoutOperator {
    public static void main(String[] args) {

        divide(10, 3);
        divide(20, 3);
    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }


}


