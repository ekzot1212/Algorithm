package boj.class3;
/*
Silver III
라그랑주는 1770년에 모든 자연수는 넷 혹은 그 이하의 제곱수의 합으로 표현할 수 있다고 증명하였다.
어떤 자연수는 복수의 방법으로 표현된다. 예를 들면, 26은 52과 12의 합이다; 또한 42 + 32 + 12으로 표현할 수도 있다.
역사적으로 암산의 명수들에게 공통적으로 주어지는 문제가 바로 자연수를 넷 혹은 그 이하의 제곱수 합으로 나타내라는 것이었다.
1900년대 초반에 한 암산가가 15663 = 1252 + 62 + 12 + 12라는 해를 구하는데 8초가 걸렸다는 보고가 있다.
좀 더 어려운 문제에 대해서는 56초가 걸렸다: 11339 = 1052 + 152 + 82 + 52.

자연수 n이 주어질 때, n을 최소 개수의 제곱수 합으로 표현하는 컴퓨터 프로그램을 작성하시오.
 */

/**
 * Dp 사용할 때 dp[0]에서 dp[1]이 되려면 이전의 값에 어떤 값이
 *  추가되는지 생각하면 좋음
 *  ex) 3을 만드는 최소의 갯수 = 3
 *      4를 만드는 갯수 = 3을 만드는갯수 +1 (최대로 많은 경우)
 *
 *      dp[i - (j*j)] -> 이 dp[0] dp[1] dp[2]... -> dp[0]인 경우 제곱수일 것임
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1];
            for(int j = 1; j * j <= i; j++) {
                //저장된 값과 비교, i = 5 이라면,
                // i-(j*j) = 4 이므로 dp[4] 의 갯수가 1 이기때문에 dp[5]는 1+1이 됨.
                dp[i] = Math.min(dp[i], dp[i - (j * j)]);
            }
            dp[i]++;
        }
        System.out.println(dp[n]);
    }
}
