package boj.level3;

/*
Bronze V
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(;;){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0){
                break;
            }
            list.add(a+b);
        }
        for(Integer res : list){
            System.out.println(res);
        }
    }
}