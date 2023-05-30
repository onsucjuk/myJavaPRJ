package Ex11;

public class Car1 {
    private int speed;
    private String color;
    Car1(){};
    Car1(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    public void setSpeed(int val){
        this.speed = val;
    }
    public void setColor(String val){
        this.color = val;
    }

    public int getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }

    public void upSpeed(int val){
        this.speed = speed + val;
    }
    public void downSpeed(int val){
        this.speed = speed - val;
    }
}
