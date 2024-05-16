package abstractex;

public class DeskTop extends Computer {
    /* public class DeskTop extends Computer 이렇게 하면 빨간줄이 난다.
     * 이유는 Computer에 구현되지 않은 애들이 있어서 그렇다. 어떡할래? 라고 빨간줄이 뜬다.
     * 그럼 그냥 구현하면 된다.
     * 근데 만약에 구현하기 싫다 그럼 abstract 클래스가 되야 한다.
     * 하나만 구현해도 abstract 클래스가 되야한다.
     */
    @Override
    public void display() {
        System.out.println("DeskTop display");
    }
    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }
    @Override
    public void turnOff() {
        System.out.println("DeskTop turnOff");
    }
}
