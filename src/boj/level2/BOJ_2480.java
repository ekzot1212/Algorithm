package boj.level2;


/*
Bronze IV
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
*/

import java.util.Scanner;

public class BOJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;
        int diceNum;

        //3개 동일
        if(a == b && b == c){
            count = 3;
            diceNum = a;
        //2개 동일
        }else if(a == b){
            count = 2;
            diceNum = a;
        }else if(b == c){
            count = 2;
            diceNum = b;
        }else if(a == c){
            count = 2;
            diceNum = a;
        }else{
            if(a > b && a > c){
                diceNum = a;
            }else if(b > a && b > c){
                diceNum = b;
            }else{
                diceNum = c;
            }
        }
        if(count == 3){
            System.out.println(10000 + diceNum*1000);
        }else if(count == 2){
            System.out.println(1000 + diceNum*100);
        }else{
            System.out.println(diceNum*100);
        }
    }
}