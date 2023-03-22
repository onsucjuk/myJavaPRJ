import java.util.*;
public class Ex5_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // new : 메모리에 자바 파일을 올린다는 의미
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if(a%2==0){
            System.out.printf("짝수를 입력했군요..\n");
        } else {
            System.out.printf("홀수를 입력했군요..\n");
        }

    }
}
