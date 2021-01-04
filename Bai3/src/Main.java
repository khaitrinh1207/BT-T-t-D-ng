import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng thẻ mượn :");
        int n = sc.nextInt();
        ArrayList<TheMuon> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            TheMuon theMuon = new TheMuon();
            System.out.println("Nhập thông tin thẻ mượn :");
            theMuon.nhapThongTinTheMuon();
            arr.add(theMuon);
        }
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("thẻ mượn "+(i+1)+" :");
//            arr.get(i).displayCard();
//        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getHanTra() == 31 || arr.get(i).getHanTra() == 30)
                arr.get(i).displayCard();
        }

    }
}
