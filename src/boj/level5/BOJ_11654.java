package boj.level5;

/*
Bronze V
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println((int)str.charAt(0));
    }
}