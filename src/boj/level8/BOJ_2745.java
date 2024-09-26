package boj.level8;
/*
Bronze II
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */


import java.io.IOException;
import java.util.Scanner;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int B = sc.nextInt();
        double result = 0;
        double ratio = 1;

        int arr [] = new int [str.length()];
        for(int i = 0; i<str.length() ; i++){
            if((int)str.charAt(i)-'0' >= 0
                    && (int)str.charAt(i)-'0' <= 9){
                arr[i] = (int)str.charAt(i) -'0';
            }else{
                arr[i] = (int)(str.charAt(i)-'0') - 7;
            }
        }
        for(int i = arr.length-1 ; i >= 0 ; i--){
            result += ratio * arr[i];
            ratio = ratio * B;
        }
        System.out.println(String.format("%.0f", result));
    }
}