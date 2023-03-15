import java.util.*;


public class Hello {

    public static void main(String[] args){

        Scanner ad = new Scanner(System.in);

        int a = ad.nextInt();
        int[] b = new int[a];
        int sum = 0;
        for (int c = 0; c<a ; c++) {

           b[c] = a-c;
           sum += b[c];
        }

        System.out.println(sum);

    }

}
