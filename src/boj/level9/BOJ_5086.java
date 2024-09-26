package boj.level9;
/*
Bronze III
4 × 3 = 12이다.

이 식을 통해 다음과 같은 사실을 알 수 있다.

3은 12의 약수이고, 12는 3의 배수이다.

4도 12의 약수이고, 12는 4의 배수이다.

두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.

1.첫 번째 숫자가 두 번째 숫자의 약수이다.
2.첫 번째 숫자가 두 번째 숫자의 배수이다.
3.첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(1>0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x == 0 && y == 0){
                break;
            }
            String s = "neither";
            if(y % x == 0){
                s = "factor";
            }else if(x % y == 0){
                s = "multiple";
            }
            bw.write(s + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}