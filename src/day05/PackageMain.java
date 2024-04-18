package day05;

// 다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기 위해 사용
//import day05.juice.Apple;
//import day05.juice.Banana;
//import day05.juice.Peach;
import day05.juice.*;

import java.util.Scanner;

public class PackageMain {

    public static void main(String[] args) {

        // 두 개 동시에 같은 생성자를 부를 때는 어쩔 수 없이 무조건 풀네임 사용
        day05.fruit.Apple a1 =new day05.fruit.Apple();
        day05.juice.Apple a2=new day05.juice.Apple();

        // 클래스 파일이 1개여도 다른 패키지에 있으면 무조건 import or 풀네임 해야 됨
        new Banana();
        new Peach();

        Scanner scanner = new Scanner((System.in));

    }
}
