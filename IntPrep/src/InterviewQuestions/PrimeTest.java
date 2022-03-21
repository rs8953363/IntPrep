package InterviewQuestions;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        //Prime Numbers : 2 3 5 7 11 13 17
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter  number: ");
        int num = scan.nextInt();
        System.out.println("Is " + num + " Prime? " + isPrime(num));
    }


        public static boolean isPrime (int num){
        if (num>1){
            for (int i = 2; i <num ; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
        }
    }

