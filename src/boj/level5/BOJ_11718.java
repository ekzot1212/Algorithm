package boj.level5;

/*
Bronze III
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BOJ_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextLine());
        }
        for(String s : list){
            System.out.println(s);
        }
    }
}