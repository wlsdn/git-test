package interfaceinheritanceextends;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) { //enQueue는 어디에 집어 넣을 거냐면 선반에 집어 넣으면 된다.
        shelf.add(title);
    }

    /* 책 한권이 빠져 나갈 것이다. 근데 그거는 get이 아니고 책장에서 없어지는 것이다.
     * 그런데 Queue형식에서 Dequeue는 맨 앞에 게 없어진다. 맨 앞에 거를 반환해주는 것이다.
     * remove메소드 중에 String을 반환해주는 메소드를 쓰면 된다. 맨 앞에 꺼니깐 0번째
     */
    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {  // Shelf의 getCount()
        return getCount();
    }
}
