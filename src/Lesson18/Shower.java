package Lesson18;

import java.util.ArrayList;

public class Shower implements IShow {

    @Override
    public void showInformation(String item) {
        System.out.println("Result of replace: "+item);
    }

    @Override
    public void showInfoFromFile(ArrayList text) {
        for (Object string:text) System.out.println(string);
    }
}
