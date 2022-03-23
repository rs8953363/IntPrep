package Lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveGreaterThanHundred {
    //Given a list of Integers 1, 2, 3, 4, 5, 6,100,200,333....etc. remove all values greater than 100:
    public static void main(String[] args) {

        int array[] = {45,33,220,78,143};

        int than=200;

        List<Integer> list =new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < than) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
    }
}
