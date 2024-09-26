package boj.level9;
/*
Bronze I
어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.

예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.

n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        while(1>0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int sum = 0;
            if(n == -1){
                break;
            }
            List<Integer> list = new ArrayList<>();
            for(int i = 1; i < n ; i++){
                if(n%i == 0){
                    sum += i;
                    list.add(i);
                }
            }
            String s = "";
            if(sum == n){
                s += n + " = ";
                for(int i = 0; i < list.size() ; i++){
                    s += list.get(i);
                    if((i+1) != list.size()){
                        s += " + ";
                    }
                }
            }else{
                s += n + " is NOT perfect.";
            }
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}