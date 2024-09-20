package boj.level5;

/*
Bronze V
단어
$S$와 정수
$i$가 주어졌을 때,
$S$의
$i$번째 글자를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(S.charAt(i-1));
    }
}