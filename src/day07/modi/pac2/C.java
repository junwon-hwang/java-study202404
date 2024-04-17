package day07.modi.pac2;
import  day07.modi.pac1.A;
//import day07.modi.pac1.B;

public class C {

    public int y1;
    int y2;
    private int y3;

    void test(){

        A a = new A(100); // public
//        new A(3.14); // default 다른 패키지 사용 불가
//        new A(false);

        a.f1 = 10; //
//        a.f2 = 20;
//        a.f3 = 30;

        a.m1();
//        a.m2();
//        a.m3();


//       new B();

    }
}
