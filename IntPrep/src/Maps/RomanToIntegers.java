package Maps;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {
    public static void main(String[] args) {
            String romanNumber = "VI";
            int result = romaToInteger(romanNumber);
            System.out.println("Roman number is :" + result);
            System.out.println("Roma num : " + romanNumber);
            System.out.println();

    }
    public static int romaToInteger (String roman) {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i); //--> Current roman Character
            if (i > 0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i - 1))) {
                result = result + numbersMap.get(ch) - 2 * numbersMap.get(roman.charAt(i - 1));
            } else
                result = result + numbersMap.get(ch);
        }
        return result;
    }

}
