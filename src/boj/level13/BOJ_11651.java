package boj.level13;
/*
Silver V
2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (e1,e2) -> {
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            }else{
                return e1[1] - e2[1];
            }
        });

        for(int i=0 ; i<N ; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        System.out.println(sb);
    }
}