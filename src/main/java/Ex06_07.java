public class Ex06_07 {
    public static void main(String[] args) {

        int sum = 0; // sum 변수 선언 후 = (저장해라)를 통해 sum에 0 값을 메모리 저장.
        int i; // int i 변수만 선언 메모리 저장 x

        for (i = 1; i <= 10; i++) {

            sum += i;

        }

        System.out.printf(" 1에서 10까지의 합 : %d \n", sum);

    }
}
