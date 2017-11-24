package Lesson18;

import Lesson16.InfoList;

import java.io.IOException;
import java.util.ArrayList;

public class Replacer {
     private IRead iRead;
     private IShow iShow;
     private IWrite iWrite;

    public Replacer(IRead iRead, IShow iShow, Writer writer) {
        this.iRead = iRead;
        this.iShow = iShow;
        this.iWrite = writer;
    }

    public void replace(){
        String tempText = iRead.getInformationFromConsole();
        tempText = tempText.replace("0","9");
        iShow.showInformation(tempText);
    }

    public void fileReader() throws IOException {
        ArrayList<String> infoFromFile = iRead.getInfoFromFile();
        iShow.showInfoFromFile(infoFromFile);
        InfoList.setInfoLists(infoFromFile);
    }

    public void fileWriter() throws IOException {
        ArrayList<String> listTempText = iRead.getInfoFromConsole();
        iWrite.putInfoIntoFile(listTempText);
    }
}
