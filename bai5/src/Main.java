import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        qlcb.nhapDanhSach(sc);
        System.out.println("Nhập vào họ tên cần tìm kiếm :");
        String name = sc.nextLine();
        qlcb.tiemKiemCanBo(name);
        sc.close();
    }
}
