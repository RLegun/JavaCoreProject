package Lesson11;

public class Lesson_11_1 {
    public static void main(String[] args) {
        int firtsValue = 10;
        int secondValue = 20;

        incrementNumber(firtsValue);

        System.out.println("after method = "+firtsValue);


    }


    public static void incrementNumber(int args) {
        args++;
        System.out.println("args = "+args);
    }



}
