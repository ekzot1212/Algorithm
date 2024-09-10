package boj.level1;

/*
Bronze III
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // a 곱하기 b의 일의 자릿수
        System.out.println(a * (b % 10));

        // a 곱하기 b의 십의 자릿수
        System.out.println(a * ((b / 10) % 10));

        // a 곱하기 b의 백의 자릿수
        System.out.println(a * (b / 100));

        // a 곱하기 b
        System.out.println(a*b);
    }
}