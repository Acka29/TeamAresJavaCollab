package TeamAres.erum;

public class Task4_SwapNumber {
    public static void main(String[] args) {
        int a=-10;

        System.out.println(a);
        int b=20;
        a=a+b;//10+20=30
        b=a-b; //30-20=10
        a=a-b;//30-10=20
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}