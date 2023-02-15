package TeamAres.Ali_Task3;


import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int[] reverse = new int[arr.length];

        for(int i = arr.length-1, j = 0 ; i >= 0 ; i--){
            reverse[j++] = arr[i];

        }

        System.out.println(Arrays.toString(reverse));
    }

}
