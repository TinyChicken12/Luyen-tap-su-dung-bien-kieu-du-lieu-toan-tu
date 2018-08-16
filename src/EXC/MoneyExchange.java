package EXC;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        float usd,vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao gia tri usd:");
        usd=sc.nextFloat();
        vnd=usd*22000;
        System.out.println("Gia tri vnd tuong ung la:" + vnd);
    }
}
