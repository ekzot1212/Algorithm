package boj.class3;
/*
Silver IV
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int cnt = 0;

        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=arr.length-1 ; i>=0 ; i--){
            int coin = arr[i];
            if(K >= coin){
                cnt += K / coin;
                K %= coin;
            }
        }
        System.out.println(cnt);
    }
}