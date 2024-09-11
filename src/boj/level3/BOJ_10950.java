package boj.level3;


/*
Bronze V
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int count = sc.nextInt();
        for(int i = 0 ; i != count ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list1.add(a);
            list2.add(b);
        }
        for(int i = 0 ; i != count ; i++){
            System.out.println(list1.get(i) + list2.get(i));
        }
    }
}
