package Lesson11;

import java.time.LocalDate;

public class StudentRunner {
    public static void main(String[] args) {
        Human hm = new Human();
        Human hm2 = new Human("Nazar", "Mykhailiv", LocalDate.of(1990,7,30));

        Student st  = new Student();
        Student st2 = new Student("Nazar", "Mykhailiv", LocalDate.of(1990,7,30),
                1546, "CI-13");


    }
}
