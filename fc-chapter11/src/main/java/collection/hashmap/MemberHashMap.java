package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap; //키는 회원번호 value는 Member로 한다.
    public MemberHashMap() {
        hashMap = new HashMap<>();
    }
    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }
    public boolean removeMember(int memberId) {
        if( hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println("회원 번호가 없습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }

}
