package Lesson18;

import java.io.*;
import java.util.Scanner;

public class ReaderFromFile implements IRead{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInformation() throws IOException {
        System.out.print("enter the path --> ");
        BufferedReader text = new BufferedReader(new FileReader(new File(scanner.next())));
        return text.readLine();
    }
}
