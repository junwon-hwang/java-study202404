package day11.api.time;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        // 자바 8이전
        Date date = new Date();
        System.out.println("date = " + date.getYear());

        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.YEAR);

        // 자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate.getYear());

        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("nowTime = " + nowTime);

        // 특정 날짜 정보 생성하기
        LocalDate targetDate = LocalDate.of(2022, 4, 15);
        System.out.println("targetDate = " + targetDate);

        // 날짜 연산
        // 도서 대여시스템에서 빌린날짜로부터 3일뒤가 반납일

        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(50);
        System.out.println("returnDate = " + returnDate);

        LocalDate targetDateTime = returnDate
                .plusYears(2)
                .plusMonths(3)
                .plusDays(5);
        System.out.println("targetDateTime = " + targetDateTime);

        // 사이날짜 구하기
        LocalDate hireDate = LocalDate.of(2018, 3, 6);
        LocalDate retireDate = LocalDate.of(2022, 12, 27);

        long between = ChronoUnit.DAYS.between(hireDate,retireDate);
        System.out.println("between = " + between);
        
        // 날짜 포맷 바꾸기
        System.out.println("nowTime = " + nowTime);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yy년 M월 dd일 a hh시 mm분");
        String dateString = nowTime.format(pattern);
        System.out.println("dateString = " + dateString);
    }
}
