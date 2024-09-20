package boj.level4;

/*
Bronze III
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        Integer min = null;
        Integer max = null;
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0 ; i < N ; i++){
            Integer num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        for(Integer x : list){
            if(min == null || min > x){
                min = x;
            }
            if(max == null || max < x){
                max = x;
            }
        }
        bw.write(min + " " + max);
        br.close();
        bw.close();
    }
}