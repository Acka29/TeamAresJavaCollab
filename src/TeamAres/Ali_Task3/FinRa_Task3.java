package TeamAres.Ali_Task3;


    public class FinRa_Task3 {
        public static void main(String[] args) {

            String result = "";
            for (int i = 1; i < 101; i++) {

                if (i % 3 == 0 && i%5==0) {
                    result += "FINRA ";
                } else if (i % 5 == 0) {
                    result += "RA ";
                }else if(i%3==0){
                    result += "FIN ";
                }else{
                    result += i +" ";
                }

            }

            System.out.println(result);


        }
    }
/*
2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print
 "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers
 which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
 */

