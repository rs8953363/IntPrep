package Maps;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        String isim = "java is not easy";///
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] strary = isim.toCharArray();
        for (char c : strary) {

            if (charMap.containsKey(c)) {

                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }

        }
        System.out.println(charMap);

        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j])) {
                    System.out.println("Duplicate Element : " + my_array[i]);
                }
            }
        }
    }}