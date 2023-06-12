package section12.collection.hashset;

import section12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

//    public boolean removeMember(int memberId) {
//        for (int i = 0; i < hashSet.size(); i++) {
//            Member member = hashSet.get(i);
//            int tempId = member.getMemberId();
//            if (memberId == tempId) {
//                hashSet.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "is not exist");
//        return false;
//    }

    public boolean removeMemberByIter(int memberId) {

        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            //iterator.hasNext()
            //it's like cursor. if there is one more than an element, it will call

            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (memberId == tempId) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "is not exist");
        return false;
    }

    public void showAll() {
        for (Member member :
                hashSet) {
            System.out.println(member);
        }
        System.out.println(hashSet);
    }
}
