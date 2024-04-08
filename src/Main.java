//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        System.out.println(10+5);
        System.out.println("안뇽");

        int month = 5;
        int day = 5;
        String anni = "어린이날";

        System.out.println(month+"월 "+day+"일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %S입니다.\n" , month,day,anni);
        System.out.printf("%d월 %d일은 %S입니다.\n" , month,day,anni);

        // 한줄 주석 System.out.printf("%d월 %d일은 %S입니다.\n" , month,day,anni);

        /*
        여러줄 주석
        System.out.printf("%d월 %d일은 %S입니다.\n" , month,day,anni);
        System.out.printf("%d월 %d일은 %S입니다.\n" , month,day,anni);

         */

        /*
        & -> 단축평가를 실행하지 않음 ( A & B ) -> A,B둘가 평가 , 에러 발생
        && -> 단축평가를 실행함 ( A && B ) -> A 평가 후 false면 false 반환
        */
    }

}

