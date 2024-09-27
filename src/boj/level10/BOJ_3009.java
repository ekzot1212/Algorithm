package boj.level10;
/*
Bronze III
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1= sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println(find(x1,x2,x3) + " " + find(y1,y2,y3));
    }
    public static int find(int n1, int n2, int n3){
        int n = 0;
        if(n1 == n2){
            n = n3;
        }else if(n1 == n3){
            n = n2;
        }else{
            n = n1;
        }
        return n;
    }
}