package Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderFromConsole implements IRead{
    @Override
    public String getInformation() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть текст:");
        String string = reader.readLine();
        return string;
    }
}
