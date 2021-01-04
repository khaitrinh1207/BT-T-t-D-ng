import java.util.Scanner;

public class Lop extends Hocsinh {
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public Lop() {}

    public Lop(String hoTen, String ngaySinh, String queQuan, String lop, String khoaHoc, String kyHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập lớp :");
        this.lop = sc.nextLine();
        System.out.print("Khóa học :");
        this.khoaHoc = sc.nextLine();
        System.out.print("Kỳ học:");
        this.kyHoc = sc.nextLine();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString()+
                " ,Lớp: " + lop+
                ", khóa học: " + khoaHoc+
                ", kỳ học: " + kyHoc;
    }
}
