package section12.collection.hashmap;

import section12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(101, "lee");
        Member memberKim = new Member(102, "kim");
        Member memberDavid = new Member(103, "david");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberDavid);

        memberHashMap.showAllMember();
        System.out.println("============================");

        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();
        //The order of input and output does not match.
    }

}

