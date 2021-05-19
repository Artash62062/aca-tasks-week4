package day1;

public class Main {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Valodik", 22, "Trmavayi Park", 2000000);
        Employer employer2 = new Employer("Yurik", 66, "Toshakaru", 50000);
        System.out.println(employer1.toString());
        System.out.println(employer2.toString());
        int[] arr = new int[150];
        initRandomArray.initRandom(arr);
        Arithmetic arithmetic = new Arithmetic(arr);
        arithmetic.options();
    }
}
