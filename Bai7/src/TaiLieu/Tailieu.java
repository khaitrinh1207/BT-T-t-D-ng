package TaiLieu;

import java.util.Scanner;

public class Tailieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;

    public Tailieu() {}

    public Tailieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhapTaiLieu(Scanner sc){
        System.out.println("Mã tài liệu :");
        sc.nextLine();
        this.maTaiLieu = sc.nextLine();
        System.out.println("Nhà xuất bản :");
        this.nhaXuatBan = sc.nextLine();
        System.out.println("Số bản phát hành :");
        this.soBanPhatHanh = sc.nextInt();
    }

    @Override
    public String toString() {
        return " mã tài liệu : "+maTaiLieu+
                ", nhà xuất bản : "+nhaXuatBan+
                ", số bản phát hành : "+soBanPhatHanh;
    }
}
