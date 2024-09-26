package boj.level8;
/*
Bronze I
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다.
이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        while(N >= B){
            list.add((int)N % B);
            N = N / B;
        }
        list.add((int)N);

        String result = "";
        for(int i = list.size()-1 ; i >= 0 ; i--){
            char ch = 'A';
            if(list.get(i) < 10){
                result += list.get(i);
            }else{
                result += (char)(ch + (list.get(i) - 10));
            }
        }
        System.out.println(result);
    }
}