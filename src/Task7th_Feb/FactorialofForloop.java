package Task7th_Feb;

import java.util.Scanner;

public class FactorialofForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        int result = 1;
        int oldnum = num;
        for (int i = 1; i <= oldnum; i++) {
            result = result * num;
            num++;
        }
        System.out.println("Factorial of number is:" + result);
    }
}




