package Lesson24_Generics;

import java.util.Scanner;

public class NewStack {
    private static Scanner scanner = new Scanner(System.in);
    private static GenericStack<String> stack;

    public static void newStack() {
        System.out.print("Введіть розмір стеку: ");
        stack = new GenericStack<>(scanner.nextInt());
        stack.showStack();
    }

    public static void pushElement(){
        System.out.println("Добавити елемент: ");
        stack.push(scanner.next());
        stack.showStack();
    }

    public static void popElement(){
        System.out.println("Витягти елемент: ");
        stack.pop();
        stack.showStack();
    }
}
