package boj.class5;

/*
Gold IV
문제
스도쿠는 매우 간단한 숫자 퍼즐이다. 9×9 크기의 보드가 있을 때, 각 행과 각 열, 그리고 9개의 3×3 크기의 보드에 1부터 9까지의 숫자가 중복 없이 나타나도록 보드를 채우면 된다. 예를 들어 다음을 보자.

위 그림은 참 잘도 스도쿠 퍼즐을 푼 경우이다. 각 행에 1부터 9까지의 숫자가 중복 없이 나오고, 각 열에 1부터 9까지의 숫자가 중복 없이 나오고, 각 3×3짜리 사각형(9개이며, 위에서 색깔로 표시되었다)에 1부터 9까지의 숫자가 중복 없이 나오기 때문이다.
하다 만 스도쿠 퍼즐이 주어졌을 때, 마저 끝내는 프로그램을 작성하시오.

입력
9개의 줄에 9개의 숫자로 보드가 입력된다. 아직 숫자가 채워지지 않은 칸에는 0이 주어진다.
*/

/**
 * 백트래킹을 이용해서 안되는 숫자인 경우에 다시 빈칸으로
 * 문자를 숫자로 파싱할때는 Character.getNumericValue 사용해야 함.
 *
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2239 {
    static int [][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        for(int i=0 ; i<9 ; i++){
            String s = br.readLine();
            for(int j=0 ; j<9 ; j++){
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }

        solve();

        for(int i=0 ; i<9; i++){
            for(int j=0 ; j<9 ; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static boolean solve(){
        int [] blank = findBlank();
        if(blank == null){
            return true;
        }

        int row = blank[0];
        int col = blank[1];

        for(int i=1 ; i<10 ; i++){
            if(isValid(row, col, i)){
                arr[row][col] = i;
                if(solve()){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }
    static int[] findBlank(){
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(arr[i][j] == 0){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    static boolean isValid(int row, int col, int num){
        for(int i=0; i<9; i++){
            if(arr[row][i] == num || arr[i][col] == num){
                return false;
            }
        }
        row /= 3;
        col /= 3;
        row *= 3;
        col *= 3;

        for(int i=row ; i<row+3 ; i++){
            for(int j=col ; j<col+3 ; j++){
                if(arr[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
