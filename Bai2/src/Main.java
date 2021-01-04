import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n; // số hộ gia đình
        Scanner sc = new Scanner(System.in);
        BienLai bienLai;
        ArrayList<BienLai> arr = new ArrayList<>();
        System.out.println("Nhập số hộ gia đình :");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            bienLai = new BienLai();
            System.out.println("Nhập thông tin biên lai hộ gia đình thứ "+(i+1)+" :");
            bienLai.nhapBienLai();
            arr.add(bienLai);
        }

        System.out.println("Thông tin biên lai :");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("thông tin biên lai "+(i+1)+" :");
            arr.get(i).displayReceipt();
        }

    }
}
