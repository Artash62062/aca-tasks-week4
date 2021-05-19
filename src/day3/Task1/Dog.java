package day3.Task1;

public class Dog extends Animal {
    @Override
    protected void eat(String food) {
        System.out.println("Dog " + this.name + "is eating" + food);
    }

    @Override
    protected String voice() {
        return "Haf Haf ";
    }
}
