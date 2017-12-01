package Lesson20.Task_WorkWithHandlingExceptions;

public class Circle {
    private final double PI = 3.1415;
    private String name;
    private String area;

    public Circle(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateArea(){
        try {
            double areaResult = Double.parseDouble(area);
            areaResult = PI * Math.pow(areaResult,2);
            Menu.showMainMenu();
            System.out.println("Площа круга "+name+" дорівнює: "+areaResult);
        } catch (NumberFormatException e) {
            Menu.showMainMenu();
            System.out.println("не вірний формат числа радіуса!");
        }
    }
}
