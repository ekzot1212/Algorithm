package boj.class3;
/*
Silver II
널리 잘 알려진 자료구조 중 최소 힙이 있다. 최소 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.

배열에 자연수 x를 넣는다.
배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
프로그램은 처음에 비어있는 배열에서 시작하게 된다.
 */

// PriorityQueue는 힙 정렬 기반임


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                sb.append(queue.isEmpty() ? 0 : queue.poll()).append("\n");
            }else{
                queue.add(n);
            }
        }
        System.out.println(sb);
    }
}
