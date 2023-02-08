package TeamAres.Dragana;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int integerArray[] = {44, 55, 96, 75, 45, 12, 44};
        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < integerArray.length; i++) {
            if (!arrayList.contains(integerArray[i])){
                arrayList.add(integerArray[i]);
            }
        }

        System.out.println(arrayList);

    }
}
