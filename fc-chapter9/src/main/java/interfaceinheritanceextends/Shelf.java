package interfaceinheritanceextends;

import java.util.ArrayList;

public class Shelf {

    /* 원래 선반이 있다는 것이다. 선반에 이제 어떤 물건을 넣어 놓을 것인가 하고 했을 때
     * ArrayList로 두고 String타입의 물건들을 다 쓴다. 하위 클래스에서 쓸 수 있게
     * protected로 주자.
     */

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }
    public int getCount() { // 선반에 물건이 몇 개가 있느냐
        return shelf.size();
    }
}
