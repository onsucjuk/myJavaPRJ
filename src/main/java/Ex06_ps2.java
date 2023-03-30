public class Ex06_ps2 {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;

        while (j < 10) {

            if (j < 10) {

                System.out.printf(" %d x %d = %d ", j, i, j * i);

                if (i < 9) {

                    i++;

                } else {

                    i = 1;
                    ++j;
                    System.out.printf("\n");

                }
            }

        }

    }
}
