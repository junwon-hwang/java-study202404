package day07.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");

//        myCar.model = "페라리 488";  &접근 못하게 하기

        myCar.startStop();
//        myCar.injectGasoline(); & 사용 불가 private
//        myCar.start = false;  &접근 못하게 하기
       // 속도 0~200KM로 제한 , speed를 private로 잠그고 함수를 통해서 제한을 줌
       // setter 메서드로 속도 제한
       // getter 메서드로 속도 확인
        myCar.setSpeed(150);

        System.out.println("현재 속도: "+myCar.getSpeed() + "km/h");

        // 변속모드를 설정
        myCar.setMode('D');
        System.out.println("현재 변속 모드: "+ myCar.getMode());

    }
}
