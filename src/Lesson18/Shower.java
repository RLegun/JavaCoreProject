package Lesson18;

public class Shower implements IShow {

    @Override
    public void showInformation(String item) {
        System.out.println("Result of replace: "+item);
    }
}
