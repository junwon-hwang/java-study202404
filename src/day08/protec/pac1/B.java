package day08.protec.pac1;

public class B {

    void test(){

        // 같은 패키지 안에서도 괜찮음
        A a = new A();
        A a1 = new A(1);
        A a2 = new A(2.2);

        a.f1 = 10; a.f2 = 30;
        a.m1(); a.m2();

    }

}
