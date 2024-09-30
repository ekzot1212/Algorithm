package boj.level13;
/*
Silver II
수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> set = new HashSet<>(list);
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < sortedList.size(); i++) {
            indexMap.put(sortedList.get(i), i);
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(indexMap.get(list.get(i))).append(" ");
        }
        System.out.println(sb);
    }
}