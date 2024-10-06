package boj.level16;
/*
Silver IV
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            int option = Integer.parseInt(st.nextToken());
            switch (option){
                case 1 :
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    if(!list.isEmpty()){
                        sb.append(list.get(list.size()-1) + "\n");
                        list.remove(list.size()-1);
                    }else{
                        sb.append(-1 + "\n");
                    }
                    break;
                case 3 :
                    sb.append(list.size() + "\n");
                    break;
                case 4 :
                    if(list.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                    break;
                case 5 :
                    if(list.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(list.get(list.size()-1) + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
