package Lesson20.Task_WorkWithHandlingExceptions;

import java.util.Scanner;

public class CreateCircle {
    private static Scanner scanner = new Scanner(System.in);

    public static void newCircle(){
        System.out.print ("Введіть назву круга: ");
        String name = scanner.next();
        System.out.print("Введіть радіус круга: ");
        String radius = scanner.next();
        System.out.println("---------------------");
        Circle circle = new Circle(name, radius);
        CircleList.setCircles(circle);
    }
}
