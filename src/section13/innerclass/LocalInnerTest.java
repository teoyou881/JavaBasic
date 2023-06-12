package section13.innerclass;

class Outer{

    int outNum = 100;
    static int sNum=200;


    /*anonymous class can implements only one abstract class or interface */

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable");
        }
    };

    public Runnable getRunnable() {

        int localNum=100; //effectively final
        /*class MyRunnable implements Runnable {

            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }
        return new MyRunnable();*/

        //change above code to anonymous class
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        };

    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable().run();
        outer.runnable.run();
    }
}
