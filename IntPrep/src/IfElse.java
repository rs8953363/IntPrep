import java.util.Scanner;

public class IfElse {

        /*Write a method which can identifies given number is even or odd
         (Verilen sayının çift veya tek olduğunu tanımlayabilecek bir yöntem yazın)
         */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            long num = scan.nextLong();

            System.out.println("Number is " + num);

            if (num%2==0){
                System.out.println("Number is EVEN");
            }else {
                System.out.println("Number is ODD");
            }
        }
    }

