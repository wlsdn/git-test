package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>(); // 중복 허용 X
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");

        System.out.println(set);

        Iterator<String> ir = set.iterator();
        while(ir.hasNext()) { //hasNext()는 다음 엘리멘트가 있느냐 있으면 가져온다.
            String str = ir.next();
            System.out.println(str);
        }

        ArrayList<String> aSet = new ArrayList<>();
        aSet.add("이순신");
        aSet.add("김유신");
        aSet.add("강감찬");
        aSet.add("이순신");

        System.out.println(aSet);

    }
}
