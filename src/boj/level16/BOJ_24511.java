package boj.level16;
/*
Silver III
첫째 줄에 queuestack을 구성하는 자료구조의 개수
$N$이 주어진다. (
$1 \leq N \leq 100\,000$)

둘째 줄에 길이
$N$의 수열
$A$가 주어진다.
$i$번 자료구조가 큐라면
$A_i = 0$, 스택이라면
$A_i = 1$이다.

셋째 줄에 길이
$N$의 수열
$B$가 주어진다.
$B_i$는
$i$번 자료구조에 들어 있는 원소이다. (
$1 \leq B_i \leq 1\,000\,000\,000$)

넷째 줄에 삽입할 수열의 길이
$M$이 주어진다. (
$1 \leq M \leq 100\,000$)

다섯째 줄에 queuestack에 삽입할 원소를 담고 있는 길이
$M$의 수열
$C$가 주어진다. (
$1 \leq C_i \leq 1\,000\,000\,000$)

입력으로 주어지는 모든 수는 정수이다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N ; i++){
            int num = Integer.parseInt(st.nextToken());
            if(arr[i] == 0){
                deque.add(num);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0 ; i<M ; i++){
            deque.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(deque.pollLast() + " ");
        }
        System.out.println(sb);

    }
}