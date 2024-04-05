// 지우면 안됨
package day01;

//파일명과 클래스는 동일해야함
//클래스 첫글자는 대문자 카멜케이스사용
public class Variabel {
    public static void main(String[] args) {
        // 자바는 타입에 엄격함
        // 변수는 첫글자 소문자,명사
        int score = 78; // 정수
        String userName = "홍길동"; // 문자열

        int phone_number;
        int phoneNumber; // 자바는 카멜케이스를 관례로 사용

        // 변수의 스코프 - 블록레벨 스코프
        // 자바의 변수는 생성된 블록이 종료되면 메모리에서 사라진다.
        int i = 100;  // main이 종료되면 사라짐 , 아래 for문에서 변수 i 사용 불가
        for (int j = 0; j < 5; j++) { // 변수 j는 for 문이 종료되면 사라짐
            System.out.println(j);
        } // end for
    } // end main
} // end class
