package boj.level15;
/*
Silver IV
직선으로 되어있는 도로의 한 편에 가로수가 임의의 간격으로 심어져있다. KOI 시에서는 가로수들이 모두 같은 간격이 되도록 가로수를 추가로 심는 사업을 추진하고 있다.
KOI 시에서는 예산문제로 가능한 한 가장 적은 수의 나무를 심고 싶다.

편의상 가로수의 위치는 기준점으로 부터 떨어져 있는 거리로 표현되며, 가로수의 위치는 모두 양의 정수이다.

예를 들어, 가로수가 (1, 3, 7, 13)의 위치에 있다면 (5, 9, 11)의 위치에 가로수를 더 심으면 모든 가로수들의 간격이 같게 된다.
또한, 가로수가 (2, 6, 12, 18)에 있다면 (4, 8, 10, 14, 16)에 가로수를 더 심어야 한다.

심어져 있는 가로수의 위치가 주어질 때, 모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수를 구하는 프로그램을 작성하라.
 단, 추가되는 나무는 기존의 나무들 사이에만 심을 수 있다.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long gcd = 0;
        long prev = 0;
        List<Long> list = new ArrayList<>();
        for(int i=0 ; i<N ; i++){
            long num = Long.parseLong(br.readLine());
            if(i != 0){
                if(gcd == 0){
                    gcd = num-prev;
                }else{
                    gcd = gcd(gcd,num-prev);
                }
            }
            prev = num;
            list.add(num);
        }
        long result = (list.get(list.size()-1) - list.get(0))/gcd +1 - list.size();
        System.out.println(result);
    }

    public static long gcd(long a, long b) {
        long temp = 0;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}