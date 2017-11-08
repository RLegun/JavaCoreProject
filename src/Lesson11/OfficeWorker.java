package Lesson11;

import java.time.LocalDate;

public class OfficeWorker extends Employee {

    private WorkerType type;

    public OfficeWorker() {
        super();
        this.type = type;
    }

    public OfficeWorker(String name, String surname, LocalDate bornDate, int id, LocalDate hireDate, int salary,
                        WorkerType type) {
        super(name, surname, bornDate, id, hireDate, salary);
        this.type = type;
    }

    public WorkerType getType() {
        return type;
    }

    public void setType(WorkerType type) {
        this.type = type;
    }

    public void raiseSalary(int percent) {
        if (type == WorkerType.DIRECTOR)
            salary += (salary * (percent + (percent * 50 / 100)) / 100) + (salary * getExperience() / 100);
        if (type == WorkerType.LAWYER)
            salary += (salary * (percent + (percent * 40 / 100)) / 100) + (salary * getExperience() / 100);
        if (type == WorkerType.ACCOUNTANT)
            salary += (salary * (percent + (percent * 30 / 100)) / 100) + (salary * getExperience() / 100);
        if (type == WorkerType.ECONOMIST)
            salary += (salary * (percent + (percent * 20 / 100)) / 100) + (salary * getExperience() / 100);
        if (type == WorkerType.SECRETARY)
            salary += (salary * (percent + (percent * 10 / 100)) / 100) + (salary * getExperience() / 100);
    }

    @Override
    public String toString() {
        return "OfficeWorker{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", bornDate=" + super.getBornDate() +
                ", type=" + type +
                ", id=" + id +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}

