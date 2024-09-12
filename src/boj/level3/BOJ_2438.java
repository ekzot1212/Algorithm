package boj.level3;

/*
Bronze V
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
*/


import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "";
        for(int i = 0 ; i < N ; i ++){
            str += "*";
            System.out.println(str);
        }
    }
}