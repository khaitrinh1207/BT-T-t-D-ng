import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private String soNha;
    private String id; // mã số công tơ của hộ dân sử dụng

    public KhachHang() {}

    public KhachHang(String hoTen, String soNha, String id) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.id = id;
    }

    public void NhapThongTinKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên khách hàng :");
        hoTen = sc.nextLine();
        System.out.println("Số nhà :");
        soNha = sc.nextLine();
        System.out.println("Mã số công tơ :");
        id = sc.nextLine();
    }

    public void displayCustomer(){
        System.out.println("Khách hàng : "+hoTen);
        System.out.println("Số nhà : "+soNha);
        System.out.println("Mã số công tơ : "+id);
    }
}
