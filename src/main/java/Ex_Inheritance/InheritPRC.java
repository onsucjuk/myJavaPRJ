package Ex_Inheritance;

class A {
    public void fn() {
        System.out.println("부모 호출 : A");
    }
}

class B extends A {
    public void fn() {
        super.fn();
        System.out.println("자식 호출 : B");
    }
        }
public class InheritPRC {
    public static void main(String[] args) {
        A a = new B();
        a.fn();
    }
}
