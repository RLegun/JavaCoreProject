package Lesson11;

import Lesson11.ParcelsSystem.Box;

import java.time.LocalDate;

public class StudentRunner {
    public static void main(String[] args) {
        Employee em1;
        Human hm = new Human();
        Human hm2 = new Human("Nazar", "Mykhailiv", LocalDate.of(1990,7,30));

        Student st  = new Student();
        Student st2 = new Student("Nazar", "Mykhailiv", LocalDate.of(1990,7,30),
                1546, "CI-13");

        Subject philosophy = new Subject(1,"Філософія",SubjectType.LAB,25);
        Subject history = new Subject(2,"Історія",SubjectType.PRACTICE,30);
        Subject biology = new Subject(3,"Біологія",SubjectType.LAB,10);

        Teacher teacher1 = new Teacher("Roman","Legun",LocalDate.of(1990,5,14),
                2,LocalDate.of(2000,12,25),7000.0);


        OfficeWorker officeWorker = new OfficeWorker("Roman", "Legun", LocalDate.of(1990,7,30),
                1,LocalDate.of(2010,5,25),5000,WorkerType.DIRECTOR);
        //System.out.println(officeWorker);



        System.out.println(teacher1.toString());

        em1 = teacher1;
        em1.raiseSalary(20);

        //teacher1.raiseSalary(20);
        System.out.println(teacher1.toString());


        System.out.println(officeWorker);
        officeWorker.raiseSalary(10);
        System.out.println(officeWorker);
        //-------------------------------------------------------------------
        Teacher teacher = new Teacher();

        teacher.setSubject(philosophy);
        teacher.setSubject(history);
        teacher.setSubject(biology);

        teacher = new Teacher("Roman", "Legun", LocalDate.of(1990,7,30),
                2, LocalDate.of(2010,5,4),5000, teacher.getSubject());

        System.out.println(teacher);
    }
}
