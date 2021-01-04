package TaiLieu;

import java.util.Scanner;

public class Sach extends Tailieu {
    private String tacGia;
    private int soTrang;

    public Sach() {}

    public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void nhapTaiLieu(Scanner sc){
        super.nhapTaiLieu(sc);
        System.out.println("Tác giả :");
        this.tacGia = sc.nextLine();
        System.out.println("Số trang :");
        this.soTrang = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{ Sách : " +
                super.toString()+
                " ,tác giả : "+tacGia+
                " ,số trang : "+soTrang+
                " }";
    }
}
