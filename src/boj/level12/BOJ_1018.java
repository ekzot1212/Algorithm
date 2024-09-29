package boj.level12;
/*
Silver IV
지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
 */


import java.util.Scanner;

public class BOJ_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean arr [][] = new boolean[N][M];
        for(int i = 0 ; i<N ; i++){
            String s = sc.next();
            for(int j = 0 ; j<M ; j++){
                arr[i][j] = s.charAt(j) == 'B';
            }
        }
        int minCnt = 64;
        for(int i = 0 ; i<= N-8 ; i++){
            for(int x = 0 ; x<= M-8 ; x++){
                for(int n = 0 ; n < 2 ; n++){
                    int cnt = 0;
                    boolean before = n == 0 ? true : false;
                    for(int j = 0; j <8 ; j++){
                        for(int k =0 ; k<8 ; k++){
                            if(before == arr[j+i][k+x]){
                                cnt++;
                                before = !before;
                            }else{
                                before = arr[j+i][k+x];
                            }
                        }
                        before = !before;
                    }
                    minCnt = Math.min(cnt,minCnt);
                }
            }
        }
        System.out.println(minCnt);
    }
}