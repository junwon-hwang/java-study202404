package day03;

import java.util.Scanner;

public class MethodBasic {
    
        /* ctrl + art + n 넣기
           ctrl + art + v 빼기 */

    // 자바의 함수는 반드시 클래스 블록 내부, 다른 메서드 외부에 만들어야 함

    // 두 개의 정수를 전달 받아 합을 리턴하는 함수
    // 리턴되는 값을 말머리의 타입을 말머리에 붙여줘야 함
    static int add(int n1, int n2){
        return n1+ n2;
    }

    static String add2(int n1, int n2){
        return "hello";
    }

    static int[] add3(int n1, int n2){
        int[] arr = {n1,n2};
        return arr;
    }
    
    static String[] add4(int n1, int n2){
        String[] strings = {"hello", "java"};
        return strings;
    }

    // return 이 없는 함수는 void
    static void multiply(int n1,int n2){
        if(n1>100) return;
        System.out.printf("%d x %d = %d \n", n1, n2, n1*n2);
    }
    
    // n개의 정수를 전달 받아 그 총합을 반환하는 함수 
    // 업캐스팅은 자동변환 , 다운캐스팅은 return 에 명시해줘야함 
    
    static int addAll(int[] numbers){
        int total = 0;
        for (int n : numbers){
            total +=n;
        }
        return total;
    }

    static int addAll2(int... numbers){
        int total = 0;
        for (int n : numbers){
            total +=n;
        }
        return total;
    }

    // 2개의 정수를 전달받아 사칙연산의 결과를 모두 리턴
    static int[] operate(int n1, int n2){
        return new int[] {add(n1,n2), n1- n2, n1*n2, n1/n2};
    }

    public static void main(String[] args) {
        // 함수를 호출할 때는 함수 안에서만 가능
        int r1 = add(10, 20);
        System.out.println("r1 = " + r1);

        // void 함수는 함수의 결과를 변수에 담을 수 없음
        // 반드시 단독 호출 해서 사용해야함
        multiply(5,3);
        int[] arr = {1,3,5,7,9};
//      int r2 = addAll(arr);
        int r2 = addAll(new int[]{1,3,5,7,9});

        System.out.println("r2 = " + r2);

        int r3 = addAll2(10,20,30,40,50);
        System.out.println("r3 = " + r3);

        int[] operateResultList = operate(20, 10);
        System.out.println("operateResultList[2] = " + operateResultList[2]);
    } // end main method
} // end class
