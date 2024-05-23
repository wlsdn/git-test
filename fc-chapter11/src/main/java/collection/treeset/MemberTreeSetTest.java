package collection.treeset;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member(300, "Lee");
        Member memberKim = new Member(100, "Kim");
        Member memberPark = new Member(200, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);

        manager.showAll(); // 이렇게 실행하면 오류가 난다. 무슨 오류냐면 comparable하지 않다는 것이다.
        // 그럼 Member클래스로 가서 implements Comparable<Member>를 하고 compareTo라는 메소드를
        // 구현하라고 뜬다. 만들고 실행하면 memberId로 오름차순으로 잘 정렬돼서 나온다.
    }
}
