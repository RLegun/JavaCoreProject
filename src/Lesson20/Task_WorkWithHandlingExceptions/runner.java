package Lesson20.Task_WorkWithHandlingExceptions;

import java.util.InputMismatchException;

public class runner {
    public static void main(String[] args) {
        try {
            Menu.showMenu();
        } catch (InputMismatchException e) {
            System.err.println("Введено не вірний символ!!!");
        }
    }
}
