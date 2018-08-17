package CG_Conditional_Statements;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a,b,x;
        System.out.println("Chao mung ban den voi giai phuong trinh bac nhat ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri a:");
        a=sc.nextFloat();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri b:");
        b=sc.nextFloat();
        if ( a == 0){
            if (b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.println("Phuong trinh co nghiem la: x = " + -b/a );
        }
    }
}
