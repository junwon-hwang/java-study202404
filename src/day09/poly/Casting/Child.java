package day09.poly.Casting;

public class Child extends Parent {

    int c1;

    // 부모의 메소드를 Override함
    @Override
    public void method1(){
        System.out.println("Overriding한 Child의 method1");
    }

    public void method2(){
        System.out.println("Child의 method2");
    }

}
