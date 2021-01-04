package CanBo;

import java.util.Scanner;

public class Kysu extends Canbo {
    private String nganhDaoTao;

    public Kysu() {}

    public Kysu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Ngành đào tạo :");
        this.nganhDaoTao = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Kỹ Sư: {"+
                super.toString()+
                " ,ngành đào tạo :"+nganhDaoTao+
                '}';
    }
}
