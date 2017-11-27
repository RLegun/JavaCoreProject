package Lesson19.TaskCashRegister;

import java.io.IOException;

public interface CheckPrintable {
    void saveCheck(String text) throws IOException;
}
