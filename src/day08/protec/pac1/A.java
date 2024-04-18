package day08.protec.pac1;

// protected가 default보다 범용성이 좋음

public class A {
    protected int f1;
    int f2; // default(package-private)

    protected void m1(){}
    void m2(){}

    public  A(){}
    protected A(int a){}
    A(double b){}

    // 같은 클래스 안에서는 상관 없음
    void test(){
        f1 = 1; f2 = 2;
        m1(); m2();
        new A();
        new A(1);
        new A(3.4);
    }
}
