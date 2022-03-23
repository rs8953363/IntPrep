package Loops;

public class ReverseInt2 {
    //Reverse an integer with using StringBuffer                                                                                                                          public static void main(String[] args) {
    public static void main(String[] args) {

        int example = 1298765;
        System.out.println(example);
        int reverse = reverseInt(example);
        System.out.println(reverse);
    }

    public static int reverseInt(int example) {
        String str= Integer.toString(example);
        StringBuffer strbf=new StringBuffer(str);
        strbf.reverse();
        int reverse=Integer.parseInt(strbf.toString());
        return reverse;
    }
}
