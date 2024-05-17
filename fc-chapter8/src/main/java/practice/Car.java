package practice;

public abstract class Car {

    public abstract void start();
    public abstract void drive();
    public abstract void stop();

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void run() {
        start();
        drive();
        stop();
        turnOff();
    }

}
