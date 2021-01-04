import java.util.Scanner;

public class Thisinh {
    private String hoTen;
    private String diaChi;
    private String sbd;
    private String dienUuTien;

    public Thisinh() {}

    public Thisinh(String hoTen, String diaChi, String sbd, String dienUuTien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sbd = sbd;
        this.dienUuTien = dienUuTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getDienUuTien() {
        return dienUuTien;
    }

    public void setDienUuTien(String dienUuTien) {
        this.dienUuTien = dienUuTien;
    }

    @Override
    public String toString() {
        return "Thí Sinh {" +
                " Tên : "+hoTen+
                ", địa chỉ : "+diaChi+
                ", SBD : "+sbd+
                ", diện ưu tiên : "+dienUuTien;
    }
}
