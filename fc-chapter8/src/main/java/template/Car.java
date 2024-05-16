package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    // public abstract void washCar(); 이렇게 하면 나머지 클래스들에서 오류가난다.
    // 무슨 오류냐 abstract washCar를 구현하라는 오류이다.
    // 그리고 모든 차는 꼭 시동을 끄면 세차를 해야 하지 하는 건 아니잖아?
    // 그래서 abstract을 빼고 Car클래스에서 구현하면 된다.
    public void washCar() {}
    /* washCar()는 어떤 일을 하느냐
     * 이런 메서드를 훅 메서드라고 한다. 자바용어는 아님
     * 아무기능이 없으니깐 여기서는 하는 일은 없고
     * 하위 클래스가 재정의하면 기능이 추가되는 그런 메서드이다.
     * 그리고 이런 메서드는 구현에 확장을 할 수가 있는 그런 메서드이다.
     * 만약 반드시 모든 차가 세차를 해야 한다! 그럼 abstract으로 하면 된다.
     */
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
