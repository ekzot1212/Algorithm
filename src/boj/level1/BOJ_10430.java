package boj.level1;

/*
Bronze V
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class BOJ_10430 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = (A+B)%C;
        System.out.println(result);

        result = ((A%C) + (B%C))%C;
        System.out.println(result);

        result = (A*B)%C;
        System.out.println(result);

        result = ((A%C) * (B%C))%C;
        System.out.println(result);
    }
}