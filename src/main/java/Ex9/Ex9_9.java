package Ex9;

public class Ex9_9 {
    public static void main(String[] args){
        String str1 = "Java programming";
        String str2 = "Java Programming";
        String str3 = new String("Java programming");

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");
        System.out.println("원 문자열3 ==> [" + str3 + "]\n");

        System.out.println("문자열1==문자열2 결과 : \t " + (str1 == str2));
        System.out.println("문자열1.equals(문자열2) 결과 : \t " + str1.equals(str2));
        System.out.println("문자열1==문자열3 결과 :\t " + (str1 == str3));
        System.out.println("문자열1.equals(문자열3) 결과 : \t " + str1.equals(str3));
    }
}
