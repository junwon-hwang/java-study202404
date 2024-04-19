package day09.poly.car;

public class Main {
    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        Car Tucson1 = new Tucson();
        Car Tucson2 = new Tucson();

        Car Mustang1 = new Mustang();
        Car Mustang2 = new Mustang();
        Car Mustang3 = new Mustang();
        Car Mustang4 = new Mustang();

        // 다양성을 통해 이종모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1,Tucson1,Mustang1};
        for (Car car : cArr) {
            car.accelerate();
        }
//         다른 타입에 배열 묶기도 가능해짐
//         연관성 있는 것끼리만 사용할 것
//         String[] sArr = { "abc" , "def" , 100 , false };
        Object[] sArr = { "abc" , "def" , 100 , false };


        System.out.println("=========================================");

        Driver driver = new Driver();
        driver.drive(new Mustang());
    }
}
