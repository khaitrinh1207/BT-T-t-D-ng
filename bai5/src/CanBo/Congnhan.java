package CanBo;

import java.util.Scanner;

public class Congnhan extends Canbo{
    private String bac;

    public Congnhan() {}

    public Congnhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhập bậc :");
        this.bac = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Công Nhân : {"+
                super.toString()+
                "bậc : "+bac+
                '}';
    }
}
