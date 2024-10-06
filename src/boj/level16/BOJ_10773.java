package boj.level16;
/*
Silver IV
나코더 기장 재민이는 동아리 회식을 준비하기 위해서 장부를 관리하는 중이다.

재현이는 재민이를 도와서 돈을 관리하는 중인데, 애석하게도 항상 정신없는 재현이는 돈을 실수로 잘못 부르는 사고를 치기 일쑤였다.

재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.

재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 재민이를 도와주자!
 */

//다음에 스택문제를 풀 때는 Stack<Integer> s = new Stack<>(); 을 사용해 보기!
// pop 메서드 : 마지막 요소 꺼내기 (마지막 요소를 삭제하면서 요소를 반환함)
// push 메서드 : 스택에 요소를 추가

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0 ; i<N ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                sum -= list.get(list.size()-1);
                list.remove(list.size()-1);
            }else{
                list.add(num);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
