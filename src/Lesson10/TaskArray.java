package Lesson10;

import java.util.Random;

public class TaskArray {
    private static int size = 10;
    private static int[] array;
    private static Random rnd = new Random();

    public static int[] getArray() {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int random = rnd.nextInt(89)+10;
            array[i] = random;
        }
        for (int item:array) System.out.print(item+"|");
        return array;
    }
}
