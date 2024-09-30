package boj.level13;
/*
Bronze I
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())] ++;
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr[i]; j++){
                sb.append((i)).append('\n');
            }
        }
        System.out.print(sb);
    }
}