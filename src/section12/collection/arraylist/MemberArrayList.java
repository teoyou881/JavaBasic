package section12.collection.arraylist;

import section12.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "is not exist");
        return false;
    }

    public boolean removeMemberByIter(int memberId) {

        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            //iterator.hasNext()
            //it's like cursor. if there is one more than an element, it will call

            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "is not exist");
        return false;
    }

    public void showAll() {
        for (Member member :
                arrayList) {
            System.out.println(member);
        }
        System.out.println(arrayList);
    }
}
