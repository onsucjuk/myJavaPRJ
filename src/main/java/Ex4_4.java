public class Ex4_4 {
    public static void main(String[] args) {

        int a = 10, b;

        b = a++;

        System.out.printf("%d \n",b); // 선대입 출력 후 연산 ++

        b = ++a;
        System.out.printf("%d \n",b); // 선++연산 후 대입출력

    }

}
