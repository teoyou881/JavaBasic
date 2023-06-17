package section13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        //traditional way
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        //lambda
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hello", "java");

        //anonymous class
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        concat2.makeString("hello", "java");
    }
}
