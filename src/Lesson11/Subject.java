package Lesson11;

public class Subject {
    private int id;
    private String name;
    private SubjectType type;
    private int hours;

    public Subject(int id, String name, SubjectType type, int hours) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubjectType getType() {
        return type;
    }

    public void setType(SubjectType type) {
        this.type = type;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", hours=" + hours +
                '}';
    }
}
