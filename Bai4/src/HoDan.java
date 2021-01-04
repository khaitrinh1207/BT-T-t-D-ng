import java.util.Scanner;

public class HoDan extends Nguoi{
    private int soNguoi;
    private String soNha;
    private Nguoi[] list;

    public HoDan() {
        list = new Nguoi[10];
    }

    public HoDan(String hoTen, String ngaySinh, String ngheNghiep, int soNguoi,String soNha){
        super(hoTen,ngaySinh,ngheNghiep);
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }

    public void nhapThongTinHoDan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số người :");
        soNguoi = sc.nextInt();
        System.out.println("Nhập số nhà :");
        sc.nextLine();
        soNha = sc.nextLine();
        System.out.println("Nhập thông tin thành viên rong gia đình :");
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("Người thứ "+(i+1)+" :");
            list[i] = new Nguoi();
            list[i].nhapThongTinNguoi();
        }
    }

    public void hienThiHoDan(){
        System.out.println("Số người : "+soNguoi);
        System.out.println("Số nhà : "+soNha);
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("Người thứ "+(i+1)+" :");
            list[i].hienThiNguoi();
        }
    }

    public Nguoi[] getList(){
        return list;
    }

    public int getOld(){
        int thisYear = 2021;
        int age = 0;
        for (int i = 0; i < soNguoi; i++) {
            age = thisYear - list[i].yearBorn();
        }
        return age;
    }
}
