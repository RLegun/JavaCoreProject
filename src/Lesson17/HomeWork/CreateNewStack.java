package Lesson17.HomeWork;

public class CreateNewStack {

    public static Stack createStack() {
        if (Menu.getChoice() == 1) {
            Stack stack = new MyStack();
            StackList.setStackLists(stack);
            return stack;
        } else {
            Stack stack = new RandomStack();
            StackList.setStackLists(stack);
            return stack;
        }
    }
}
