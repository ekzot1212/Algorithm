package boj.class4;
/*
Silver II
정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.

2를 곱한다.
1을 수의 가장 오른쪽에 추가한다.
A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16953 {
    static Integer result = null;
    static long A,B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        find(A,1);
        System.out.println(result == null ? -1 : result);
    }

    static void find(long num, int cnt) {
        if(num == B){
            result = result == null ? cnt : Math.min(result,cnt);
            return;
        }
        if(num < B){
            find(num*2, cnt +1);
            String s = num + "1";
            find(Long.parseLong(s), cnt+1);
        }
    }
}