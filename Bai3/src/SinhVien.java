import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String MSV;
    private String ngaySinh;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String MSV, String ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.MSV = MSV;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public void nhapThongTin() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên :");
        hoTen = sc.nextLine();
        System.out.println("Nhập mã sinh viên :");
        MSV = sc.nextLine();
        System.out.println("Nhập ngày sinh (dd--mm--yy):");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập lớp :");
        lop = sc.nextLine();
    }

    public void displayStudent() {
        System.out.println("Sinh viên : " + hoTen);
        System.out.println("Mã số : " + MSV);
        System.out.println("Ngày sinh : " + ngaySinh);
        System.out.println("Lớp : " + lop);
    }
}
