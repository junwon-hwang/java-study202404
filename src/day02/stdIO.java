package day02;

import java.io.IOException;
import java.util.Scanner;

public class stdIO {
    public static void main(String[] args) throws IOException {
        // println => ln이 뒤에 \n을 넣어줌
        System.out.println("강아지");System.out.print("고양이\n");

        String name = "김철수";
        // %s : 문자, %d : 정수 , %f : 실수, %c : 단일문자
        System.out.printf("%s의 강아지\n",name);
        System.out.printf("%s의 고양이\n",name);

        // 자바에서 키보드 입력 받기
        // int read = System.in.read();
        // System.out.println("read = " + read);

        // 자바에서 키보드 입력 받기
        Scanner scan = new Scanner(System.in); // 입력준비 딱 1회만 하면됨

        // 문자 입력받기
        System.out.print("이름: "); // print or printf 를 사용
        String userName = scan.nextLine();
        System.out.println("userName = " + userName);

        // 정수 입력받기 => 문자를 입력받은 뒤 정수로 변환
        System.out.print("출생년도: ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear= "+birthYear);


    }
}
