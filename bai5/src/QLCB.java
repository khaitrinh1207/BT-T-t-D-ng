import CanBo.Canbo;
import CanBo.Congnhan;
import CanBo.Kysu;
import CanBo.Phucvu;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<Canbo> canbos;

    public QLCB(){
        this.canbos = new ArrayList<>();
    }

    public void themCanBo(Canbo canbo){
        this.canbos.add(canbo);
    }

    public void nhapDanhSach(Scanner sc){
        Canbo canbo;
        System.out.println("Nhập số lượng cán bộ :");
        int n = sc.nextInt(); // số lượng cán bộ
        System.out.println("Nhập thông tin chi tiết :");
        canbo = new Canbo();
        for (int i = 0; i < n; i++) {
            System.out.println("Cán bộ "+(i+1)+" lựa chọn(1-Kỹ sử / 2-Công nhân / 3-Phục vụ)");
            int change = sc.nextInt();
            switch (change){
                case 1: canbo = new Kysu(); break;
                case 2: canbo = new Congnhan(); break;
                case 3: canbo = new Phucvu(); break;
            }
            canbo.nhapThongTin(sc);
            themCanBo(canbo);
        }
    }

    public void tiemKiemCanBo(String hoTen){
        for (Canbo cb: canbos) {
            if(hoTen.equals(cb.getHoTen()))
                System.out.println(cb.toString());
        }
    }
}
