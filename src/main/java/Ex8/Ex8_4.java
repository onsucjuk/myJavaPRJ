package Ex8;

public class Ex8_4 {
    public static void main(String[] args) {
        int aa[] = { 100, 200, 300, 400};
        int bb[] = new int[] { 100, 200 , 300};

        int cc[];
        cc = new int[] { 100, 200};

        int [] dd= new int[1];
        dd[0] = 100;

        int i;

        System.out.printf("aa 몇 개 ? : %d\n",aa.length);
        for (i = 0; i < aa.length; i++) {
            System.out.printf("aa[%d]==>%d\t", i, aa[i]);
         } System.out.printf("\n");

        System.out.printf("bb 몇 개 ? : %d\n",bb.length);
        for (i = 0; i < bb.length; i++) {
            System.out.printf("bb[%d]==>%d\t", i, bb[i]);
        } System.out.printf("\n");


        System.out.printf("cc 몇 개 ? : %d\n",cc.length);
        for (i = 0; i < cc.length; i++) {
            System.out.printf("cc[%d]==>%d\t", i, cc[i]);
        } System.out.printf("\n");

        System.out.printf("dd 몇 개 ? : %d\n",dd.length);
        for (i = 0; i < dd.length; i++) {
            System.out.printf("dd[%d]==>%d\t", i, dd[i]);
        } System.out.printf("\n");
        }
}
