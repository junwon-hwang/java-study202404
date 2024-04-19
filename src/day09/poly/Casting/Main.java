package day09.poly.Casting;

public class Main {

    public static void main(String[] args) {

       Child child =  new Child();
       child.c1 = 100;
       // child가 parent를 상속받아서 가능
       child.p1 = 200;

       child.method1();
       child.method2();

        Parent parent = new Parent();
        parent.p1 = 500;
        parent.method1();

        // 부모의 타입을 사용했을때 자신의 필드와 메소드 사용불가
        // Parent castingChild = new Child();

        Child castingChild = new Child();

        castingChild.p1 = 100;
        castingChild.c1 = 20;
        castingChild.method1(); // 오버라이딩 된 메소드가 나옴
        castingChild.method2();

        // 1.본인의 타입을 사용하고 필요한 부분에서만 업캐스팅하여 사용
        Parent[] pArr = {castingChild};
        Parent pp = castingChild;

        // 2. 다운캐스팅해서 사용 car>Main 확인
    }

}
