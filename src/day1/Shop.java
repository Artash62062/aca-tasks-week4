package day1;

import java.util.Scanner;

public class Shop {
    private int countOfProducts;
    private long balance;

    public Shop(String name, String address, int countOfProducts) {
        this.countOfProducts = countOfProducts;
    }

    public boolean checkOrder(int orderProductCount) {
        return orderProductCount < this.countOfProducts;
    }

    public void shopping(int orderProductCount) {
        Scanner scanner = new Scanner(System.in);
        if (checkOrder(orderProductCount)) {
            System.out.print("Press 1 for buy: ");
            int opNum = scanner.nextInt();
            if (opNum == 1) {
                calculateOrder(orderProductCount);
                System.out.println("Your order Will be shipped as soon as possible");
            } else {
                System.out.println("Unexpected Input");
            }
        } else {
            System.out.println("Now we dont have such Product Sorry");
        }
    }

    public void calculateOrder(int orderProductCount) {
        countOfProducts -= orderProductCount;
        int productPrice = 0;
        this.balance += (long) orderProductCount * productPrice;
    }
}
