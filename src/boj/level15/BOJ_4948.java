package boj.level15;
/*
Silver II
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int prime[] = new int[246913];


        for(int i=0 ; i<=prime.length-1 ; i++){
            prime[i] = i;
        }
        prime[1] = 0;
        for(int i=2 ; i<=Math.sqrt(prime.length) ; i++){
            if(prime[i] != 0){
                for(int j=i+i ; j<=prime.length-1 ; j+=i){
                    prime[j] = 0;
                }
            }
        }

        while(true){
            int n = Integer.parseInt(br.readLine());
            int primeCount = 0;
            if(n == 0){
                break;
            }
            for(int i=n+1 ; i<=n*2 ; i++){
                if(prime[i] != 0){
                    primeCount++;
                }
            }
            sb.append(primeCount + "\n");
        }
        System.out.println(sb);
    }
}