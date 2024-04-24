package day12.inner;

import day09.book.RentStatus;

public class Main {

    // 내부 클래스 (중첩 클래스)
    // 뺄셈 계산기가 필요한데 아마도 이 계산기 설계도는
    // Main Class 안에서만 사용하고 외부에서는 안쓸것 같아.
    // 내부 클래스에는 static을 붙임
    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }

    }

    public static void main(String[] args) {

//        Calculator addCal = new AddCalculator();

        Calculator cal;
        cal = new AddCalculator();

        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        cal = new SubCalculator();
        int r2 = cal.operate(50, 20);
        System.out.println("r2 = " + r2);


        // 익명 클래스 : 이름이 없는 클래스를 빠르게 선언하는 법
        // 클래스를 통해 객체를 생성은 하지만 다시 사용은 안함(1회용 클래스)

        cal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        int r3 = cal.operate(10, 4);
        System.out.println("r3 = " + r3);

        // 람다
        // 사용 전제조건
        // - 반드시 인터페이스 안의 추상 메소드가 1개여야 한다.
        cal = (n1, n2) -> n1 / n2;


        int r4 = cal.operate(50, 5);
        System.out.println("r4 = " + r4);

        System.out.println("=======================================");

        restaurant fr = new FrenchRestaurant();
        restaurant fr2 = new FrenchRestaurant();
        restaurant fr3 = new FrenchRestaurant();


        restaurant japaneseRestaurant = new restaurant() {
            @Override
            public void cook() {
                System.out.println("일식 요리를 합니다.");
            }
        };

        restaurant italian = () -> System.out.println("이탈리아 요리를 합니다.");

    }
}
