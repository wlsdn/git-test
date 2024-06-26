package collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);
        myList.add(1, "D");
        System.out.println(myList);
        myList.removeLast(); // 맨 뒤에꺼 삭제
        System.out.println(myList);

        for(int i = 0; i < myList.size(); ++i) {
            String str = myList.get(i);
            System.out.println(str);
        }

    }
}
