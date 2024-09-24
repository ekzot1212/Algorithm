package boj.level6;
/*
Bronze I
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.toUpperCase();

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < str.length() ; i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        System.out.println(result(list, str));
    }

    public static String result(List<Character> list, String str){
        List<Integer> cntList = new ArrayList<>();
        for(Character ch : list){
            int count = 0;
            for(int i = 0 ; i < str.length() ; i++){
                if(ch.equals(str.charAt(i))){
                    count++;
                }
            }
            cntList.add(count);
        }
        int max = 0;
        int index = 0;
        for(int i = 0 ; i < cntList.size() ; i ++){
            if(cntList.get(i) > max){
                max = cntList.get(i);
                index = i;
            }
        }
        int count = 0;
        for(Integer i : cntList){
            if(i == max){
                count ++;
            }
        }
        if(count == 1){
            return String.valueOf(list.get(index));
        }
        return "?";
    }
}