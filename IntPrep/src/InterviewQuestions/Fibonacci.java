package InterviewQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci numbers
        //0 1 1 2 3 5 8 13 21 34
        int num1, num2, num3;
        num1 = 0;
        num2 = 1;
        for (int i = 0; i < 10 ; i++) {
            System.out.print(num1 + " ");
            num3 = num1 +num2;
            num1 = num2;
            num2 = num3;

        }

    }
}
