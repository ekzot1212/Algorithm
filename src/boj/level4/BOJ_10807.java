package boj.level4;

/*
Bronze V
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int targetNum = sc.nextInt();
        int count = 0;
        for(Integer num : list){
            if(num == targetNum){
                count++;
            }
        }
        System.out.println(count);

    }
}