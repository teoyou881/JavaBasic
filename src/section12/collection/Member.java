package section12.collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public Member() {

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

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }


    //equals and hashCode are override for HashSet.
    //unless it is override, even member having same id will be added to Member.
    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member m = (Member) o;
            if (this.memberId == m.memberId) {
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }


    //don't have to implement both.
    //usually use Comparable.
    //when using comparator, default Member constructor in TreeSet is needed.

    @Override
    public int compareTo(Member m) {

        return (this.memberId-m.memberId);
    }

    @Override
    public int compare(Member o1, Member o2) {
        return (o1.memberId-o2.memberId);
    }


}
