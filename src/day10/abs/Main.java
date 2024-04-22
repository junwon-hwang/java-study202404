package day10.abs;

public class Main {
    public static void main(String[] args) {

        // new Pet(); // abstract 로 구체화 못하게 막아둠

        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();

        GoldFish myFish = new GoldFish();

        // 같은 기능이지만 메소드 이름이 다름
        // 리모컨 같은 경우 전원버튼이 빨간색 => 추상화가 잘 되어 있음.

        Pet[] petList = {myDog,myCat,myFish};

        for (Pet pet : petList) {
            pet.eat(); // => 밥먹는 기능을 eat으로 통일(추상화)함
            pet.sleep();
        }



    }
}
