package Lesson10;

public class Task01 {

    public static int sumOfElements(int[] getArray) {
        int sum = 0;
        for (int i = 0; i < getArray.length; i++) {
            sum += getArray[i];
        }
        System.out.println(" ---> Сумма елементіва цілих чисел в масиві = " + sum);
        System.out.println("--------------------------------------------------------------------------------");
        return sum;
    }

    public static int numberOfPairedElements(int[] getArray) {
        int counter = 0;
        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] % 2 == 0) counter++;
        }
        System.out.println(" ---> Кількість парних чисел в масиві складає: " + counter);
        System.out.println("--------------------------------------------------------------------------------");
        return counter;
    }

   public static int muxNumber(int[] getArray) {
        int muxNumber = 0;
        for (int i = 0; i < getArray.length; i++) {
            if (muxNumber < getArray[i]) muxNumber = getArray[i];
        }
        System.out.println(" ---> Максимальне число в масиві цілих чисел = " + muxNumber);
       System.out.println("--------------------------------------------------------------------------------");
       return muxNumber;
    }

    public static int minNumber(int[] getArray) {
        int minNumber = 99;
        for (int i = 0; i < getArray.length; i++) {
            if (minNumber > getArray[i]) minNumber = getArray[i];
        }
        System.out.println(" ---> Мінімальне число в масиві цілих чисел = " + minNumber);
        System.out.println("--------------------------------------------------------------------------------");
        return minNumber;
    }
}
