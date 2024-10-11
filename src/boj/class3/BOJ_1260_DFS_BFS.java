package boj.class3;
/*
Silver II
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
더 이상 방문할 수 있는 점이 없는 경우 종료한다.
정점 번호는 1번부터 N번까지이다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260_DFS_BFS {

    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[][] nodes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        nodes = new int[N+1][N+1];

        for(int i=1 ; i<=M ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a][b] = nodes[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");

        visited = new boolean[N+1];
        bfs(V, nodes, visited);

        System.out.println(sb);
    }

    static void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(" ");

        for (int i = 1; i < nodes.length; i++) {
            if (nodes[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start, int[][] nodes, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");
            for (int i = 1; i < nodes[node].length; i++) {
                if(nodes[node][i] == 0){
                    continue;
                }
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}