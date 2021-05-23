package day5.task3;

public class Rectangle implements Shape {
    protected int height;
    protected int  width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimeter() {
        return 2*height + 2*width;
    }

    @Override
    public void printType() {
        System.out.println("The Type of Shape is Rectangle");
    }
}
