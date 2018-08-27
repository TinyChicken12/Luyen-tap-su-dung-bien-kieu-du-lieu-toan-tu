package CG_Loop;

import java.util.Scanner;

public class MenuByLoopStatement {
    public static void main(String[] args) {
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number;
        while (true) {
            number = sc.nextInt();
            switch (number) {
                case (1):
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
                case (2):
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case (3):
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    break;
                case(0):
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}