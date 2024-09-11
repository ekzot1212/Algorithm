package boj.level1;


/*
Bronze V
서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
*/


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BOJ_10699 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(formatter));
    }
}