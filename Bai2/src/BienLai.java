import java.util.Scanner;

public class BienLai {
    private KhachHang khachHang;
    private double chiSoCu;
    private double chiSoMoi;
    private double soTienPhaiTra;

    public BienLai() {}

    public BienLai(KhachHang khachHang, double chiSoCu, double chiSoMoi, double soTienPhaiTra) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public void nhapBienLai(){
        khachHang = new KhachHang();
        khachHang.NhapThongTinKhachHang();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập chỉ số cũ :");
            chiSoCu = sc.nextDouble();
            System.out.println("Nhập chỉ số mới :");
            chiSoMoi = sc.nextDouble();
        } while (chiSoCu > chiSoMoi);

        soTienPhaiTra = (chiSoMoi-chiSoCu)*750;
    }

    public void displayReceipt(){
        System.out.println("Chỉ số cũ : "+chiSoCu);
        System.out.println("chỉ số mới : "+chiSoMoi);
        System.out.println("Số tiền phải trả : "+soTienPhaiTra);
    }
}
