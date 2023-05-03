package Ex8;

import java.util.Scanner;
public class Ex8_2ver2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0;

        for (int i = 0; i < aa.length; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ",i+1);
            aa[i] = s.nextInt();

            hap += aa[i];

        }

        System.out.printf(" 합계 ==> %d \n", hap);
    }
}
