package TaiLieu;

import java.util.Scanner;

public class Bao extends Tailieu{
    private String ngayPhatHanh;

    public Bao() {}

    public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void nhapTaiLieu(Scanner sc){
        super.nhapTaiLieu(sc);
        System.out.println("Ngày phát hành :");
        sc.nextLine();
        this.ngayPhatHanh = sc.nextLine();
    }

    @Override
    public String toString() {
        return "{ Báo : "+
                super.toString()+
                " ,ngày phát hành : "+ngayPhatHanh
                +" }";
    }
}
