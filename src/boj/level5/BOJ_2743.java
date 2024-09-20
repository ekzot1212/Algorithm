package boj.level5;

/*
Bronze V
알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(S.length());
    }
}