package Task30th_Jan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Smallest_of_Two_numbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            num1 = sc.nextInt();
            System.out.println("Enter num2");
            num2 = sc.nextInt();
            if (num1 < num2) {
                System.out.println(num1 + " is smallest");
            } else if (num2 < num1) {
                System.out.println(num2 + " is smallest");

            } else if (num1 == num2) {
                System.out.println("num1 is equal to num2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid number");
        }
    }
}