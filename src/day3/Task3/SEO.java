package day3.Task3;

public class SEO extends Marketing {
    public static void main(String[] args) {
        Double b = 1000D;
        Double a = 1000D;
        System.out.println(a == b);
        a(b);
        System.out.println(b);
    }

    public static void a(Double b) {
        b -= 1000;
    }
}
