package day5.task2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal();
        Animal cat1 = new Cat();
        System.out.println(cat1.age+" "+ cat1.name);
        System.out.println(cat.age+" "+ cat.name);
        System.out.println(animal.age+" "+ animal.name);
    }
}
