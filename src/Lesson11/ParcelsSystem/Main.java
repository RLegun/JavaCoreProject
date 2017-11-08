package Lesson11.ParcelsSystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client sender = new Client("Roman","Legun", LocalDate.of(1999,11,5),
                "Відправник");
        Client receiver = new Client("Igor","Deniv",LocalDate.of(1995,10,5),
                "Отримувач");
        Location currentLocation = new Location("Україна","Тернопільська обл.","м.Бучач");
        MailStatus status = new MailStatus("Відправлено","Не отримано");


        Parcel parcel = new Parcel();
        parcel.setClients(sender);
        parcel.setClients(receiver);

        parcel = new Parcel(50,50,50,10,1000,
                1,parcel.getClients(),currentLocation,status);

        System.out.println(parcel);

        System.out.println("--------------------------------------------------------------------");

        Box box = new Box(25,30,50);
        MailBox  mailBox = new MailBox(10,1000);
        Parcel parcel2 = new Parcel(parcel.getClients(),status);

        Box ourParcel;

        ourParcel = box;
        ourParcel.getInfo();

        ourParcel = mailBox;
        ourParcel.getInfo();

        ourParcel = parcel2;
        ourParcel.getInfo();
    }
}
