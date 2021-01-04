import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private String birthday;
    private String id;

    public Person(){}

    public Person(String name, String birthday, String id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void enterTheGuestInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name :");
        name = sc.nextLine();
        System.out.println("Birthday :");
        birthday = sc.nextLine();
        System.out.println("ID :");
        id = sc.nextLine();
    }

    public void displayCustomerInformation(){
        System.out.println("Name : "+name);
        System.out.println("Birthday : "+birthday);
        System.out.println("ID : "+id);
    }
}
