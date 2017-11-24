package Lesson09;

public class IntegerStack {
    private int size;
    private int[] stack;
    private int top;

    public IntegerStack() {
        top = -1;
        size = 0;
        stack = new int[size];
    }

    public IntegerStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[size];
    }

    public void push(int item) {
        if (top == size) System.out.println("MyStack overflow");
        else stack[++top] = item;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("MyStack is empty");
            return 0;
        } else {
            int temItem = stack[top--];
            stack[top+1] = 0;
            this.showStack();
            return temItem ;
        }
    }

    public int getSize() {
        return size;
    }

    public void showStack() {
        System.out.println("MyStack of integer elements");
        for (int i = (size - 1); i >= 0; i--) {
            System.out.println("[" + i + "] = " + stack[i]);
        }
    }
}
