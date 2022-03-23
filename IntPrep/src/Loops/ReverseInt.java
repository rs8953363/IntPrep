package Loops;

public class ReverseInt {
    //Reverse an integer with loop
    public static void main(String[] args) {                                                                                                                   long example = 1298;

        System.out.println(example);
        long reverse = reverseLong(example);
        System.out.println(reverse);
    }

    public static long reverseLong(long example) {
        long reverse=0;
        while(example>0) {
            reverse = reverse*10+(example % 10);
            example=example/10;
        }
        return reverse;
    }
}
