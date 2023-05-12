package Ex_Inheritance;

public class CatParent {
    private String name;
    public String kind = "Persian Cat";
    private int age;

    public CatParent(){};
    public CatParent(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void likeFood(){
        System.out.println(getName()+"는 참치츄르를 좋아합니다.");
    }

    public void showKind(){
        System.out.println(getName()+"는 kind : " + kind + "입니다.");
    }
}
