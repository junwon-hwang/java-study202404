package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ctrl + alt + T
        try {
            System.out.printf("정수1: ");
            int n1 = Integer.parseInt(sc.next());
            // NumberFormatException

            System.out.printf("정수2: ");
            int n2 = sc.nextInt(); // InputMismatchException

            int result = n1 / n2 ; // ArithmeticException

            String S = null;
            S.equals("hello"); // NullPointerException

            System.out.printf("result = " + result);
        } catch (NumberFormatException e) { // 최상위 부모가 Exception
            // 구체적인 에러를 입력했을때는 해당 에러만 잡음
            // 멀티 catch를 통하여 각 오류마다 sout 메시지 전달 가능
            System.out.println("정수를 입력하시라니까용~?");
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("문자로 변환할 수 없는 숫자입니다.");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다. ");
            e.printStackTrace(); // 에러 로그를 띄움 - 개발시에 유용
        } catch(Exception e){ // Exception은 제일 아래에 위치하려 에러 확인
            System.out.println("알 수 없는 에러입니다.");
            e.printStackTrace();
        }

        System.out.println("\n프로그램 정상 종료!");
    }
}
