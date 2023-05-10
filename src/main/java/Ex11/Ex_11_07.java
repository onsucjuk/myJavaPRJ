package Ex11;
class Car2 {
    private String color; // Car2에서만 사용 가능
    private int speed; // Car2에서만 사용 가능

/*    Car2() { // 메모리에 올릴 때 자동생성되는 생성자인 Car2() = Car2(){ }

    }*/
    Car2(String color, int speed) {
        // 새로운 생성자 정의 기본 생성자인 Car2()를 더 나아가서
        // Car2(String color, int speed)와 같이 파라미터(color와 speed)를 입력하는
        // Car2(String color, int speed) 생성자로 생성 [Car2의 오버로딩]
        this.color = color;
        this.speed = speed;
    }

    public String getColor() { // public으로 선언해서 private color을 GetColor라는 메서드를 선언해서 color를 리턴한다.
        return color;
    }
    public int getSpeed() { // public으로 선언해서 private speed 을 GetSpeed라는 메서드를 선언해서 speed를 리턴한다.
        return speed;
    }

}
public class Ex_11_07 {
    public static void main(String[] args){

        Car2 myCar1 = new Car2("빨강", 0);
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");
    }
}
