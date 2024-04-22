package day10.abs;

// 추상클래스 => 부모 클래스는 추상클래스로 만드는게 좋음

// abstract 사용
public abstract class Pet {

    String name;
    int age;
    String kind;

    // 산책기능은 필요한 객체가 필요에 따라 오버리딩 하는것이지 모두에게
    // 강요할 필요가 없다면 굳이 추상화하지 않아도 됨
    public void walk(){
        System.out.println("산책은 무조건 공원에서만 하세요");
    }

    // 추상메서드
    // 밥, 잠 기능은 필수기능이니까 없으면 객체가 불안정해지므로
    // 강요할 필요가 있으므로 추상화
    public abstract void eat();

    // 추상 메서드는 본문이 없는 껍데기 역할
    // 자식들에게 메서드(기능) 이름을 통일시키기 위한 장치로만 사용
    // 추상클래스가 아니면 추상메서드를 만들 수 없음
    // 다만 추상클래스 내부에는 추상 메서드 이외에 모든 메서드 선언가능
    public abstract void sleep();

}
