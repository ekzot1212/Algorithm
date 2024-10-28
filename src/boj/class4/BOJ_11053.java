package boj.class4;
/*
Silver II
수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
 */

/**
 * dp[n]에 현재값과 이전 값들(n-1,n-2....) +1 보다 큰 값을 비교해서 저장
 * 처음에 max = -1로 초기화했었는데, N=1개 일때 -1이 출력되어서 틀렸음.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11053 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        int max = 1;
        for(int i=1 ; i<N ; i++){
            for(int j=0 ; j<i ; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[j] +1, dp[i]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
