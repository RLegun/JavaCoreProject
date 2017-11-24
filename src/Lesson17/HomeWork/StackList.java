package Lesson17.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class StackList {
    private static Scanner scanner = new Scanner(System.in);
    private static int id;

    private static ArrayList<Stack> stackLists = new ArrayList<>();

    public static ArrayList<Stack> getStackLists() {
        return stackLists;
    }

    public static void setStackLists(Stack stackList) {
        stackLists.add(stackList);
    }

    public static int getId() {
        return id;
    }

    public static int newId() {
        if (stackLists.isEmpty()) {
            System.out.println("У вас не має жодного стеку!");
            System.exit(0);
        } else
            System.out.print("Введіть № стеку: --> ");
        id = scanner.nextInt();
        if (id > stackLists.size() || id == 0) {
            do {
                System.out.println("Такий № не існує!!!");
                System.out.print("Введіть вірний №: --> ");
                id = scanner.nextInt();
            } while (id > stackLists.size() || id == 0);
            return id -= 1;
        } else return id -= 1;
    }
}
