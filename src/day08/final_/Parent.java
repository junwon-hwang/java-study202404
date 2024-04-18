package day08.final_;

class Child extends Parent {
//    @Override
//    void sing() {
//        System.out.println("비비크림 빠빠빠");
//    }

    @Override
    void dance() {
        System.out.println("춤을 핑팡퐁");
    }
}

public class Parent{
    // final 처리할게 많다면 class에 final을 붙여서 전체 상속 불가하도록 설정
    final void sing(){
        System.out.println("노래를 랄랄라");
    }
    void dance(){
        System.out.println("댄스를 하하호호");
    }
}
