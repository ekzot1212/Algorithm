package boj.level13;
/*
Silver V
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];

        String N = br.readLine();

        for(int i = 0; i < N.length(); i++) {
            arr[N.charAt(i)-'0']++;
        }
        for(int i = arr.length-1; i >= 0; i--) {
            for(int j = 0 ; j < arr[i]; j++){
            sb.append(i);
            }
        }
        System.out.print(sb);
    }
}