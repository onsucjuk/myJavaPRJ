package Quiz;

public class StaticPRC {
    public static void main(String[] args) {

        System.out.print(StaticPRC.check(1));
    }
        static String check(int num){
            return (num >= 0) ? "positive" : "negative";
        }
    // 객체 생성 없이 쓰기 위해서는 ststic(메모리에 올린다.)
}
