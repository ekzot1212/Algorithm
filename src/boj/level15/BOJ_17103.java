package boj.level15;
/*
Silver II
골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다.
짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 1000000;
        int prime[] = new int[max+1];

        for(int i=0 ; i<=max ; i++){
            prime[i] = i;
        }
        prime[1] = 0;
        for(int i=2 ; i<=Math.sqrt(max) ; i++){
            if(prime[i] != 0){
                for(int j=i+i ; j<=max ; j+=i){
                    prime[j] = 0;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= n / 2; j++) {
                if (prime[j] != 0 && prime[n - j] != 0) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
