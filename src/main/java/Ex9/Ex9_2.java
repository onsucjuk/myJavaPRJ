package Ex9;

import java.util.Scanner;

public class Ex9_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");


        System.out.println(str.replaceAll("o", "q"));
        // 문자 바꾸기 아래 for문과 같다.

        /*        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i)=='o')
                System.out.printf("%c",'$');
            else
                System.out.printf("%c", str.charAt(i));
        }*/
    }
}
