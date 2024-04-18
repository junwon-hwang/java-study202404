package day08.super_;

public class Child extends Parent{

//    int a;
//    double b;
    boolean c;

    Child(){
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }

    Child(int x){
        // super(); 첫줄에 아무것도 없으면 쓰지않아도 자동으로 들어옴.
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }

    // this.a가 없으면 부모 Parent로 가서 super.a를 찾아서 출력함
    // this.a가 있으면 this.a의 값 출력
    void ChildMethod(){
        System.out.println("Child.a = " + this.a);
        System.out.println("Child.b = " + this.b);
        System.out.println("Child.c = " + this.c);
    }
}
