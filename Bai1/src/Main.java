import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // số khách trọ
        Hotel hotel;

        ArrayList<Hotel> arr = new ArrayList<>();

        System.out.println("Nhập số lượng khách trọ :");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            hotel = new Hotel();
            System.out.println("Thông tin khách trọ thứ " + (i + 1) + " :");
            hotel.enterData();
            arr.add(hotel);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("\n Thông tin khách hàng thứ " + (i + 1) + " :");
            arr.get(i).displayData();
        }

        System.out.println("\n Nhập ID để trả phòng :");
        sc.nextLine();
        String input = sc.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String customer = arr.get(i).getPerson().getId();
            if (customer.equalsIgnoreCase(input)) {
                System.out.println("Số tiền : " + arr.get(i).bill());
            } else
                System.out.println("Khách hàng không tồn tại !");
        }
    }
}
