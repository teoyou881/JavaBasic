package section13.lambda;

public class TestMyNumber {

    public static void main(String[] args) {
        MyNumber maxNum = (x,y) -> (x>=y) ? x:y;
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println("max = " + max);

        //Java is an object-oriented language, which means that in order to use a method, an instance must be created.
        //Internally, an anonymous class is created and used.
        MyNumber ex = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                return (num1 >= num2)? num1:num2;
            }
        };
        System.out.println(ex.getMaxNumber(1,3));

    }
}
