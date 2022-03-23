package Strings;

public class StringReverse2 {
    public static void main(String[] args) {

        String str1 = "ABCD";
        StringBuilder word = new StringBuilder(str1);

        //word.append(str1);

        System.out.println(word.reverse());

        System.out.println(reverse(str1));
    }

    public static String reverse(String str1) {
        return new StringBuffer(str1).reverse().toString();


    }
}
