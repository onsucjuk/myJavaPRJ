public class Main {

    public static void main(String[] args) {

        int j = 2;

        for (int i = 1; j<=9 && i<=9 ; i++) {

            if (i == 1) {
                System.out.printf("%d단 시작합니다.\n", j);
            }

            System.out.printf("%d x %d = %d | ", j, i, j*i);

            if (i==9) {

                System.out.printf("\n%d단 끝났습니다.\n\n",j);

                i = 0;
                j++;

            }

        }

    }
}

