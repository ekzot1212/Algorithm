package boj.level1;

/*
Bronze V
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        System.out.println(num1 / num2);
    }
}