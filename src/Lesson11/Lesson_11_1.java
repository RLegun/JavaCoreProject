package Lesson11;

public class Lesson_11_1 {
    public static void main(String[] args) {
        int firstValue = 10;
        int secondValue = 20;

        incrementNumber(firstValue);

        System.out.println("after method = "+firstValue);


    }


    public static void incrementNumber(int args) {
        args++;
        System.out.println("args = "+args);
    }



}
