package boj.level9;
/*
Bronze I
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 2;
        while(N != 1){
            if(N%num == 0){
                N /= num;
                System.out.println(num);
            }else{
                num++;
            }
        }
    }
}