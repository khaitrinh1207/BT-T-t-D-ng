package CanBo;

import java.util.Scanner;

public class Phucvu extends Canbo{
    private String congViec;

    public Phucvu() {}

    public Phucvu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        this.congViec = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Phục vụ : {"+
                super.toString()+
                " ,công việc : "+congViec+
                '}';
    }
}
