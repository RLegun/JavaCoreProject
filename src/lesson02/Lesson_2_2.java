package lesson02;

public class Lesson_2_2 {
    public static void main(String[] args) {
        int x = 10;
        double y = 21.5;
        boolean compareXY = (x!=y);

        int resultX = x%3;
        double resultY = y%10;

        System.out.println("X mod 10 = "+ resultX);
        System.out.println("Y mod 10 = "+ resultY);

        resultX++;
        resultX--;

        resultX = resultX +15;
        resultX+=15;

        System.out.println("X = "+resultX);
        System.out.println("X = Y is "+compareXY);


        /*

        ==
        > < >= <=
        !=


         */
    }
}
