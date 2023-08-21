package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        if(n==1) {
            int dvn1 = sc.nextInt();
            res = dvn1 * dvn1;
        } else if(n == 2) {
            int dvn1 = sc.nextInt();
            int dvn2 = sc.nextInt();
            res = dvn1 * dvn2;
        } else if(n > 2) {

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            res = arr[0] * arr[n-1];
        }

        System.out.println(res);
    }
}
