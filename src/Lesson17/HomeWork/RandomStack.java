package Lesson17.HomeWork;

import java.util.ArrayList;
import java.util.Random;

public class RandomStack implements Stack {
    private int id = StackList.getStackLists().size() + 1;
    private ArrayList<Integer> stackArray;
    private int top = -1;
    private int previousTop;
    private int popElement;
    private int pushElement;

    public int getId() {
        return id;
    }

    public void createNewStack() {
        stackArray = new ArrayList<>();
        Menu.showStackMenu();
        System.out.println("new stack №" + getId() + " was created...");
    }

    @Override
    public void push(int item) {
        pushElement = item;
        stackArray.add(++top, item);
        previousTop = top;
        showStack();
    }

    /*public void push() {
        pushElement = random.nextInt(100);
        stackArray.add(++top, pushElement);
        previousTop = top;
        showStack();
    }*/

    public void pop() {
        if (stackArray.isEmpty()) System.out.println("stack is empty...");
        else {
            previousTop = top;
            popElement = stackArray.get(top);
            stackArray.remove(top);
            top--;
            showStack();
        }
    }

    public void showStack() {
        Menu.showStackMenu();
        System.out.println("                  RANDOM STACK: №" + getId());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int item : stackArray) System.out.print(item + " ");
        if (Menu.getChoice() == 6 || Menu.getChoice() == 7) System.out.print(" ");
        else {
            if (previousTop != top) System.out.print(" ---> element " + popElement + " was popped...");
            if (previousTop == top) System.out.print(" <--- element " + pushElement + " was pushed...");
        }
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
