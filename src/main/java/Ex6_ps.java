public class Ex6_ps {
    public static void main(String[] args) {

        int i;
        int j;

        for (i = 1; i < 10; i++) {

            for (j = 2; j < 10; j++) {

                System.out.printf(" %d x %d = %2d |", j, i, j * i);

            }

            System.out.printf("\n");
        }

    }
}
