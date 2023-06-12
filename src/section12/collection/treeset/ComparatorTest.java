package section12.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompare implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * (-1); //내림차순으로
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>(new MyCompare());

        tree.add("a");
        tree.add("b");
        tree.add("c");

        System.out.println("tree = " + tree);
    }
}
