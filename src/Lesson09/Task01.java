package Lesson09;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random rnd = new Random();

        IntegerQueue myQueue = new IntegerQueue(10);
        myQueue.showArrQueue();
        System.out.println("Enqueueing...");
        int elements = myQueue.getElements();
        for (int i = 0; i < myQueue.getSize(); i++) {
            myQueue.enqueue(rnd.nextInt(50));
            elements++;
        }

        myQueue.showArrQueue();

        for (int i = 0; i < myQueue.getSize(); i++) {
            int frontItem = myQueue.dequeue();
            System.out.println("Current element is "+frontItem);
            System.out.println("Items left: "+(--elements));
            System.out.println("-----------------------------");
        }
    }
}
