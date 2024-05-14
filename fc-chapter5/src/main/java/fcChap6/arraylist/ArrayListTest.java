package fcChap6.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        /* 자바 유틸이라는 패키지 밑에 ArrayList라는 클래스가 있다.
         * 자바 유틸 패키지 밑에 여러가지 사용하기 편리한 여러 라이브러리가 제공되고 있다.
         */
        ArrayList<String> list = new ArrayList<String>();
        /* ArrayList 밑에 노란줄이 나온 이유는 ArrayList를 사용할 때 어떤 객체를 쓸 것이냐를
         * ArrayList옆에 이렇게 <> 해주고 <> 안에 String을 쓰겠다 라고 하면 String을 쓰면 노란줄이
         * 없어진다.
         * 노란줄이 있을 때는 뭐를 쓸 수 있냐면 아무거나 다 쓸 수가 있다. 그래서 뭐,,,
         * String, Integer 쓰고 등등 쓸 수 있는데 나중에 다시 요소를 꺼내 올때는 형변환을 해야 한다.
         */
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0; i < list.size(); ++i) {
            String str = list.get(i); // 꺼내올 땐 get() 몇 번째 놈을 꺼내와라 get(i)
            System.out.println(str);
        }

        System.out.println();

        for(String s : list) {
            System.out.println(s);
        }

    }
}
