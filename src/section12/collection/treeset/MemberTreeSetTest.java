package section12.collection.treeset;

import section12.collection.Member;

public class MemberTreeSetTest {


    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(105, "lee");
        Member memberKim = new Member(106, "kim");
        Member memberDavid = new Member(107, "david");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberDavid);
        //class collection.Member cannot be cast to class java.lang.Comparable
        //when we try to add member to TreeSet,
        //error may occur if there is no criteria defined.

        memberTreeSet.showAll();

    }

}
