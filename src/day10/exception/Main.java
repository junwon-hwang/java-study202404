package day10.exception;

public class Main {
    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

        // 함수 제작자와 사용자가 다를 때 throws 예외처리함
        // 주로 라이브러리 개발자 등이 사용
//        try {
//            int n = te.convert("100");
//            System.out.println("n = " + n * 20);
//        } catch (NumberFormatException e) {
//            System.out.println("오류");
//        }

        LoginUser loginUser = new LoginUser("abc1234","1234");

        try {
            loginUser.loginValidate("abc1234","1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력
        }
    }
}
