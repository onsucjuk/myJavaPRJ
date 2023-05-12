package Ex_Inheritance;
public class Cat {
    public static void main(String[] args){

        CatChild1 child = new CatChild1(); // 자식 클래스(CatChild 새끼 고양이)를 만든다.
        CatParent cat = child;
        // 자식 클래스는 부모 클래스를 완전 대체 할 수 있다. [리스코프 치환의 원칙]
        // 자동 변환[Promotion]

        cat.setName("Kitty");
        cat.setAge(3);
        System.out.println("첫 째 고양이의 이름은 "+cat.getName()+"입니다.");
        System.out.println("나이는 " + cat.getAge()+"입니다.");
        cat.likeFood();
        // 자동변환되어서 부모 클래스에 속하더라도 부모 클래스의 메서드를 그대로 상속하여 쓸 수 있고 오버라이딩 되어 있으면
        // 자식클래스의 오버라이딩 항목을 사용

        cat.showKind();
        // super. 명령어를 썼을 때와 kind라는 명령어를 썼을 때의 차이
        // super라면 부모 명령어 실행
        // default(생략)와 this는 오버라이딩되었거나 자식클래스에 있다면 자식 클래스 것 실행

        /*cat.catSound();
        위 메서드는 자식클래스에 오버로딩되어 설정되어 있지만 child는 부모클래스 cat으로 자동변환 되어 있기 때문에
        부모 클래스에 없는 메서드는 실행 할 수 잆다 !! */

    }
}
