package Ex9;

public class Ex9_4 {
    public static void main(String[] args){
        String str = "Java를 공부하는 중, Java는 재미있어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java")); // "Java"글자가 처음 나오는 위치 출력

        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java")); // "Java"글자가 마지막 나오는 위치 출력

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("java")); // 존재하지 않으면? (-1 출력)
    }
}
