package Lesson06;

import java.util.Random;

/*
Дано масив із n елементів. Знайти суму елементів масиву, значення
яких не перевищує 16.



 */
public class lesson_6_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrSize = 20;
        int[] arr = new int[arrSize];
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            arr[i]=random.nextInt(50);
            System.out.println("["+i+"]="+arr[i]);
        }
        for (int i = 0; i < arr.length ; i++) {
           if (sum<16){
               sum = sum + arr[i];
           }

        }
        System.out.println("Сума елементів = "+sum);

    }
}
