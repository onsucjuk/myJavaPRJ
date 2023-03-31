public class Ex_1forstar2 {
    public static void main(String[] args) {

        int i ;
        int j = 1;

        for (i = 0 ; i<j; i++ ) {

            System.out.print("*");


            if (i==j-1 && j<=5) {

                i = 0;
                j++;

                System.out.println();

            }

        }
    }
}
