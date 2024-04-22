package day10.sort;

import java.util.Arrays;

public class BubbleSort {
    // 지속적으로 옆에 인덱스와 비교하면서 자리바꾸기를 한다.

    // swap연산 메서드
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void sort(int[]arr){

        // 외부 loop에서는 비교 대상 범위를 지정
        for (int i = arr.length - 1; i > 0 ; i--) {
            // 내부 loop에서는 양옆 데이터들의 크기를 지속 비교
            for (int j = 0; j < i ; j++) {
                // 왼쪽 수가 더 크면 서로 자리를 바꾼다.
                if(arr[j] > arr[j+1]){
                    swap(arr, j , j+1);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] numbers = {33,11,9,100,5788,1,-22};

        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
