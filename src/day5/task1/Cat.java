package day5.task1;

import java.util.Random;

public class Cat extends Animal{
    public void sound(int opNum) {
        switch (opNum) {
            case 0:
                System.out.println("Myau Myau");
                break;
            case 1:
                System.out.println("Mrrrrr");
                break;
        }
    }

    @Override
    public void sound() {
        Random random = new Random();
        int soundNum = random.nextInt()%2;
        switch (soundNum) {
            case 0:
                System.out.println("Myau Myau");
                break;
            case 1:
                System.out.println("Mrrrrr");
                break;
        }
    }
}
