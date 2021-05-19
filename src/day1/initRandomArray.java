package day1;

import java.util.Random;

public class initRandomArray {
    public static void initRandom (int [] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
    }
}

