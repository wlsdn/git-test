package abstractex;

public abstract class Computer {

    // 메소드에 abstract 키워드를 넣으면 추상메소드가 되는데 클래스에 오류가 난다.
    // 무슨 오류냐 클래스도 abstract이 되느냐 아니면 메소드에 바디를 넣어 구현을 하든가
    // 둘 중에 하나해라 라는 오류가 난다.
    // 그럼 클래스에도 abstract을 넣어보자
    public abstract void display(); // 추상 메소드
    public abstract void typing(); // 추상 메소드


    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

}
