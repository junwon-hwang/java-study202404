package day08.static_;

import static day08.static_.Count.m1;
import static java.lang.System.*;
import static utill.SimpleInput.input;

public class Main {
    public static void main(String[] args) {


        // static 이 붙은 필드 및 메서드 값
        // 객체 생성 없이 사용이 가능하다.
        Count.x = 99;
        Count.x = 50;

        m1();
        out.println("c1.x = " + Count.x);
        out.println("c2.x = " + Count.x);

        Count c1 = new Count();
        Count c2 = new Count();

        c1.y = 10;
        c2.y = 20;

        out.println("=====================");
        out.println("c1.y = " + c1.y);
        out.println("c2.y = " + c2.y);
        c2.m2();
        c1.m2();

//        String name = input("안녕");
//        out.println();

        m1();

        out.println("===================");
        // 객체 생성 전 => null 값 , 정적 초기화자 (static initializer) 생성 후 대한민국
        out.println("국가: " + Person.nation);

        // 객체 생성 후
        Person gap = new Person("갑돌이",20);
        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);
    }
}
