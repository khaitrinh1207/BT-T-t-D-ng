import java.util.ArrayList;
import java.util.Scanner;

public class Quanly {
    private ArrayList<Lop> dshs;

    public Quanly() {
        dshs = new ArrayList<>();
    }

    public void themHocSinh(Lop hocsinh) {
        dshs.add(hocsinh);
    }

    public void nhapDanhSach(Scanner sc) {
        Lop hocsinh;
        System.out.print("Nhập số lượng học sinh : ");
        int n = sc.nextInt();
        System.out.println("Nhập thông tin cho học sinh : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Học sinh thứ " + (i + 1) + " :");
            hocsinh = new Lop();
            hocsinh.nhapThongTin(sc);
            themHocSinh(hocsinh);
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < dshs.size(); i++) {
            System.out.println("Học sinh " + (i + 1) + " :");
            System.out.println(dshs.get(i).toString());
        }
    }

    public void hienThiTheoYC() {
        for (Lop i: dshs) {
            if ((i.yearBorn() == 1985) && (i.getQueQuan().equals("Thái Nguyên"))) {
                System.out.println("Học sinh sinh năm 1985 và quê Thái Nguyên:");
                System.out.println(i.toString());
            }else {
                System.out.println("Không có !!");
            }
        }
    }

    public void hienThiLop10A1() {
        for (int i = 0; i < dshs.size(); i++) {
            if (dshs.get(i).getLop().equals("10A1")) {
                System.out.println(dshs.get(i).toString());
            } else {
                System.out.println("Không có !");
            }
        }
    }
}
