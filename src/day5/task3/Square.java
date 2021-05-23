package day5.task3;

public class Square extends Rectangle implements Shape {

    public Square(int height) {
        super(height,height);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public void printType() {
        System.out.println("The Type of Shape is Square");
    }
}
