package boj.level5;

/*
Bronze II
알파벳 소문자로만 이루어진 단어 S가 주어진다.
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            int num = count(str, ch);
            System.out.print(num + " ");
        }

    }

    public static int count(String str, char ch){
        for(int i = 0 ; i < str.length() ; i++){
            if(ch == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}