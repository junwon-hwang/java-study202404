package day11.api.lang;

public class Wrapper {


    // 기본값 차이
    private static int number1; // 기본값 0
    private static Integer number2; // 기본값 null

    public Wrapper(int number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {

        // Wrapper type (기본 타입을 객체로 포장함)
        // Byte, Short, Integer, Long, Boolean, Float, Double, Character

        Integer a = 10;

        System.out.println("number1 = " + number1);
        System.out.println("number1 = " + number2);

    }
}
