package Lesson11.ParcelsSystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client sender = new Client("Roman","Legun", LocalDate.of(1999,11,5));
        Client receiver = new Client("Igor","Deniv",LocalDate.of(1995,10,5));
        Location currentLocation = new Location("Україна","Тернопільська обл.","м.Бучач");
        MailStatus status = new MailStatus("Відправлено","Не отримано");
        Parcel par = new Parcel(50,50,50,100,1000,
                1,sender,receiver,currentLocation,status);
        System.out.println(par);
    }
}
