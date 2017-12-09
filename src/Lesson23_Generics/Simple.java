package Lesson23_Generics;

public class Simple<T> {
    private T firstField;

    public Simple(T firstField) {
        this.firstField = firstField;
    }

    public T getFirstField() {
        return firstField;
    }

    public void showType(){
        System.out.println("Type T is "+firstField.getClass().getName());
    }

}
