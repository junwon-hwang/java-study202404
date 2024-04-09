package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍이","야옹이","짹짹이"};
      //  String[] petsCopy = pets; // 배열의 주소값 복사

      // 새로운 방을 만들고 반복문을 통하여 복사해줘야함
        String[] petsCopy = new String[pets.length];
        for(int i=0; i<pets.length; i++){
            petsCopy[i] = pets[i];
        }

        pets[1] = "냥냥이"; // 복사 후 원본 수정

        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));

    }
}
