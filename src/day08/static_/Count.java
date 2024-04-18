package day08.static_;

public class Count {

    // 사용 제한자(Usage modifier)
    static int x; // 정적 필드 : 모든 객체가 공유 한다.
    int y; // 인스턴스 필드  : 각 객체 별로 따로 관리

    // 정적 메서드 : 모든 객체가 공유하며 객체 생성없이 접근 가능
    static void m1(){
        System.out.println("Static Method call!");
        System.out.println("x(static) = " + x);
        // static 메서드 내부에서는 instance 필드와 메서드를 직접 참조 할 수 없다.
        // static 은 객체 생성 없이 호출되므로 this를 가질 수 없기 때문에
        // y의 대상을 정확히 알려줘야 함
        Count c3 = new Count();
        System.out.println("y(instance) = " + c3.y);
        c3.m2();
        // this.m2(); 인스턴스 메서드 호출 불가
    }

    // 인스턴스 메서드 : 각 객체별로 따로 실행됨
    void m2(){
        System.out.println("instance Method call!");
        System.out.println("x(static) = " + x);
        System.out.println("y(instance) = " + y);
    }

}
