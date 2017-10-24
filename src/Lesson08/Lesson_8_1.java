package Lesson08;

import java.time.LocalDate;

public class Lesson_8_1 {
    public static void main(String[] args) {
        String name = "Nazar";
        Product pr1 = new Product();
        Product pr2 = new Product(2,"xxx",16,LocalDate.now());

        pr2.setPrice(17);
        /*pr1.name = "bear";
        pr1.price = 15;
        pr1.production = LocalDate.now();*/

        pr1.setId(5);
    }
}
