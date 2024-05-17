package interfaceinheritanceextends;

public class BookShelfTest {
    public static void main(String[] args) {

        /* 타입은 Shelg타입으로 해도 되는데 기능적인 거를 우선한다라고 하면
         * 인터페이스 타입으로 많이 한다.
         */
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");

        // 그럼 꺼내 볼까? 순서대로 꺼내도록~ 그런 기능의 책장이니깐~~
        // 들어간 순서대로 그대로 꺼내져 나온다.
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

    }
}
