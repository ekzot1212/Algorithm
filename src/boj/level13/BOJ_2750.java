package boj.level13;
/*
Bronze II
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */


import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr [] = new int [N];
        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int j = 0 ; j<N-1 ; j++){
            for(int i=0 ; i<N-1 ; i++){
                int tmp = 0;
                if(arr[i] > arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        for(int i : arr){
            bw.write(i + "\n");
        }
        bw.flush();
    }
}