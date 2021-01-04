import java.util.Scanner;

public class Hocsinh {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public Hocsinh() {}

    public Hocsinh(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void nhapThongTin(Scanner sc){
        System.out.print("Họ tên :");
        sc.nextLine();
        this.hoTen = sc.nextLine();
        System.out.print("Ngày sinh(dd/mm/yyyy):");
        this.ngaySinh = sc.nextLine();
        System.out.print("Quê quán:");
        this.queQuan = sc.nextLine();
    }

    public String getQueQuan() {
        return queQuan;
    }

    public int yearBorn(){

        return Integer.parseInt(ngaySinh.substring(6,10));
    }

    @Override
    public String toString() {
        return " Họ tên :"+hoTen +
                ", ngày sinh : " + ngaySinh+
                ", quê quán : " + queQuan;
    }
}
