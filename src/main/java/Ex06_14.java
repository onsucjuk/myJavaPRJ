public class Ex06_14 {
    public static void main(String[] args) {

        int i;
        int j;

        for (i = 2; i <= 9; i++) {

                System.out.printf("%d단 시작합니다.\n",i);

            for (j = 1; j <= 9; j++) {

                System.out.printf(" %d x %d = %d\n",i,j,i * j);

            }

            System.out.printf("%d단 끝났습니다.\n\n",i);

        }
    }
}
