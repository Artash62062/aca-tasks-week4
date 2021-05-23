package day5.task1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Horse horse = new Horse();
        //Runtime Polymorphism
        Animal animal1 = new Cat();
        animal.sound();
        //Compile time polymorphism
        Cat cat1 = new Cat();
        cat1.sound(0);
    }

}
