package boj.level14;
/*
Silver IV
자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다.
이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.
두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.

예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<N ; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int cnt = set.size();
        for(int i=0 ; i<M ; i++){
            int num = Integer.parseInt(st.nextToken());
            cnt++;
            if(set.contains(num)){
                cnt -= 2;
            }
        }
        System.out.println(cnt);
    }
}