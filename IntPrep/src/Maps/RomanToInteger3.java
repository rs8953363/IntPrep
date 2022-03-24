package Maps;

import java.util.HashMap;

public class RomanToInteger3 {
        public static void main(String[] args) {
            romanToInt("MIXX");
        }
        public static int romanToInt (String s){
            if ( s == null || s.length() ==0)
                return -1;
            System.out.println("Roman Number : " + s);
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            int len = s.length();
            int result = map.get(s.charAt(len - 1));
            for (int i = len - 2; i >= 0; i--) {
                if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                    result += map.get(s.charAt(i));
                else
                    result -= map.get(s.charAt(i));
            }
            System.out.println("Integer : " + result);
            System.out.println("-----------------------------");
            return result;
        }
}

//    TreeMap<Integer, String> romanIdentifiers = new TreeMap<>();
//        romanIdentifiers.put(1000, "M");
//                romanIdentifiers.put(900, "CM");
//                romanIdentifiers.put(500, "D");
//                romanIdentifiers.put(400, "CD");
//                romanIdentifiers.put(100, "C");
//                romanIdentifiers.put(90, "XC");
//                romanIdentifiers.put(50, "L");
//                romanIdentifiers.put(40, "XL");
//                romanIdentifiers.put(10, "X");
//                romanIdentifiers.put(9, "IX");
//                romanIdentifiers.put(5, "V");
//                romanIdentifiers.put(4, "IV");
//                romanIdentifiers.put(1, "I");