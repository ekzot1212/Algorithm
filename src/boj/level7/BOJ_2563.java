package boj.level7;
/*
Silver V
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
 */


import java.io.IOException;
import java.util.Scanner;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean arr [][] = new boolean[100][100];
        int total = 0;
        int N = sc.nextInt();

        for(int i = 0 ; i < N ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = y ; j < y+10 ; j++){
                if(j > 100){
                    break;
                }
                for(int k = x ; k < x+10 ; k++){
                    if(k > 100){
                        break;
                    }
                    arr[j][k] = true;
                }
            }
        }
        for(int j = 0 ; j < 100 ; j++){
            for(int k = 0 ; k < 100 ; k++){
                if(arr[j][k]){
                    total ++;
                }
            }
        }
        System.out.println(total);
    }
}