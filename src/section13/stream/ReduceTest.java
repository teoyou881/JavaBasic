package section13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        String[] greetings = {"Hi", "hello", "Good morning", "nice"};

        String reduceTest1 = Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        });

        System.out.println("reduceTest1 = " + reduceTest1);



        String reduceTest2 = Arrays.stream(greetings).reduce( new CompareString()).get();
        System.out.println("reduceTest2 = " + reduceTest2);
    }
}
