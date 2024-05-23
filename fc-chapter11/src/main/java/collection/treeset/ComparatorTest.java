package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
                                                    // 위에 클래스 처럼 만들고 꼭 TreeSet<>() 괄호안에
                                                   // 생성을 해줘야 한다. new MyCompare()
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for (String str : treeSet) {
            System.out.println(str); // 오름차순으로 정렬
            // 근데 난 내림차순으로 하고 싶다. 근데 이미 String이 Comparable이 구현되어 있다.
            // 그럼 위에 클래스를 만들고 한번 봐보자

        }

    }
}
