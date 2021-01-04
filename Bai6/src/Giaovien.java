import java.util.Scanner;

public class Giaovien {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;
    private double luongCung;
    private double thuong;
    private double phat;
    private double luongThucLinh;

    public Giaovien() {}

    public Giaovien(String hoTen, String ngaySinh, String queQuan, double luongCung, double thuong, double phat, double luongThucLinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.luongThucLinh = luongThucLinh;
    }

    public void nhapThongTin(Scanner sc){
        System.out.println("Tên :");
        sc.nextLine();
        this.hoTen = sc.nextLine();
        System.out.println("Ngày sinh :");
        this.ngaySinh = sc.nextLine();
        System.out.println("Quê quán :");
        this.queQuan = sc.nextLine();
        System.out.println("Lương cứng :");
        this.luongCung = sc.nextDouble();
        System.out.println("Lương thưởng :");
        this.thuong = sc.nextDouble();
        System.out.println("Phạt :");
        this.phat = sc.nextDouble();
        this.luongThucLinh = luongCung+thuong-phat;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    @Override
    public String toString() {
        return "Giáo viên : {" +
                "Tên :"+this.hoTen+
                ", ngày sinh : "+this.ngaySinh +
                ", quê quán : "+this.queQuan+
                ", lương cứng : "+this.luongCung+
                ", thưởng : "+this.thuong+
                ", phạt :" + this.phat+
                ", lương thực lĩnh : "+this.luongThucLinh;
    }
}
