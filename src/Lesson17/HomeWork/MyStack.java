package Lesson17.HomeWork;

import java.util.Scanner;

public class MyStack implements Stack {
    private int id = StackList.getStackLists().size() + 1;
    private Scanner scanner = new Scanner(System.in);
    private int[] stackArray;
    private int maxSize;
    private int top = -1;
    private int previousTop;
    private int popElement;
    private int pushElement;
    private int stackOverflow;

    public int getId() {
        return id;
    }

    public void createNewStack() {
        System.out.print("Введіть розмір стеку --> ");
        maxSize = scanner.nextInt();
        stackArray = new int[maxSize];
        Menu.showStackMenu();
        System.out.println("new stack №" + getId() + " was created...");
    }

    @Override
    public void push(int item) {
        if (stackOverflow < stackArray.length) {
            pushElement = item;
            stackArray[++top] = item;
            previousTop = top;
            stackOverflow++;
            showStack();
        } else System.out.println("stack is overflow...");
    }

    /*public void push() {
        if (stackOverflow < stackArray.length) {
            System.out.print("Додати елемент до стеку --> ");
            pushElement = scanner.nextInt();
            stackArray[++top] = pushElement;
            previousTop = top;
            stackOverflow++;
            showStack();
        } else System.out.println("stack is overflow...");
    }*/

    public void pop() {
        if (top == -1) System.out.println("stack is empty...");
        else {
            previousTop = top;
            popElement = stackArray[top];
            stackArray[top] = 0;
            top--;
            showStack();
        }
    }

    public void showStack() {
        Menu.showStackMenu();
        System.out.println("                   MY STACK: №" + getId());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int item : stackArray) System.out.print(item + " ");
        if (Menu.getChoice() == 6 || Menu.getChoice() == 7) System.out.print("");
        else {
            if (previousTop != top) System.out.print(" ---> element " + popElement + " was popped...");
            if (previousTop == top) System.out.print(" <--- element " + pushElement + " was pushed...");
        }
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
