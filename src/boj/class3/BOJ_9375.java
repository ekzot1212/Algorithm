package boj.class3;
/*
Silver III
해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다.
예를 들어 오늘 해빈이가 안경, 코트, 상의, 신발을 입었다면, 다음날은 바지를 추가로 입거나 안경대신 렌즈를 착용하거나 해야한다.
해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 며칠동안 밖에 돌아다닐 수 있을까?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_9375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()); // 의상의 수
            Map<String, Integer> map = new HashMap<>();

            for(int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int count : map.values()) {
                result *= (count + 1);
            }
            result -= 1;
            System.out.println(result);
        }
    }
}
