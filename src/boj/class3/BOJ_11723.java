package boj.class3;
/*
Silver V
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
all: S를 {1, 2, ..., 20} 으로 바꾼다.
empty: S를 공집합으로 바꾼다.

// 나는 Set 을 이용했지만 boolean 배열로 카운팅소트처럼 작성하면 시간이 더 빠르다
// 나 : 2244ms , 배열 : 1000ms 정도
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num = 0;
            if( !cmd.equals("all") && !cmd.equals("empty")){
                num = Integer.parseInt(st.nextToken());
            }
            switch (cmd){
                case "add" :
                    set.add(num);
                    break;
                case "remove" :
                    set.remove(num);
                    break;
                case "check" :
                    sb.append(set.contains(num) ? 1 : 0).append("\n");
                    break;
                case "toggle" :
                    if(!set.remove(num)){
                        set.add(num);
                    }
                    break;
                case "all" :
                    set = new TreeSet<>();
                    for(int j=1 ; j<=20 ; j++){
                        set.add(j);
                    }
                    break;
                case "empty" :
                    set = new TreeSet<>();
                    break;
            }
        }
        System.out.println(sb);
    }
}