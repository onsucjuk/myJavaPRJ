package Ex7;
public class Practice2 {
    public static void main(String[] args) {

        int j = 1; //가로로 출력 ex) 2x1 3x1 .. 9x1에서 매 줄 마다 고정 값 1~9

        for ( int i = 2 ; j <= 9 && i <= 9; i++) {  // 가로로 출력 2x1 3x1 .. 9x1에서 한줄 마다 증가하는 i 2~9

            if (i < 9) {

                System.out.printf("%d X %d = %2d ", i, j, i * j); // i=2~9, j=1~9(줄 출력 후 ++),i * j 결과 값

            }

            if (i == 9) { // i가 9가되면 한 줄 끝 초기화 필요
                System.out.printf("%d X %d = %2d\n", i, j, i * j); // 한 줄 끝났으니 줄 바꿈 추가
                j++;
                i = 1; // i의 초기 값은 2지만 출력 후 i++ 받으므로 1을 지정해야 2가 됨
            }

        }
    }
}
