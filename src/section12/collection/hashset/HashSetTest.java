package section12.collection.hashset;

import java.util.HashSet;

//set interface
//duplication is not allowed
//it's used for unique value or object like ID, employee number
//List is an interface based on order though, Set is not.
//saved order could be different from showing order
//get(i) method is not supported because has no order.
public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        boolean a1 = set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);
        System.out.println("a1 = " + a1);

        boolean a2 = set.add("a");

        System.out.println(set);
        System.out.println("a2 = " + a2);
        //duplication is not allowed.
    }

}
