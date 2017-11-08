package Lesson14;

public class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double getArea() {
        System.out.println("Обчислення площі трикутника!");

        return getDim1()*getDim2()/2;
    }
}
