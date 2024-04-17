package day07.modi.pac1;

import day07.modi.pac2.C;

// class 에는 public default만 가능 ( protected, private 불가 )
 class B {

     public int z1;
     int z2;
     private int z3;

    void test(){
        A a1 = new A(50); // public
        A a2 = new A(5.55); // default
//        new A(true); // private 사용 불가

        a1.f1 = 20; // public  다른 패키지에서 사용 가능
        a1.f2 = 50; // default 같은 패키지안에 클래스면 사용 가능
//        a1.f3 = 500; // private 사용 불가

        a1.m1();
        a1.m2();
//        a1.m3(); // private

        C c  = new C();
        c.y1 = 10;
//        c.y2 = 20;
//        c.y3 = 30;



    }
}
