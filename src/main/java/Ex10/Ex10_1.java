package Ex10;

public class Ex10_1 {
    public static void main(String[] args){
        int[] aa = new int[3];
        try { // 오류가 발생하면 break를 걸고 바로 chatch로 감
            aa[2] = 100/0;
            aa[3] = 100;
/*        } catch (ArrayIndexOutOfBoundsException e) { // 배열 크기 초과 오류
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류 메세지 : " + e);
        } catch (ArithmeticException e) { // 0으로 나누어 생긴 오류
            System.out.println("0으로 나누는 등의 오류에요 ~~");
            System.out.println("오류 메세지 : " + e);*/
        } catch (Exception e) { // 여러 오류 catch를 쓸 때 가장 마지막에 위치
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요.");
            // Exception 은 모든 자바의 오류의 조상(부모 클래스)
            System.out.println("오류 메세지 : "+ e);
        } finally { // try구문이든 catch구문이든 끝나고 무조건 출력 필수는 아님
            System.out.println("이 부분 항상 작성 할 필요는 없지만 왠만하면 써줘요. 정상 작동하든 오류가 나든 무조건 실행해야 하는 구문을 써요.");
        }
    }
}
