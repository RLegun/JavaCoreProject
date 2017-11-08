package Lesson11.ParcelsSystem;

public class Box {
    private double height;
    private double width;
    private double depth;

    public Box() {
        height = 0;
        width = 0;
        depth = 0;
    }

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void getInfo(){
        double volume = height * width * depth;
        System.out.println("Об'єм нашої коробки = "+volume);
        System.out.println("--------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
