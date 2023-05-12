package Ex_Inheritance;

public class CatChild1 extends CatParent {

    String kind = "Semi Persian Cat"; // 교배종

    @Override
    public void likeFood() {
        System.out.println("아직 어려서 우유를 더 좋아해요.");
    }

    @Override
    public void showKind() {

        System.out.println(getName()+"는 kind : " + kind + "입니다.");
        System.out.println(getName()+"는 this.kind : " + this.kind + "입니다.");
        System.out.println(getName()+"는 super.kind : " + super.kind + "입니다.");

    }

    public void catSound() { // 자식클래스인 CatChild에만 존재
        System.out.println("meow");
    }
}
