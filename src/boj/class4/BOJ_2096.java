package boj.class4;

/*
Gold V
문제
문제
N줄에 0 이상 9 이하의 숫자가 세 개씩 적혀 있다. 내려가기 게임을 하고 있는데, 이 게임은 첫 줄에서 시작해서 마지막 줄에서 끝나게 되는 놀이이다.

먼저 처음에 적혀 있는 세 개의 숫자 중에서 하나를 골라서 시작하게 된다. 그리고 다음 줄로 내려가는데, 다음 줄로 내려갈 때에는 다음과 같은 제약 조건이 있다. 바로 아래의 수로 넘어가거나, 아니면 바로 아래의 수와 붙어 있는 수로만 이동할 수 있다는 것이다. 이 제약 조건을 그림으로 나타내어 보면 다음과 같다.



별표는 현재 위치이고, 그 아랫 줄의 파란 동그라미는 원룡이가 다음 줄로 내려갈 수 있는 위치이며, 빨간 가위표는 원룡이가 내려갈 수 없는 위치가 된다. 숫자표가 주어져 있을 때, 얻을 수 있는 최대 점수, 최소 점수를 구하는 프로그램을 작성하시오. 점수는 원룡이가 위치한 곳의 수의 합이다.

입력
첫째 줄에 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 숫자가 세 개씩 주어진다. 숫자는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 중의 하나가 된다.
 */

/**
 * 메모리 제한이 적기 때문에 최소한의 배열만 사용해여 작성했음
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2096 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[][] maxDp = new int[2][3];
        int[][] minDp = new int[2][3];

        for(int i=1; i<=N ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            maxDp[1][0] = Math.max(maxDp[0][0], maxDp[0][1]) + a;
            maxDp[1][1] = Math.max(Math.max(maxDp[0][0], maxDp[0][1]), maxDp[0][2]) + b;
            maxDp[1][2] = Math.max(maxDp[0][1], maxDp[0][2]) + c;

            minDp[1][0] = Math.min(minDp[0][0] , minDp[0][1]) + a;
            minDp[1][1] = Math.min(Math.min(minDp[0][0], minDp[0][1]), minDp[0][2]) + b;
            minDp[1][2] = Math.min(minDp[0][1] , minDp[0][2]) + c;

            for (int j = 0; j < 3; j++) {
                maxDp[0][j] = maxDp[1][j];
                minDp[0][j] = minDp[1][j];
            }
        }
        System.out.println(
                Math.max(Math.max(maxDp[0][0] , maxDp[0][1]), maxDp[0][2]) + " " +
                        Math.min(Math.min(minDp[0][0], minDp[0][1]), minDp[0][2])
        );
    }
}