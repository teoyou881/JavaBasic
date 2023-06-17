package section13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();

        sList.add("a");
        sList.add("d");
        sList.add("b");
        sList.add("c");

        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.println(s));

    }
}
