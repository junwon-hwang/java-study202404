// art + 1 => 작업목록창 on/off

package day01;

public class TypeCasting {
    public static void main(String[] args) {

        byte a = 100; // 1byte
        int b = a;    // 4byte  => 작은 용량에서 큰 용량으로 변환시엔 암묵적으로 변환해줌

        // 암묵적 형 변환
        System.out.println("b = " + b);

        // c : 0 0000000 00000000 00000011 11101000 ( 10진수 1000이 int c에 저장될때)
        int c = 1000; // 4byte
        // 명시적 형 변환
        // d: 1 1101000
        // 0010111 -> 반전해야함
        // -> 1의보수 : +1
        // 0000001
        // 0011000 => 10진수 => 16 + 8 => 24
        byte d = (byte)c; // 1byte
        System.out.println("d = " + d);

        int k = 50; // 4byte
        double j = k; // 8byte

        System.out.println("j = " + j);
        
        double m = 5.567;
        int n = (int)m;

        System.out.println("n = " + n);

        // 암묵적 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> downcasting => 데이터 손실을 일으킬 수 있음.

        int v = 100;
        double z = 5.5;
        // 타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅한다. (데이터 손실 방지)
        double result = v+z;

        float f1 = 3.14f;
        double f2 = 5.5;
        double v1 = f1 - f2;
        System.out.println("v1 = " + v1);

        int s = 10;
        int o = 5;
        int r2 = (int)(s*0);
        System.out.println("r2 = " + r2);


        // int보다 작은 사이즈를 가진 타입은 연산시 결과가 자동으로 int로 캐스팅 된다.
//        char b1 = 'a';
//        char b2 = 'c';

        byte b1 = 100;
        byte b2 = 50;

        char cc = 'A';
        int plusNum = 3;
        char r4 = (char) (cc+plusNum);

        System.out.println("r4 = " + r4);
    }
}
