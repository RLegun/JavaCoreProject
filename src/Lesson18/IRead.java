package Lesson18;

import java.io.IOException;
import java.util.ArrayList;

public interface IRead {
    String getInformationFromConsole();
    ArrayList<String> getInfoFromConsole() throws IOException;
    ArrayList<String> getInfoFromFile() throws IOException;
}
