package boj.class4;
/*
Silver II
루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
 */

/**
 * dfs 사용해서 루트노드 = 1 이므로 1부터 탐색하면서 parents[n] 에 n의 부모노드를 저장하였음
 * int 2차원 배열로 했을때는 메모리 초과가 떠서
 * ArrayList 이용해서 2차원 배열로 작성했음.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11725_DFS {

    static boolean[] visited;
    static ArrayList<Integer> nodes[];
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        nodes = new ArrayList[N+1];
        visited = new boolean[N+1];
        parents = new int[N+1];

        for(int i=0 ; i<N+1 ; i++){
            nodes[i] = new ArrayList<>();
        }
        for(int i=1 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a].add(b);
            nodes[b].add(a);
        }
        dfs(1);
        for(int i=2 ; i<=N ; i++){
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int i : nodes[node]) {
            if (!visited[i]) {
                parents[i] = node;
                dfs(i);
            }
        }
    }
}
