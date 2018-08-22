package CG_Loop;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so tien can gui x:");
        double x;
        x= sc.nextDouble();
        Scanner sc1= new Scanner(System.in);
        System.out.println("Moi ban nhap so thang can gui month:");
        int month;
        month=sc1.nextInt();
        double tienLai;
        Scanner sc2= new Scanner(System.in);
        System.out.println("Moi ban nhap lai suat(theo nam):");
        double laiSuatNam;
        laiSuatNam=sc2.nextDouble();
        for(;month<=12;month++){
            tienLai=x*laiSuatNam/12*month;
            System.out.println("Tien lai ma ban nhan duoc sau " + month +" thang la :" + tienLai);
        }
    }
}
