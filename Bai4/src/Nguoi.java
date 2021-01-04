import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String ngheNghiep;

    public Nguoi() {}

    public Nguoi(String hoTen, String ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    public void nhapThongTinNguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ Tên :");
        hoTen = sc.nextLine();
        System.out.println("Ngày Sinh (dd/mm/yyyy):");
        ngaySinh = sc.nextLine();
        System.out.println("Nghề nghiệp :");
        ngheNghiep = sc.nextLine();
    }

    public void hienThiNguoi(){
        System.out.println("Họ tên : "+hoTen);
        System.out.println("Ngày Sinh : "+ngaySinh);
        System.out.println("Nghề nghiệp : "+ngheNghiep);
    }

    public int yearBorn(){

        return Integer.parseInt(ngaySinh.substring(6,10));
    }
}
