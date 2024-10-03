package boj.level15;
/*
Silver III
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean isPrime[] = new boolean[N+1];
        for(int i=2 ; i<=N ; i++){
            isPrime[i] = true;
        }
        for(int i=2 ; i<=Math.sqrt(N) ; i++){
            if(isPrime[i]){
                for(int j=i+i ; j<=N ; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=M ; i<=N ; i++){
            if(isPrime[i]){
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}