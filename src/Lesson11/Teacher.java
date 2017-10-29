package Lesson11;

import java.time.LocalDate;

public class Teacher extends Human{
    private String subjectOfTeaching;
    private int workExperience;
    private int salary;

    public Teacher() {
        super();
        this.subjectOfTeaching = "economy";
        this.workExperience = 5;
        this.salary = 5000;
    }

    public Teacher(String name, String surname, LocalDate bornDate,
                   String subjectOfTeaching, int workExperience, int salary) {
        super(name, surname, bornDate);
        this.subjectOfTeaching = subjectOfTeaching;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public String getSubjectOfTeaching() {
        return subjectOfTeaching;
    }

    public void setSubjectOfTeaching(String subjectOfTeaching) {
        this.subjectOfTeaching = subjectOfTeaching;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjectOfTeaching='" + subjectOfTeaching + '\'' +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                '}';
    }
}
