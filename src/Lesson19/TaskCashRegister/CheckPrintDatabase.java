package Lesson19.TaskCashRegister;

import java.io.*;
import java.time.LocalDate;

public class CheckPrintDatabase implements CheckPrintable {
    @Override
    public void saveCheck(String text) {
        File file =null;
        PrintWriter writer = null;
        try {
            double sum = MenuCashRegister.getSum();
            LocalDate date = LocalDate.now();
            file = new File("C:\\Users\\Роман\\Desktop\\database.txt");
            writer = new PrintWriter(new FileWriter(file,true));
            writer.println("---------------------------------------------------");
            writer.println("            < ЧЕК ОПЛАТИ > ||database||            ");
            writer.println("---------------------------------------------------");
            writer.println("  "+text+"                                         ");
            writer.println("  СУМА ОПЛАТИ: " + sum+"                           ");
            writer.println("  "+date+"                                         ");
            writer.println("---------------------------------------------------");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Exception while file closing");
            }
        }
    }
}
