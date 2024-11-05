package boj.class5;

/*
Gold V
문제
2차원 평면상에 N(3 ≤ N ≤ 10,000)개의 점으로 이루어진 다각형이 있다. 이 다각형의 면적을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. 다음 N개의 줄에는 다각형을 이루는 순서대로 N개의 점의 x, y좌표가 주어진다. 좌표값은 절댓값이 100,000을 넘지 않는 정수이다.
 */

/**
 * 좌표값이 최대 100,000 이므로 100,000 * 100,000 인 경우에
 * int 자료형으로는 오버플로우가 발생한다 -> long 으로 수정
 *
 * 소수점 출력방법
 *  System.out.println(Math.round(Math.abs(sum / 2) * 10) / 10.0); -> 틀림
 *  System.out.printf("%.1f", Math.abs(sum / 2)); -> 맞음
 *  왜 round 는 틀리고 printf 로 한 건 맞는지 반례를 못찾겠음..
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        long [][] arr = new long[N][2];
        double sum = 0;

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        for(int i=1 ; i<N ; i++){
            sum += arr[i-1][0] * arr[i][1] - arr[i-1][1] * arr[i][0];
        }

        sum += arr[N - 1][0] * arr[0][1] - arr[N - 1][1] * arr[0][0];

        System.out.printf("%.1f", Math.abs(sum / 2));
    }
}
