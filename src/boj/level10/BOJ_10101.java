package boj.level10;
/*
Bronze IV
창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.

삼각형의 세 각을 입력받은 다음,

세 각의 크기가 모두 60이면, Equilateral
세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
세 각의 합이 180이 아닌 경우에는 Error
를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String s = "";
        if(a+b+c != 180){
            s += "Error";
        }else if(a == 60 && b == 60 && c == 60){
            s += "Equilateral";
        }else if(a == b || a == c || b == c){
            s += "Isosceles";
        }else{
            s += "Scalene";
        }
        System.out.println(s);
    }
}