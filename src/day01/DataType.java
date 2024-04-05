package day01;

public class DataType {
    public static void main(String[] args) {
        // 정수타입
        // 1byte = 8bit
        // 1bit = 숫자 0이나 1을 저장할 수 있음.
        // 1111 => 8 + 4 + 2 + 1 => 15
        // 1(부호비트) 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 => 127
        // 0이면 양수 1이면 음수
        byte a = 127;        // 1byte (미사용)
        short b = 32767;     // 2byte (미사용)
        int c = 2147483647;  // 4byte (사용)
        long d = 2147483647123123L; // 8byte 접미사 L

        // 실수타입

        float e = 3.14123123123123F; // 4byte , 접미사 F
        double f = 3.14123123213123; // 8byte (사용)
        double g = 100; // 실수는 기본적으로 정수를 저장할 수 있음 , 100.0으로 출력

        System.out.println("g = " + g);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // 논리타입

        boolean flag1 = true;
        boolean flag2 = 10 > 5;

        // ctrl + alt + v  타입을 확인하여 자동 작성해줌
        // 아래 200도 자동으로 변수에 담아줌

        System.out.println(200 + a);
        System.out.println(b * 200);

        // 문자타입
        // 문자형 char : 2byte 0~65536로 모든문자 표현 가능
        // short는 2byte 음수+양수 합쳐서 65536        
        // char는 한글자 string은 char의 배열
        
        char text = 'a';
        char text2 = '가';
        char text3 = 44033;
        System.out.println("text = " + text);
        System.out.println("text3 = " + text3);
        
        // 문자열 : 문자 배열 (String)
        // "안녕하세요" => 컴퓨터 언어에서 ""가 배열을 만들어줌
        char[] hello = {'안','녕','하','세','요'};
        System.out.println("hello = " + new String(hello));

        // 자바의기본 타입 8가지
        // byte short int long , float double , boolean , char
        // string은 클래스 타입
    }
}
