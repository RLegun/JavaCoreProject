package Lesson21;

public class Lesson_21 {
    public static void main(String[] args) {
        try {
            int size = args.length;
            int check = 100/size;


            try {
                for (int i = 0; i <50 ; i++) {
                    System.out.println(args[i]);
                }
            } catch (Exception e) {
                System.out.println("Exception in block ");
            }

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
