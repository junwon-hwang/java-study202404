package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열에서 원하는 위치의 값 삭제하기
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2;

        // 중간값 삭제 알고리즘
        for (int i = targetIndex; i <numbers.length ; i++) {
            numbers[i] = numbers[i+1];
        }

        // pop 알고리즘
        int[] temp = new int[numbers.length-1]; // 배열 생성

        for (int i = 0; i <temp.length; i++) { // 배열 복사
            temp[i]=numbers[i];
        }

        numbers = temp;  // 주소값 수
        temp = null;


        System.out.println(Arrays.toString(numbers));
    }
}
