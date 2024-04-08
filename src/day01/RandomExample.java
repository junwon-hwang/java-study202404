package day01;

public class RandomExample {
    public static void main(String[] args) {

        // 연산자 우선 순위
        // 단항(++,--,!) > 이항(*,/,%) > 삼항(?:) > 대입(=)

        int a = 10;
        int b = ++a -10 * 3;

        /*
            자바에서 난수 만들기
            x~y 사이의 정수 난수 만드는 공시
            자바스크립트 공식 Math.floor(Math.random() * (y - x + 1)) + x
            자바 공식 Math.floor 대신 (int) 대입
        */

        // (int)Math.random()*10 의 오류
        // Math.random => 0.0 <= ~ < 1.0
        // (int)로 캐스팅 하면 소수점이 날라감
        // 0 <= 1 의 정수는 0뿐임
        // 이후 0 * 10 + 1 = 항상 1

        int random = (int)(Math.random()*10)+1;
        System.out.println(random);
    }
}
