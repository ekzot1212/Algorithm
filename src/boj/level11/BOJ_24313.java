package boj.level11;
/*
Silver V
오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

알고리즘의 소요 시간을 나타내는 O-표기법(빅-오)을 다음과 같이 정의하자.

O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}

이 정의는 실제 O-표기법(https://en.wikipedia.org/wiki/Big_O_notation)과 다를 수 있다.

함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.
 */


import java.util.Scanner;

public class BOJ_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        // 2 2 0 1
        if((a0*n + a1) <= c*n && c >= a0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}