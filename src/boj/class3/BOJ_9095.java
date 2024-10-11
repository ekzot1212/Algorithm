package boj.class3;
/*
Silver III
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */

/**
 * 재귀로 풀기
 * 1. 규칙 찾기
 * 2. 큰 것부터 작은 것으로 코드 생각해야됨
 * 3. dp 활용하는지, 어떤 배열들을 쓸지
 * 4. 메서드는 최대한 잘게
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095 {

    static int[] arr;
    static Integer[] dp = new Integer[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i=0; i<N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i : arr){
            sb.append(find(i)).append("\n");
        }
        System.out.println(sb);

    }

    static int find(int num) {
        if(dp[num] == null){
            dp[num] = find(num-1) + find(num-2) + find(num-3);
        }
        return dp[num];
    }
}