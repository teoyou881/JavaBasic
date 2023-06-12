package section12.collection.arraylist;

import section12.collection.Member;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "lee");
        Member memberKim = new Member(102, "kim");
        Member memberDavid = new Member(103, "david");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberDavid);

        memberArrayList.showAll();

        memberArrayList.removeMember(memberKim.getMemberId());


        memberArrayList.showAll();

        memberArrayList.removeMemberByIter(memberLee.getMemberId());
        memberArrayList.showAll();

    }

}
