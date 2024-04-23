package day11.generic;

import day07.modi.pac1.A;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple(10));

        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana(15));
        Banana banana = bb.getBanana();

        Basket<Apple> appleBasket = new Basket<Apple>();
        appleBasket.setFruit(new Apple(1));
        Apple fruit = appleBasket.getFruit();
        System.out.println("fruit = " + fruit);

        Basket<Banana> bananBasket = new Basket<Banana>();
        bananBasket.setFruit(new Banana(1));
        Banana fruit2 = bananBasket.getFruit();
        System.out.println("fruit2 = " + fruit2);

    }
}
