package boj.class2;
/*
Bronze III
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int arr[] = new int[3];

            for(int i=0; i<3 ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }

            Arrays.sort(arr);

            String s = Math.pow(arr[2], 2) == Math.pow(arr[0],2) + Math.pow(arr[1],2) ?
                    "right" : "wrong";
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}