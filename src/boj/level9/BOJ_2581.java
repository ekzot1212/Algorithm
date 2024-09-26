package boj.level9;
/*
Bronze II
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = M ; i <= N ; i++){
            int cnt = 0;
            if((i%2 == 0 && i != 2)
                    || (i%3 == 0 && i != 3)
                    || (i%5 == 0 && i != 5)
                    || i == 1){
                continue;
            }
            for(int j = 2 ; j <= i/2 ; j++){
                if(i%j == 0){
                    cnt++;
                }
            }
            if(cnt == 0){
                list.add(i);
            }
        }
        int sum = 0;
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            for(Integer i : list){
                sum += i;
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}