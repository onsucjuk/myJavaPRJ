import java.util.Scanner;

public class ExR_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a%3==0){
            System.out.printf("3의 배수 입니다.");
        } else {
            System.out.printf("3의 배수가 아닙니다.");
        }
    }
}
