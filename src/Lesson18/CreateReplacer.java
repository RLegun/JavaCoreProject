package Lesson18;

public class CreateReplacer {
    public static Replacer createReplacer(){
        Replacer replacer = new Replacer(new Reader(),new Shower(),new Writer());
        //InfoList.setInfoLists(replacer);
        return replacer;
    }
}
