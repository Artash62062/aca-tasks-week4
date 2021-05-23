package day4.task1;

public class Square  extends Shape{
    @Override
    protected double getArea(int radius) {
        return Math.pow(2,radius);
    }

    @Override
    protected double getPerimeter(int radius) {
        return 4*radius;
    }
}
