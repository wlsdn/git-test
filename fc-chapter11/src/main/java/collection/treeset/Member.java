package collection.treeset;

public class Member implements Comparable<Member> {

    private int memberId;
    private String memberName;

    public Member() {}
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            return (this.memberId == member.memberId);
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {
        //여기선 어떻게 비교를 하느냐
        // this하고 넘어온 매개변수(member)를 비교하면 된다.
        //그런데 반환이 어떻게 되냐면
        // this가 더 컸을 때 양수를 반환하게 되면 오름차순으로 정렬하게 된다.
        // 만약 반대로라고 하면 둘을 반대로 써도 되고 아니면 곱하기 -1을 해도 된다.
        // 반대로 하면 내림차순으로 정렬이 된다.
        // 만약에 이름으로 정렬하고 싶다. 그럼 String으로 정렬하면 되고
        // ex) this.memberName.compareTo(member.getMemberName()) 이렇게 된다.
        return (this.memberId - member.memberId);

    }
}
