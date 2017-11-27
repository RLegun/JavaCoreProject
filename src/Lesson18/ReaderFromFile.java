package Lesson18;

import java.io.*;
import java.util.Scanner;

public class ReaderFromFile implements IRead{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInformation() throws IOException {
        System.out.print("enter the path --> ");
        String path = scanner.next();
        File f = new File(path);
        BufferedReader text = new BufferedReader(new FileReader(f));
        return text.readLine();
    }
}
