package day09.poly;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class Basic {

    void test(){

        // 다형성 : 객체가 여러 타입을 사용할 수 있다.
        // - 부모의 타입을 사용 가능
        Object x1 = new A(); // 부모
        A x2 = new B(); // 자식
        A x3 = new C(); // 자식
        A x4 = new D(); // 후손
        A x5 = new E(); // 후손

        int a = 10;
        double b = a;

       C c = new C();
       A d = c;
    }

}
