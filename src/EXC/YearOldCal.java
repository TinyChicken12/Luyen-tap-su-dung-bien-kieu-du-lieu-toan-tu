package EXC;

import java.util.Scanner;

public class YearOldCal {
    public static void main(String[] args) {
        int birthYear;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap nam sinh:");
        birthYear = sc.nextInt();
        age = 2018 - birthYear;
        System.out.println("Tuoi cua ban la:" +age);
    }
}
