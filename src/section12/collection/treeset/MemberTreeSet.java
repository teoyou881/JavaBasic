package section12.collection.treeset;

import section12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

//    public boolean removeMember(int memberId) {
//        for (int i = 0; i < treeSet.size(); i++) {
//            Member member = treeSet.get(i);
//            int tempId = member.getMemberId();
//            if (memberId == tempId) {
//                treeSet.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "is not exist");
//        return false;
//    }

    public boolean removeMemberByIter(int memberId) {

        Iterator<Member> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            //iterator.hasNext()
            //it's like cursor. if there is one more than an element, it will call

            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (memberId == tempId) {
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "is not exist");
        return false;
    }

    public void showAll() {
        for (Member member :
                treeSet) {
            System.out.println(member);
        }
        System.out.println(treeSet);
    }
}
