import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanly qlts = new Quanly();
        while (true){
            System.out.println("Ứng dụng quản lý:");
            System.out.println("Enter 1: Thêm thí sinh");
            System.out.println("Enter 2: Hiển thị thông tin thí sinh");
            System.out.println("Enter 3: Tìm kiếm thí sinh bằng SBD");
            System.out.println("Enter 4: Thoát");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: Thêm thí sinh Khối A");
                    System.out.println("Enter b: Thêm thí sinh Khối B");
                    System.out.println("Enter c: Thêm thí sinh Khối C");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            qlts.themThiSinh(nhapThongTin(sc,"a"));
                            break;

                        }
                        case "b": {
                            qlts.themThiSinh(nhapThongTin(sc,"b"));
                            break;
                        }
                        case "c": {
                            qlts.themThiSinh(nhapThongTin(sc,"c"));
                            break;
                        }
                        default:
                            System.out.println("Sai cú pháp");
                            break;
                    }
                    break;
                }
                case "2": {
                    qlts.hienThiThongTin();
                    break;
                }
                case "3": {
                    System.out.print("Nhập SBD: ");
                    String SBD = sc.nextLine();
                    Thisinh thisinh = qlts.timKiemThiSinh(SBD);
                    if (thisinh == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(thisinh.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Không hợp lệ");
                    continue;
            }

        }
    }

    public static Thisinh nhapThongTin(Scanner sc, String cate) {
        System.out.print("Nhập SBD: ");
        String sbd = sc.nextLine();
        System.out.print("Nhập tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập diện ưu tiên: ");
        String dienUuTien = sc.nextLine();
        sc.nextLine();
        if (cate.equals("a")) {
            return new KhoiA(hoTen,diaChi,sbd,dienUuTien);
        } else if (cate.equals("b")) {
            return new KhoiB(hoTen,diaChi,sbd,dienUuTien);
        } else {
            return new KhoiC(hoTen,diaChi,sbd,dienUuTien);

        }
    }
}
