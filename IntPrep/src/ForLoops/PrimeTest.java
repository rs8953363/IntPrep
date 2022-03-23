package ForLoops;
import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        //Write a method that can check if a number is prime or not
        //Prime Numbers : 2 3 5 7 11 13 17
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scan.nextInt();
        System.out.println("Is " +num + " prime? " +isPrime(num));
    }

    public static boolean isPrime (int num){
        if(num<=1){
            return  false;
        }else{
            for (int i = 2; i <num/2 ; i++) {
                if(num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

}