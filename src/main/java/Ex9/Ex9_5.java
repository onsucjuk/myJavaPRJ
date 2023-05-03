package Ex9;

import java.util.Scanner;

public class Ex9_5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str, strRep, strRep2, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep = str.replace(" ","$");
        strRep2 = str.replaceAll("\\s", "\\$"); // "\\s" = 공백
        strSub = str.substring(2,8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 ==> "+str);
        System.out.println("바뀐 문자열 ==> "+strRep);
        System.out.println("바뀐 문자열2 ==> "+strRep2);
        System.out.println("일부 문자열 ==> "+strSub);

        for(int i = 0; i <  strAry.length; i++){
            System.out.println("분리한 문자열" + i +"==> " + strAry[i]);
        }
    }
}
