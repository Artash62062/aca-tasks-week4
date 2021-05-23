package day5.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[50];
        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i] = randomShapeGenerator();
        }

        for (Shape shape : shapeArray) {
            assert shape != null;
            shape.printType();
            System.out.println("Area  = " + shape.area() + " Perimeter = " + shape.perimeter());
        }

    }

    public static Shape randomShapeGenerator() {
        Random random = new Random();
        int shapeNum = Math.abs(random.nextInt() % 3);
        int shapeSize = Math.abs(random.nextInt() % 100);
        switch (shapeNum) {
            case 0:
                System.out.println("Generated New Circle");
                return new Circle(shapeSize);
            case 1:
                System.out.println("Generated new Rectangle");
                return new Rectangle(shapeSize, Math.abs(random.nextInt() % 50));
            case 2:
                System.out.println("Generated new Square");
                return new Square(shapeSize);
            default:
                System.out.println("Something Get Wrong");
                return null;
        }
    }
}
