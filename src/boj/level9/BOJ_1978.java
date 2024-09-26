package boj.level9;
/*
Bronze II
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for(int i = 0 ; i < N ; i++){
            int x = sc.nextInt();
            int cnt2 = 1;
            for(int j = 2 ; j <= x/2 ; j++){
                if(x%j == 0){
                    cnt2++;
                }
            }
            if(cnt2 == 1){
                cnt++;
            }
            if(x == 1){
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}