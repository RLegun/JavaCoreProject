package Lesson14;

import java.util.ArrayList;

public class FigureRuner {
    public static void main(String[] args) {
        Figure fig = new Figure(25,25);
        Triangle tri = new Triangle(30,30);
        Triangle tri2 = new Triangle(35,30);
        Rectangle rec = new Rectangle(50,50);

        ArrayList<Figure> arrayList = new ArrayList<>();
        arrayList.add(fig);
        arrayList.add(tri);
        arrayList.add(rec);
        arrayList.add(tri2);


        for (Figure figure:arrayList){
            if(figure instanceof Triangle){
                System.out.println(figure.getArea());
            }
        }
    }
}
