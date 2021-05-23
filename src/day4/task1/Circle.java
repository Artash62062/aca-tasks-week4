package day4.task1;

public class Circle extends Shape {

    @Override
    protected double getArea(int radius) {
        return Math.PI*Math.pow(2,radius);
    }

    @Override
    protected double getPerimeter(int radius) {
        return Math.PI*2*radius;
    }
}
