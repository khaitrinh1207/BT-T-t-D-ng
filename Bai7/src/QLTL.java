import TaiLieu.Bao;
import TaiLieu.Sach;
import TaiLieu.Tailieu;
import TaiLieu.Tapchi;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTL {
    private ArrayList<Tailieu> tailieus;

    public QLTL() {
        tailieus = new ArrayList<>();
    }

    public void themTaiLieu(Tailieu tailieu) {
        tailieus.add(tailieu);
    }

    public void nhapDanhSachTaiLieu(Scanner sc) {
        Tailieu tailieu;
        System.out.println("Nhập số lượng tài liệu :");
        int n = sc.nextInt();
        System.out.println("Nhập thông tin chi tiết :");
        for (int i = 0; i < n; i++) {
            System.out.println("Tài liệu " + (i + 1) + " :");
            System.out.println("chọn loại (1.Báo/2.Sách/3.Tạp chí)");
            int change = sc.nextInt();
            tailieu = new Tailieu();
            switch (change) {
                case 1:
                    tailieu = new Bao();
                    break;
                case 2:
                    tailieu = new Sach();
                    break;
                case 3:
                    tailieu = new Tapchi();
                    break;
            }
            tailieu.nhapTaiLieu(sc);
            themTaiLieu(tailieu);
        }
    }

    public void timTaiLieu(String maTaiLieu) {
        for (Tailieu i : tailieus) {
            if (maTaiLieu.equals(i.getMaTaiLieu()))
                System.out.println(i.toString());
        }
    }

    public void loaiTaiLieu(String loaiTaiLieu) {
        for (Tailieu i : tailieus) {
            if (loaiTaiLieu.equals("Sach") && (i instanceof Sach)) {
                System.out.println(i.toString());
            } else if (loaiTaiLieu.equals("Bao") && (i instanceof Bao)) {
                System.out.println(i.toString());
            } else if (loaiTaiLieu.equals("Tapchi") && (i instanceof Tapchi)) {
                System.out.println(i.toString());
            }
        }
    }
}
