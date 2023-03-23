import java.util.Scanner;
public class Javatest {
    public static void main(String[] args) {
        System.out.printf("입력 값 : ");
        Scanner ad = new Scanner(System.in);
        int a = ad.nextInt();

        if (a%3==0 && a%5==0) {
            System.out.printf("출력결과\n");
            System.out.printf("3의 배수와 5의 배수를 둘다 만족합니다. \n");

        } else if(a%3==0) {

            System.out.printf("출력결과\n");
            System.out.printf("3의 배수입니다. \n");

        } else if(a%5==0) {

            System.out.printf("출력결과\n");
            System.out.printf("5의 배수입니다. \n");

        } else {

            System.out.printf("출력결과\n");
            System.out.printf("3의 배수도 5의 배수도 아닙니다. \n");
        }
    }
}


