package boj.level15;
/*
Silver V
정수 B에 0보다 큰 정수인 N을 곱해 정수 A를 만들 수 있다면, A는 B의 배수이다.

예:

10은 5의 배수이다 (5*2 = 10)
10은 10의 배수이다(10*1 = 10)
6은 1의 배수이다(1*6 = 6)
20은 1, 2, 4,5,10,20의 배수이다.
다른 예:

2와 5의 최소공배수는 10이고, 그 이유는 2와 5보다 작은 공배수가 없기 때문이다.
10과 20의 최소공배수는 20이다.
5와 3의 최소공배수는 15이다.
당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        System.out.println(A*B/gcd(A,B));
    }

    public static long gcd(long a, long b) {
        long temp = 0;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}