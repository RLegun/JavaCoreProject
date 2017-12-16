package Lesson23_Generics.Task23_GenerikClass;

public class BubbleSort<T> {
    private T[] bubbleSort;

    public BubbleSort(T[] bubbleSort) {
        this.bubbleSort = bubbleSort;
    }

    public T[] getBubbleSort() {
        return bubbleSort;
    }


}
