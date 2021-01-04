import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTL qltl = new QLTL();
        qltl.nhapDanhSachTaiLieu(sc);
//        System.out.println("Nhập vào loại tài liệu cần tìm(Bao/Sach/Tapchi)");
//        String loaiTaiLieu = sc.nextLine();
//        qltl.loaiTaiLieu(loaiTaiLieu);
        System.out.println("Nhập vào mã tài liệu cần tìm :");
        String maTaiLieu = sc.nextLine();
        qltl.timTaiLieu(maTaiLieu);
        sc.close();
    }
}
