package day08.static_;

public class Person {
    String name;
    int age;
    static String nation; // 인원이 전부 한국사람이라고 가정되면 static

    // 정적 초기화자 (static initializer)
    // static 필드의 생성자 같은 역할 (static필드 초기화 담당)
    static {
        nation = "대한민국";
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
//        this.nation = "대한민국";
    }
}
