package boj.level13;
/*
Silver V
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i=0 ; i<N ; i++){
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (e1, e2) -> {
            if(e1.length() == e2.length()){
                return e1.compareTo(e2);
            }else{
                return e1.length() - e2.length();
            }
        });
        for(String s : list){
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }
}