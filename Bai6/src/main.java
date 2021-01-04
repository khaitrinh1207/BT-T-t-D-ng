import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanly quanly = new Quanly();
        quanly.nhapDanhSach(sc);
        quanly.hienThiDanhSach();
        System.out.println("Dánh sách cán bộ có lương từ 8 triệu");
        quanly.soSanh(8000000);

        sc.close();
    }
}
