package section12.collection.hashset;

import section12.collection.Member;

public class MemberHashSetTest {


    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(101, "lee");
        Member memberKim = new Member(102, "kim");
        Member memberDavid = new Member(103, "david");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberDavid);

        memberHashSet.showAll();
        //The order of input and output does not match.
    }

}
