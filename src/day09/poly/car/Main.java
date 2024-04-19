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

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("===========================================");

        CarShop shopp = new CarShop();

        // 객체타입에서 다운캐스팅의 전제조건 : 상속관계가 있어야하며
        // 자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 있음

        Sonata car = (Sonata) shopp.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        // 즉 부모객체를 자식타입으로 내릴 수는 없다.
        // Sonata ccc = (Sonata) new Car();
        // 상속관계가 없어서 불가능
        //Sonata mmm = (Sonata) new Mustang();

        // 한번 업캐스팅이 된 상태에서 내려온거는 가능
        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

        System.out.println("===========================================");

        driver.drive(new Tucson());




    }
}
