package day5.task2;

public class Cat extends Animal {
    int age = 50;
    String name ="Cat";

    @Override
    public void sound() {
        System.out.println("Cat is say Myau");
    }
}
