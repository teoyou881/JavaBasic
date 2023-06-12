package section12.collection.treemap;

import section12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberKim = new Member(102, "kim");
        Member memberLee = new Member(101, "lee");
        Member memberDavid = new Member(103, "david");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberDavid);

        memberTreeMap.showAllMember();
        System.out.println("============================");

        memberTreeMap.removeMember(102);
        memberTreeMap.showAllMember();
        //The order of input and output does not match.
    }

}

