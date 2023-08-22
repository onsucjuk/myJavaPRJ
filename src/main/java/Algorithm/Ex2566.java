package Algorithm;

import java.util.Scanner;

public class Ex2566 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        int n1 = 0;
        int n2 = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
                if(arr[n1][n2] < arr[i][j]){
                    n1 = i;
                    n2 = j;
                }
            }
        }

        System.out.println(arr[n1][n2]);
        System.out.println((n1+1) + " " + (n2+1));
    }
}
