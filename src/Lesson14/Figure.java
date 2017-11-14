package Lesson14;

public abstract class Figure {
    private double dim1;
    private  double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public  abstract double getArea();

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

     public final void getEnformation (){
         System.out.println("some enformation");
     }
}
