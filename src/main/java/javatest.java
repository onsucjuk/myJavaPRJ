import java.util.Scanner;

public class javatest {

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        int a = ad.nextInt();

        for (int b = 0; b < a; b++) {

            for (int c = a; c-1 > b; c--) {

                System.out.print(" ");

            }

            for (int d = 0; d <= b; d++) {

                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
