package boj.class4;

/*
Silver I
N×N개의 수가 N×N 크기의 표에 채워져 있다. (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오. (x, y)는 x행 y열을 의미한다.

예를 들어, N = 4이고, 표가 아래와 같이 채워져 있는 경우를 살펴보자.

1	2	3	4
2	3	4	5
3	4	5	6
4	5	6	7
여기서 (2, 2)부터 (3, 4)까지 합을 구하면 3+4+5+4+5+6 = 27이고, (4, 4)부터 (4, 4)까지 합을 구하면 7이다.

표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때, 이를 처리하는 프로그램을 작성하시오.
 */

/**
 * dp를 이용해서 (1,1) 부터 (x,y)까지의 구간합을 계산 후
 * (x1,y1) (x2,y2) 값을 구할 때
 * = (x2,y2) - (x1-1,y2) - (x2,y1-1) + (x1-1,y1-1)
 *
 * 배열 범위 벗어나는걸 방지해서 i == 1 이라는 조건을 걸었는데,
 * [N+1][N+1] 으로 선언했기 때문에 벗어나는경우 dp[0][N]인 경우에
 * 어차피 0 이 더해지기 떄문에 불필요한 조건을 추가 할 필요는 없었음.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] dp = new int[N+1][N+1];

        for(int i=1 ; i<=N ; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=1 ; j<=N ; j++){
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                dp[i][j] = i == 1 ? sum : sum + dp[i-1][j];
            }
        }
        for(int i=1 ; i<=M ; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            if(x1 == 1 && y1 == 1){
                sb.append(dp[x2][y2]).append("\n");
            }else{
                sb.append(dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1]).append("\n");
            }
        }
        System.out.println(sb);

    }
}