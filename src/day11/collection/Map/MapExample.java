package day11.collection.Map;

import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

        // Key값은 보통 String
        Map<String,Object>map = new HashMap<>();
        /*
          {
                "지갑잔액" : 500,
                "종아하는 자동차" : {},
                "오늘 저녁 메뉴" : "계란볶음밥"
          }
        */

        // 데이터 추가 : put();
        map.put("지갑잔액",500);
        map.put("좋아하는 자동차",new Mustang());
        map.put("오늘 저녁 메뉴","계란볶음밥");

        System.out.println("map = " + map);
        
        // get(Key)
        int money =(int) map.get("지갑잔액");
        System.out.println("money = " + money);

        // 중복된 키값을 저장하면 값이 수정된다.
        map.put("지갑잔액",999999);
        System.out.println("map = " + map);
        
        // map의 반복문 처리
        for (String s : map.keySet()) {
            System.out.println("map.get(s) = " + map.get(s));
        }
    }
}
