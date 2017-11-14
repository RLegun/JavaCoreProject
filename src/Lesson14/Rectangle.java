package Lesson14;


public final class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double getArea() {
        System.out.println("Обчислення площі прямокутника!");
        return getDim1() * getDim2();
    }

}
