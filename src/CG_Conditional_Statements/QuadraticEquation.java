package CG_Conditional_Statements;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Moi Ban den voi chuong trinh giai phuong trinh bac 2 dang: a*x*x+b*x+c=0");
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap vao a:");
        double a,b,c,delta;
        a=sc.nextDouble();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Moi ban nhap vao b:");
        b=sc1.nextDouble();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Moi ban nhap vao c: ");
        c=sc2.nextDouble();
        delta=b*b-4*a*c;
        if(a==0){
            System.out.println("Phuong trinh ban nhap la phuong trinh bac nhat! Moi ban nhap lai a!=0");
        }
        else if(delta<0){
            System.out.println("Phuong trinh vo nghiem!");
        }
        else if(delta>=0){
            System.out.println("Phuong trinh co 2 nghiem:");
            double x1,x2;
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("x1= "+x1);
            System.out.println("x2= "+x2);
        }
    }
}
