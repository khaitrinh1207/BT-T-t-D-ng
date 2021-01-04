import java.util.ArrayList;

public class Quanly {
    ArrayList<Thisinh> thisinhs;
    public Quanly(){
        thisinhs = new ArrayList<>();
    }

    public void  themThiSinh(Thisinh thisinh){
        thisinhs.add(thisinh);
    }

    public void hienThiThongTin(){
        thisinhs.forEach(thisinh -> System.out.println(thisinh.toString()));
    }

    public Thisinh timKiemThiSinh(String SBD){
        return thisinhs.stream().filter(thisinh -> thisinh.getSbd().equals(SBD)).findFirst().orElse(null);
    }
}
