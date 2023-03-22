public class Ex5_2 {
    public static void main(String[] args){

        int a = 200;

        if (a < 100) { // 두 줄 이상 실행시 {}'중괄호'로 if식 기재
            System.out.printf("100보다 작군요..\n"); // if문 바로 아랫줄만 조건 판단
            System.out.printf("거짓이므로 이 문장은 안보이겠죠?\n");
        }
        System.out.printf("프로그램 끝! \n");
    }
}
