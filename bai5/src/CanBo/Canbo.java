package CanBo;

import java.util.Scanner;

public class Canbo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public Canbo() {
    }

    public Canbo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin(Scanner sc){
        System.out.println("Họ tên :");
        sc.nextLine();
        this.hoTen = sc.nextLine();
        System.out.println("Ngày sinh (dd/mm/yyyy) :");
        this.ngaySinh = sc.nextLine();
        System.out.println("Giới tính :");
        this.gioiTinh = sc.nextLine();
        System.out.println("Địa chỉ :");
        this.diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Họ tên : "+hoTen+
                ", ngày sinh : "+ngaySinh+
                ", giới tính : "+gioiTinh+
                ", địa chỉ : "+diaChi;
    }
}
