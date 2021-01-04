package TaiLieu;

import java.util.Scanner;

public class Tapchi extends Tailieu {
    private int soPhatHanh;
    private String thangPhatHanh;

    public Tapchi() {}

    public Tapchi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void nhapTaiLieu(Scanner sc){
        super.nhapTaiLieu(sc);
        System.out.println("Số phát hành :");
        this.soPhatHanh = sc.nextInt();
        System.out.println("Tháng phát hành (mm/yy) :");
        this.thangPhatHanh = sc.nextLine();
    }

    @Override
    public String toString() {
        return "{ tạp chí :" +
                " ,số phát hành : "+soPhatHanh+
                ", thàng phát hành : "+thangPhatHanh+
                " }";
    }
}
