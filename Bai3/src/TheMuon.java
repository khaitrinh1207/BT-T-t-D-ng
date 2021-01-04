import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon {
    private SinhVien sinhVien;
    private int soPhieu;
    private Date ngayMuon;
    private Date hanTra;
    private String idSach;

    public TheMuon() {}

    public TheMuon(SinhVien sinhVien, int soPhieu, Date ngayMuon, Date hanTra, String idSach) {
        this.sinhVien = sinhVien;
        this.soPhieu = soPhieu;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.idSach = idSach;
    }

    public void nhapThongTinTheMuon() throws ParseException {
        Scanner sc = new Scanner(System.in);
        sinhVien = new SinhVien();
        sinhVien.nhapThongTin();
        System.out.println("Số phiếu :");
        soPhieu = sc.nextInt();
        sc.nextLine();
        System.out.println("Ngày Mượn :");
        String nM = sc.nextLine();
        DateFormat dateFormat1 = new SimpleDateFormat("dd-mm-yy");
        ngayMuon = dateFormat1.parse(nM);
        System.out.println("Hạn trả :");
        String hT = sc.nextLine();
        DateFormat dateFormat2 = new SimpleDateFormat("dd-mm-yy");
        hanTra = dateFormat2.parse(hT);
        System.out.println("Số hiệu sách :");
        idSach = sc.nextLine();
    }

    public void displayCard(){
        sinhVien.displayStudent();
        System.out.println("Số phiếu : "+soPhieu);
        System.out.println("Ngày mượn : "+ngayMuon);
        System.out.println("Hạn trả : "+hanTra);
        System.out.println("Số hiệu sách : "+idSach);
    }

    public int getHanTra() {
        return hanTra.getDate();
    }
}
