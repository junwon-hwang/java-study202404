package day10.inter;

public class Main {
    public static void main(String[] args) {

//        new SmartPhone(); 추상적인 것은 구체화 불가

        System.out.println(SmartPhone.AGE);

        SmartPhone galaxy = new Galaxy();
        SmartPhone iPhone = new IPhone();

    }
}
