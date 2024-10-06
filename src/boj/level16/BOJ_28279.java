package boj.level16;
/*
Silver IV
정수를 저장하는 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여덟 가지이다.

1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=1 ; i<=N ; i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if(cmd == 1){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if(cmd == 2){
                deque.addLast(Integer.parseInt(st.nextToken()));
            }else if(cmd == 3){
                sb.append(deque.isEmpty() ? -1 : deque.poll()).append("\n");
            }else if(cmd == 4){
                sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
            }else if(cmd == 5){
                sb.append(deque.size()).append("\n");
            }else if(cmd == 6){
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            }else if(cmd == 7){
                sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
            }else if(cmd == 8){
                sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
