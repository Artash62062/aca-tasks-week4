package day2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("Unexpected Side Size");
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 1 || sideB > 20) {
            System.out.println("Unexpected Side Size");
        }
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 1 || sideC > 20) {
            System.out.println("Unexpected Side Size");
        }
        this.sideC = sideC;
    }

    public static boolean check(Triangle triangle) {
        return triangle.isTriangleValid();
    }
    public int square(Triangle triangle) {
        return sideA+sideB+sideC;
    }
    public double square() {
        int perimeter = (square(this))/2;
        return  Math.sqrt(perimeter*(perimeter-sideC)*(perimeter-sideA)*(perimeter-sideB));
    }
    private boolean isTriangleValid() {
        return (!(sideA + sideB <= sideC)||(sideC + sideB <= sideA) || (sideA + sideC <= sideB));
    }
    
}
