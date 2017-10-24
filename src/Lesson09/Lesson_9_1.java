package Lesson09;

import java.util.Random;

public class Lesson_9_1 {
    public static void main(String[] args) {
        IntegerStack myStack  = new IntegerStack(10);
        Random rnd = new Random();
        myStack.showStack();
        System.out.println("Pushing...");
        for (int i = 0; i < myStack.getSize(); i++) {
            myStack.push(rnd.nextInt(50));
        }
        myStack.showStack();

        for (int i = 0; i <myStack.getSize() ; i++) {
            int item = myStack.pop();
            System.out.println("Current element is "+item);
            System.out.println("----------------------");
        }
    }
}
