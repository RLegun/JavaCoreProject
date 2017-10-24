package Lesson09;

public class IntegerQueue {
    private int size;
    private int[] arrQueue;
    private int front;
    private int rear;
    private int elements;

    public IntegerQueue() {
        size = 0;
        front = 0;
        rear = -1;
        elements = 0;
        arrQueue = new int[size];
    }

    public IntegerQueue(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        elements = 0;
        arrQueue = new int[size];
    }

    public void enqueue(int item) {
        if (rear == size) System.out.println("arrQueue overflow");
        else arrQueue[++rear] = item;
    }

    public int dequeue() {
        if (front < 0) {
            System.out.println("arrQueue is empty");
            return 0;
        } else {
            int frontItem = arrQueue[front++];
            arrQueue[front - 1] = 0;
            this.showArrQueue();
            return frontItem;
        }
    }

    public int getSize() {
        return size;
    }

    public int getElements() {
        return elements;
    }

    public void showArrQueue() {
        System.out.println("arrQueue of integer elements");
        for (int i = (size - 1); i >= 0; i--) {
            System.out.println("[" + i + "] = " + arrQueue[i]);
        }
    }
}
