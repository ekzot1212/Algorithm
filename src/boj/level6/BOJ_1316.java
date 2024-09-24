package boj.level6;
/*
Silver V
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;


        for(int i = 0 ; i < N ; i++){
            String str = sc.next();
            List<Character> list = new ArrayList<>();
            Character ch = null;
            boolean bool = true;

            for(int j = 0 ; j < str.length() ; j++){
                if(ch == null || str.charAt(j) != ch){
                    if(list.contains(str.charAt(j))){
                        bool = false;
                    }
                    list.add(str.charAt(j));
                    ch = str.charAt(j);
                }
            }
            if(bool){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}