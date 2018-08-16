package EXC;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius,area,chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri ban kinh hinh tron:");
        radius = sc.nextDouble();
        area=PI*radius*radius;
        chuVi=2*PI*radius;
        System.out.println("Dien tich hinh tron la:" + area);
        System.out.println("Chu vi hinh tron la:" + chuVi);
    }
}
