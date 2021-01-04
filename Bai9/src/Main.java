import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanly quanly = new Quanly();
        quanly.nhapDanhSach(sc);
        while (true) {
            System.out.println();
            System.out.println("Lựa chọn:");
            System.out.println("Nhập 1: Hiển thị những học sinh sinh năm 1985 và quê ở Thái Nguyên");
            System.out.println("Nhập 2: Hiển thị những học sinh lớp 10A1");
            System.out.println("Nhập 3: Hiển thị toàn bộ danh sách");
            System.out.println("Nhập 4: Thoát");
            int change = sc.nextInt();
            switch (change) {
                case 1:
                    quanly.hienThiTheoYC();
                    break;
                case 2:
                    quanly.hienThiLop10A1();
                    break;
                case 3:
                    quanly.hienThiDanhSach();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Không hợp lệ !");
                    continue;
            }
        }

    }
}
