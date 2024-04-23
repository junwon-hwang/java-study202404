package day11.collection.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        // String[] foodList2 = new String[0];
        // StringList foodsList = new StringList();

        List<String> foods = new ArrayList<>();

        foods.add("짜장면");
        foods.add("볶음밥");
        foods.add("짬뽕");
        foods.add("파스타");

        System.out.println(foods);

        // 중간삽입 add(index,E)
        foods.add(1,"짬뽕");

        System.out.println(foods);

        // length
        int size = foods.size();
        System.out.println("size = " + size);

        // 키값 찾기, 없으면 -1
        int i = foods.indexOf("파스타");
        System.out.println("i = " + i);

        // 유무확인
        boolean flag = foods.contains("파스타");
        System.out.println("flag = " + flag);

        // 지우기
        String removeFoods = foods.remove(0);
        foods.remove("파스타");
        System.out.println("removeFoods = " + removeFoods);
        System.out.println("foods = " + foods);

        // 교체
        foods.set(0,"동파육");
        System.out.println("foods = " + foods);
        
        // 인덱스 꺼내오기
        String s = foods.get(1);
        System.out.println("s = " + s);

        // 반목문처리
        for (int j = 0; j <foods.size() ; j++) {
            System.out.println(foods.get(j)+"존마탱!");
        }

        for (String food : foods) {
            System.out.println(food+"JMTs");
        }
        
        // 전체삭제
        foods.clear();
        System.out.println("foods = " + foods);

        // 삭제확인
        System.out.println(foods.isEmpty());

        // 리스트에 초기값 넣고 시작하기

        int[] arr = {10,20,30};

         // List<Integer> numbers = new ArrayList<>();
         List<Integer> numbers = new ArrayList<>(List.of(52,99,20,10,30));
        System.out.println("numbers = " + numbers);


        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);
        
        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);
        
    }
}
