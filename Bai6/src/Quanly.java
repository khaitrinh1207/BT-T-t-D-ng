import java.util.ArrayList;
import java.util.Scanner;

public class Quanly {
    private ArrayList<Giaovien> giaoviens;

    public Quanly(){
        giaoviens = new ArrayList<>();
    }

    public void themGiaoVien(Giaovien giaovien){
        giaoviens.add(giaovien);
    }

    public void nhapDanhSach(Scanner sc){
        Giaovien giaovien;
        System.out.println("Nhập vào số lượng giáo viên :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Cán bộ "+(i+1)+" :");
            giaovien = new Giaovien();
            giaovien.nhapThongTin(sc);
            themGiaoVien(giaovien);
        }
    }

    public void hienThiDanhSach(){
        for (Giaovien i: giaoviens) {
            System.out.println(i.toString());
        }
    }

    public void soSanh(double luong){
        for (Giaovien i: giaoviens) {
            if(i.getLuongThucLinh() >= luong)
                System.out.println(i.toString());
        }
    }

}
