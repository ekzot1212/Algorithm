package boj.class3;
/*
Silver III
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {

    static Integer arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new Integer[Math.max(N + 1, 3)];
        arr[1] = 1;
        arr[2] = 2;

        System.out.println(find(N));
    }
    static int find(int n){
        if(arr[n] == null){
            arr[n] = (find(n-1) + find(n-2)) % 10007;
        }
        return arr[n];
    }
}
