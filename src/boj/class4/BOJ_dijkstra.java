package boj.class4;

/*
Gold V
문제
N개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 M개의 버스가 있다. 우리는 A번째 도시에서 B번째 도시까지 가는데 드는 버스 비용을 최소화 시키려고 한다. A번째 도시에서 B번째 도시까지 가는데 드는 최소비용을 출력하여라. 도시의 번호는 1부터 N까지이다.

입력
첫째 줄에 도시의 개수 N(1 ≤ N ≤ 1,000)이 주어지고 둘째 줄에는 버스의 개수 M(1 ≤ M ≤ 100,000)이 주어진다. 그리고 셋째 줄부터 M+2줄까지 다음과 같은 버스의 정보가 주어진다. 먼저 처음에는 그 버스의 출발 도시의 번호가 주어진다. 그리고 그 다음에는 도착지의 도시 번호가 주어지고 또 그 버스 비용이 주어진다. 버스 비용은 0보다 크거나 같고, 100,000보다 작은 정수이다.

그리고 M+3째 줄에는 우리가 구하고자 하는 구간 출발점의 도시번호와 도착점의 도시번호가 주어진다. 출발점에서 도착점을 갈 수 있는 경우만 입력으로 주어진다.
 */

/**
 * 처음엔 bus 객체 만들어서 dfs로 구현
 * -> 시간 초과로 틀림 (도시 1000개 노선 100,000개라서 모두 탐색하는 dfs는 효율이 떨어짐)
 *
 * 다익스트라 알고리즘으로 풀이
 * -> n번 도시까지 가는 최소의 비용 경우의 수만 다음 도시를 가는 버스 탐색 (싼 경로를 먼저 해야 이후 중복 방문을 안할 수 있음)
 *  -> 1에서 이동할 수 있는 도시의 비용들 중에서 가장 싼 비용의 도시를 가면, 그 도시를 가는 더 싼 비용은 존재하지 않으므로 방문 처리.
 *
 *  dfs : O(N^M)
 *  다익스트라 : O((N+M) * log N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Bus implements Comparable<Bus> {
    int city, cost;

    public Bus(int city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    @Override
    public int compareTo(Bus other) {
        return this.cost - other.cost;
    }
}

public class BOJ_dijkstra {

    static ArrayList<Bus>[] buses;
    static int[] minCost;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        buses = new ArrayList[N + 1];
        minCost = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            buses[i] = new ArrayList<>();
        }

        Arrays.fill(minCost, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            buses[a].add(new Bus(b, cost));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijkstra(start);

        System.out.println(minCost[end]);
    }

    static void dijkstra(int start) {
        PriorityQueue<Bus> pq = new PriorityQueue<>();
        pq.add(new Bus(start, 0));
        minCost[start] = 0;

        while (!pq.isEmpty()) {
            Bus current = pq.poll();
            int curCity = current.city;

            if (visited[curCity]) continue;
            visited[curCity] = true;

            for (Bus bus : buses[curCity]) {
                if (minCost[bus.city] > minCost[curCity] + bus.cost) {
                    minCost[bus.city] = minCost[curCity] + bus.cost;
                    pq.add(new Bus(bus.city, minCost[bus.city]));
                }
            }
        }
    }
}