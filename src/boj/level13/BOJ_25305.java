package boj.level13;
/*
Bronze II
2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에
N명의 학생들이 응시했다.

이들 중 점수가 가장 높은
k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.

커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr [] = new int [N];
        st = new StringTokenizer(br.readLine());

        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int j = 0 ; j<N-1 ; j++){
            for(int i=0 ; i<N-1 ; i++){
                int tmp = 0;
                if(arr[i] < arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println(arr[k-1]);
    }
}