package boj.level3;

/*
Bronze IV
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
    *
   **
  ***
 ****
*****
*/


import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i ++){
            String str = "";
            for(int j = 1 ; j < N-i ; j++){
                str += " ";
            }
            for(int k = 0 ; k <= i ; k ++){
                str += "*";
            }
            System.out.println(str);
        }
    }
}