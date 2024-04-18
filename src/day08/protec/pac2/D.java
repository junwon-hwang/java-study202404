package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {

    D(){
        super(5); // public,protected 가능

        f1 = 100;  // protected
//        f2 = 200; // default

        m1();  // protected
//        m2(); // default

    }

    void test(){
        // protected 상속을 통해서만 접근 허용
        A a = new A();
//        a.f1 = 10; a.f2 = 30;
//        a.m1(); a.m2();
    }
}
