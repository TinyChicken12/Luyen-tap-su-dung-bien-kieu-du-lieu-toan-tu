package EXC;
import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        float Phys,Chem,Bio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhâp điểm vật lý:");
        Phys = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm hóa học:");
        Chem = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm sinh học");
        Bio = sc.nextFloat();
        Float tongDiem = (Phys + Chem + Bio);
        System.out.println("Tổng điểm là:" + tongDiem);
        System.out.println("Trung bình điểm ba môn là:" + tongDiem/3);
    }
}