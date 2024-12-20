package boj.class3;
/*
Silver III
오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다. 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다. 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.

파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.

N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.
 */

// n-1 + n-5 ?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9461 {

    static Long [] dp = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        dp[1] = dp[2] = dp[3] = 1L; dp[4] = dp[5] = 2L;

        for(int i = 0; i < T; i++) {
            sb.append(find(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);
    }
    static long find(int n){
        if(dp[n] == null){
            dp[n] = find(n-1) + find(n-5);
        }
        return dp[(int) n];
    }
}
