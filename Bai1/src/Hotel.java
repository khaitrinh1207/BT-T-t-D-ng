import java.util.Scanner;

public class Hotel {
    private int day;
    private String kindOfRoom;
    private double price;
    private Person person;

    public Hotel() {}

    public Hotel(int day, String kindOfRoom, double price, Person person) {
        this.day = day;
        this.kindOfRoom = kindOfRoom;
        this.price = price;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void enterData(){
        Scanner sc = new Scanner(System.in);
        person = new Person();
        person.enterTheGuestInformation();
        System.out.println("Enter the number of days :");
        day = sc.nextInt();
        System.out.println("Kind of Room (single, double, VIP):");
        sc.nextLine();
        kindOfRoom = sc.nextLine();
        System.out.println("Price :");
        price = sc.nextDouble();
    }

    public void displayData(){
        person.displayCustomerInformation();
        System.out.println("The number of days :"+day);
        System.out.println("Kind of Room : "+ kindOfRoom);
        System.out.println("Price : "+price);
    }

    public double bill(){
        return day*price;
    }
}
