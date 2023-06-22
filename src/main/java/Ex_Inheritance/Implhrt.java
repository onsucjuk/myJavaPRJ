package Ex_Inheritance;

public class Implhrt {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent c2 = new Child();


        int resP = p.cal(5,10);
        int resC = c.cal(5,10);
        int resC2 = c2.cal(5,10);

        System.out.println("부모 클래스의 계산 결과 : " + resP);
        System.out.println("자식 클래스의 계산 결과 : " + resC);
        System.out.println("부모 생성자 자식 계산 결과 : " + resC2);
    }
}
