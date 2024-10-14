package boj.class3;
/*
Silver II
세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.

그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.

괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
 */

// 첫번째 마이너스를 기준으로 앞쪽은 모두 합하고 뒷쪽은 모두 빼면 됨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] numbers = str.split("-");
        int result = sum(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            result -= sum(numbers[i]);
        }

        System.out.println(result);
    }

    private static int sum(String s) {
        String[] numbers = s.split("\\+");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
