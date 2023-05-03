package Ex9;

import java.util.Scanner;

public class Ex9_ex2 {
    public static int sum(int v1, int v2){

        int sum2 = 0;
        for(int i = v1; i <= v2; i++){
                sum2 += i;
        }

        return sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hap = sum(sc.nextInt(),sc.nextInt());

        System.out.println(hap);
    }
}
