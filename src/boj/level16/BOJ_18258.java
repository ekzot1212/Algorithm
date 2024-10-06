package boj.level16;
/*
Silver IV
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int lastElement = 0;
        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command){
                case "push" :
                    lastElement = Integer.parseInt(st.nextToken());
                    queue.add(lastElement);
                    break;
                case "pop" :
                    if(!queue.isEmpty()){
                        sb.append(queue.poll() + "\n");
                    }else{
                        sb.append(-1 + "\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size() + "\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                    break;
                case "front" :
                    if(!queue.isEmpty()){
                        sb.append(queue.peek() + "\n");
                    }else{
                        sb.append(-1 + "\n");
                    }
                    break;
                case "back" :
                    if(!queue.isEmpty()){
                        sb.append(lastElement + "\n");
                    }else{
                        sb.append(-1 + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
