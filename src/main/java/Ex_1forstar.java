public class Ex_1forstar {
    public static void main(String[] args) {

        int i = 0;

        for (int j = 1; j<=5;) {

            if (i<j) {

                System.out.print("*");
                i++;

            } else {

                i = 0;
                j++;
                System.out.println("");

            }

        }

    }
}
