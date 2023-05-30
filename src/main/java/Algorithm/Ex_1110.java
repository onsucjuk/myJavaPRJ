package Algorithm;

import java.util.Scanner;

public class Ex_1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newnum = num;
        int count = 0; // 새로운 정수가 생성된 횟수

        while (true) {

            int val1 = newnum / 10; // newnum의 10의 자리수
            int val2 = newnum % 10; // newnum의 1의 자리수

            int num2 = val1 + val2; // newnum의 10의 자리수와 1의 자리수를 더한 값

            newnum = (val2 * 10) + num2%10;
            // 새로운 newnum은 이전 newnum의 1의 자리수가 10의자리수(val2*10)
            // num2의 1의 자리수(num2%10)

            count++;
            //생성 수 ++

            if(num == newnum)
                // 새로 생성된 수가 원래 정수와 같을 때 멈춤
                break;
        }
        System.out.println(count);
        // 수를 생성한 횟수 출력
        sc.close();
    }
}
