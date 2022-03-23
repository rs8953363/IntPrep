package Lists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueChars {
        public static void main(String[] args) {
            //	3-Write a return method that can find the unique characters from the String
            //		     Ex: unique(“AAABBBCCCDEF”) ==> “DEF”;
            List<String> list = new ArrayList<>();

            list.add("A");
            list.add("A");
            list.add("A");
            list.add("B");
            list.add("B");
            list.add("B");
            list.add("C");
            list.add("C");
            list.add("C");
            list.add("D");
            list.add("E");
            list.add("F");
            Set<String> hList = new HashSet<>();

            for (String a: list) {
                hList.add(a);
            }
            System.out.println(hList);

            for (int i=0;i<hList.size();i++) {

                String element = list.get(i);
                list.remove(element);
                if (list.contains(element)) {
                    hList.remove(element);
                }
            }
            System.out.println(hList);
    }
}
