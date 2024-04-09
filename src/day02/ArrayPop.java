package day02;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60};

        // pop: 배열의 마지막 데이터를 삭제하면서 꺼내옴

        // 1. 기존 사이즈보다 1개 작은 배열을 생성
        int[] temp = new int[numbers.length-1];

        // 2. 원본배열에서 맨 끝인덱스를 제외한 모든 내용 사본에 복사
        for (int i = 0; i <temp.length ; i++) {
            temp[i] = numbers[i];
        }

        // 삭제값 백업 (pop의 특징)
        int removeNumber = numbers[numbers.length-1];

        // 3. 주소값 이전
        numbers = temp;
        temp = null; // 주소값 정리

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("temp: " + Arrays.toString(temp));
        System.out.println("삭제된 값: " + removeNumber);
    }
}
