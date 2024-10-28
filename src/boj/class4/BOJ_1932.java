package boj.class4;

/*
Silver I
        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
 */

/**
 * 재귀로 작성했을때 : 메모리 27268KB, 시간 264ms
 * 반복문으로 작성했을때 : 메모리 27316KB, 시간 240ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932 {

    static int [][] arr;
    static int [][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        dp = new int[N+1][N+1];

        for(int i=1 ; i<=N ; i++){
            int idx = 1;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                arr[i][idx] = Integer.parseInt(st.nextToken());
                idx++;
            }
        }

        dp[1][1] = arr[1][1];
        for(int i=1 ; i<=N ; i++){
            dp[N][i] = arr[N][i];
        }

        System.out.println(find(N));
    }
    static int find(int depth){
        if(depth == 1){
            return dp[1][1];
        }
        // 가장 깊은곳부터 시작

        for(int i=1 ; i<depth ; i++){
            dp[depth-1][i] = Math.max(arr[depth-1][i] + dp[depth][i], arr[depth-1][i] + dp[depth][i+1]);
        }
        return find(depth-1);
    }

}