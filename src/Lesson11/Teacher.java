package Lesson11;

import java.time.LocalDate;
import java.util.Arrays;

public class Teacher extends Employee {
    private Subject[] subject;

    public Teacher() {
        subject = new Subject[2];
    }

    public Teacher(String name, String surname, LocalDate bornDate, int id, LocalDate hireDate, double salary) {
        super(name, surname, bornDate, id, hireDate, salary);
    }

    public Teacher(String name, String surname, LocalDate bornDate, int id, LocalDate hireDate, double salary,
                   Subject[] subject) {
        super(name, surname, bornDate, id, hireDate, salary);
        this.subject = subject;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public void setSubject(Subject subjectName) {
        for (int i = 0; i < subject.length; i++) {
            if (subject[i] == null) {
                subject[i] = subjectName;
                break;
            } else if (subject[subject.length - 1] != null) {
                int previousSize = subject.length;
                subject = ArrayResize.getResize(subject);
                subject[previousSize] = subjectName;
                break;
            }
        }
    }

    public void raiseSalary(int percent) {
        salary += (salary * percent / 100) + (salary * getExperience() / 100);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + Arrays.toString(subject) +
                ", id=" + id +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}
