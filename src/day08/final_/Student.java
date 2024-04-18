package day08.final_;

public class Student {

    String name;
    private final String ssn; // 주민번호 => 초기에 정해진 값을 고정
    // 자바의 상수화 final static 같이 사용 , 대문자로 표현
    final static String nation = "대한민국"; // 국적

    // psfi int상수값 , psf
    // public static final int


    // 지역변수에 final 적용하여 내부에서도 변경 불가능하게 함.
    Student(final String ssn){
    //  ssn = "안녕";
        this.ssn = ssn;
    }

}
