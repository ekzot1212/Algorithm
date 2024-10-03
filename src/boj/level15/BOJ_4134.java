package boj.level15;
/*
Silver IV
정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0 ; i<N ; i++){
            long num = Long.parseLong(br.readLine());
            sb.append(findNextPrime(num) + "\n");
        }
        System.out.println(sb);
    }

    public static boolean isPrime(long num){
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(long i=3 ; i*i <= num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static long findNextPrime(long num){
        if(num <= 2) return 2;
        if(num % 2 == 0) num++;
        while(!isPrime(num)){
            num += 2;
        }
        return num;
    }
}