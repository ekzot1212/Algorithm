package boj.class3;
/*
Silver III
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
         arr = new int[N+1];
        arr[0] = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num + arr[i-1];
        }
        for(int i=0 ; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(find(start, end)).append("\n");
        }
        System.out.println(sb);
    }
    static int find(int s, int e){
        return arr[e]-arr[s-1];
    }
}
