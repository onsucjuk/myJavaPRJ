package Ex11;

public class MakeCar {
    public static void main(String[] args){
        Car1 car1 = new Car1();
        car1.setColor("빨강");
        car1.setSpeed(10);

        Car1 car2 = new Car1("파랑",20);

        System.out.print("차1의 색깔은 "+car1.getColor()+"이다. ");
        System.out.print("현재 속도는 "+car1.getSpeed()+"km 이다. ");
        car1.upSpeed(20);
        System.out.print("20km 속도를 올린 후는 "+car1.getSpeed()+"km 이다. ");
        car1.downSpeed(10);
        System.out.println("10km 속도를 내린 후의 속도는 "+car1.getSpeed()+"km 이다.");

    }
}
