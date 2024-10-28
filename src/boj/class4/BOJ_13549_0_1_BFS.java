package boj.class4;

/*
Gold V
문제
수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다. 수빈이는 걷거나 순간이동을 할 수 있다. 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 0초 후에 2*X의 위치로 이동하게 된다.

수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
 */

/**
 * 다익스트라 or 0-1 BFS 로 풀 수 있지만 성능이 더 좋은
 * 0-1 BFS로 작성
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_13549_0_1_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N >= K) {
            System.out.println(N - K);
            return;
        }

        int[] time = new int[100001];
        Arrays.fill(time, Integer.MAX_VALUE);
        Deque<Integer> deque = new ArrayDeque<>();

        time[N] = 0;
        deque.add(N);

        while (!deque.isEmpty()) {
            int current = deque.poll();

            if (current == K) {
                System.out.println(time[current]);
                return;
            }
            int teleport = current * 2;
            if (teleport <= 100000 && time[teleport] > time[current]) {
                time[teleport] = time[current];
                deque.addFirst(teleport);
            }
            int forward = current + 1;
            if (forward <= 100000 && time[forward] > time[current] + 1) {
                time[forward] = time[current] + 1;
                deque.addLast(forward);
            }
            int backward = current - 1;
            if (backward >= 0 && time[backward] > time[current] + 1) {
                time[backward] = time[current] + 1;
                deque.addLast(backward);
            }
        }
    }
}