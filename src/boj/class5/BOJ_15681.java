package boj.class5;

/*
Gold V
문제
간선에 가중치와 방향성이 없는 임의의 루트 있는 트리가 주어졌을 때, 아래의 쿼리에 답해보도록 하자.

정점 U를 루트로 하는 서브트리에 속한 정점의 수를 출력한다.
만약 이 문제를 해결하는 데에 어려움이 있다면, 하단의 힌트에 첨부한 문서를 참고하자.

입력
트리의 정점의 수 N과 루트의 번호 R, 쿼리의 수 Q가 주어진다. (2 ≤ N ≤ 105, 1 ≤ R ≤ N, 1 ≤ Q ≤ 105)

이어 N-1줄에 걸쳐, U V의 형태로 트리에 속한 간선의 정보가 주어진다. (1 ≤ U, V ≤ N, U ≠ V)

이는 U와 V를 양 끝점으로 하는 간선이 트리에 속함을 의미한다.

이어 Q줄에 걸쳐, 문제에 설명한 U가 하나씩 주어진다. (1 ≤ U ≤ N)

입력으로 주어지는 트리는 항상 올바른 트리임이 보장된다. */

/**
 * 쿼리마다 서브 트리를 탐색한다면 제한 시간이 초과될 수 있으므로
 * 입력된 루트노드를 기준으로 dfs 탐색하면서
 * dp[N]에 N을 루트로 하는 서브 트리에 속한 정점의 수를 저장하였음.
 *
 * int[N][N] 배열 대신 ArrayList[N] 배열을 사용해서 불 필요한 메모리 사용을 줄였다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_15681 {
    static List<Integer> [] tree;
    static boolean [] visited;
    static int dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        tree = new ArrayList[N+1];
        dp = new int[N+1];

        for(int i=1; i<N+1 ; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i=1 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            tree[U].add(V);
            tree[V].add(U);
        }

        dfs(R);

        for(int i=0 ; i<Q ; i++){
            int q = Integer.parseInt(br.readLine());
            sb.append(dp[q]).append("\n");
        }

        System.out.println(sb);

    }
    static void dfs(int node){
        visited[node] = true;
        dp[node] = 1;

        for(Integer i : tree[node]){
            if(!visited[i]){
                dfs(i);
                dp[node] += dp[i];
            }
        }
    }
}
