package Lesson24_Generics;

public class GenericStack<T> {
    private T[] stack;
    private int top = -1;
    private T pushElement;
    private T popElement;

    public GenericStack(Integer maxSize) {
        stack = (T[]) new Object [maxSize];
    }

    public void push(T element) {
        stack[++top] = element;
        pushElement = element;
    }

    public void pop() {
        popElement = stack[top];
        stack[top--] = null;
        }



    public void showStack() {
        Menu.showStackMenu();
        System.out.println("                   MY STACK:"                        );
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (T item : stack) System.out.print(item + " ");
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        if (Menu.choice == 2)System.out.println("Додано --> "+pushElement);
        else if (Menu.choice == 3)System.out.println("Витягнуто --> "+popElement);
        else System.out.println("Стек створено...");
    }

}
