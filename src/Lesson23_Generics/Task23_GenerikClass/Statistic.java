package Lesson23_Generics.Task23_GenerikClass;

public class Statistic <T extends Number> {
    private T[] numbers;

    public Statistic(T[] numbers) {
        this.numbers = numbers;
    }

    public double average(){
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }

    public boolean isSameAverage(Statistic <? extends Number> object){
        if (this.average() == object.average())return true;
        return false;
    }

    public void bubbleSorting() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j].doubleValue() > numbers[j + 1].doubleValue()) {
                    T tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }

    public void showArray(){
        System.out.println(" ");
        for (T x:numbers) System.out.print(x+" ");
    }
}
