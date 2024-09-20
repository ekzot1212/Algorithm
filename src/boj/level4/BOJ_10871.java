package boj.level4;

/*
Bronze V
정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int targetNum = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for(Integer x : list){
            if(x < targetNum){
                list2.add(x);
            }
        }
        String str = "";

        for(int i = 0 ; i < list2.size() ; i++){
            str += list2.get(i);
            if(i+1 != list2.size()){
                str += " ";
            }
        }
        System.out.println(str);

    }
}