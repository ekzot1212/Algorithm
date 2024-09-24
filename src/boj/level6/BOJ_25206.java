package boj.level6;
/*
Silver V
인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

A+	4.5
A0	4.0
B+	3.5
B0	3.0
C+	2.5
C0	2.0
D+	1.5
D0	1.0
F	0.0
P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

과연 치훈이는 무사히 졸업할 수 있을까?
 */

import java.util.Scanner;

public class BOJ_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        String grades[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double score[]  = {4.5 , 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0, 0};
        double totalRatio = 0;
        for(int i = 0 ; i < 20 ; i++) {
            String title = sc.next();
            double ratio = sc.nextDouble();
            String grade = sc.next();
            int index = -1;
            if(grade.equals("P")){
                continue;
            }
            for(int j = 0; j < 10 ; j++){
                if(grades[j].equals(grade)){
                    index = j;
                }
            }
            sum += ratio * score[index];
            totalRatio += ratio;
        }
        System.out.println(sum/totalRatio);
    }
}