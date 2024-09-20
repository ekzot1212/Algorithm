package boj.level4;

/*
Bronze III
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int cnt = 0;
        for(int i=0 ; i<9 ; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        for(int i=0 ; i < list.size() ; i++){
            if(max < list.get(i)){
                max = list.get(i);
                cnt = i+1;
            }
        }
        bw.write(max + "\n" + cnt);
        br.close();
        bw.close();
    }
}