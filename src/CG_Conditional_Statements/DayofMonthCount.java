package CG_Conditional_Statements;

import java.util.Scanner;

public class DayofMonthCount {
    public static void main(String[] args) {
        System.out.println("Chao mung ban den voi chuong trinh tinh so ngay trong thang!");
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thang x:");
        x = sc.nextInt();
        switch (x) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("So ngay trong thang do la:" + 30);
                break;
            case 2:
                System.out.println("So ngay trong thang do la:" + "29 hoac 28");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("So ngay trong thang do la:" + 31);
                break;
            default:
                System.out.println("Ban da nhap sai thang!");
                }


        }
    }