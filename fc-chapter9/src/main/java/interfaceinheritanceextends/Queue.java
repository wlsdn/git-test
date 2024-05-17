package interfaceinheritanceextends;

public interface Queue {
    void enQueue(String title); //enQueue는 집어넣는 메소드이다.
    String deQueue();

    int getSize();  // 여기 몇 개가 들어있냐 Queue안에 반환해주는
}
