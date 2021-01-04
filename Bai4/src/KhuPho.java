import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoDan hoDan;
        System.out.println("nhập số hộ dân trong khu phố :");
        int n = sc.nextInt(); // Số hộ đân
        ArrayList<HoDan> khupho = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hộ dân thứ "+(i+1)+" :");
                hoDan = new HoDan();
                hoDan.nhapThongTinHoDan();
                khupho.add(hoDan);
        }

        for (int i = 0; i <= khupho.size(); i++) {
            System.out.println("Hộ dân thứ "+(i+1)+" :");
                khupho.get(i).hienThiHoDan();
            System.out.println("Tuổi : "+khupho.get(i).getOld());
        }

//        for (int i = 0; i < khupho.size(); i++) {
//            System.out.println("Tuổi : "+khupho.get(i).getOld());
//        }

    }

}
