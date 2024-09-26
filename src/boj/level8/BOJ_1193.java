package boj.level8;
/*
Silver V
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class BOJ_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();
        long cnt = 1;
        boolean b = false;
        while(X > cnt){
            X -= cnt;
            cnt ++;
            b = !b;
        }
        String s = b ? ("" + X + "/" + (cnt-X+1)) : ("" + (cnt-X+1) + "/" + X);
        System.out.println(s);
    }
}