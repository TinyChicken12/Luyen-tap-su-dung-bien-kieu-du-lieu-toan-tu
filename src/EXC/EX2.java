package EXC;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Float doC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap do C:");
        doC = sc.nextFloat();
        Float doF = 9*doC/5 + 32;
        System.out.println("Gia tri do F tuong ung la:" + doF);
    }
}
