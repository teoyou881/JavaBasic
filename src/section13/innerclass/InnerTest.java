package section13.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {
        private int inNum = 200;
        private static int sInNum = 100;
        //from java16, static member can be defined or implemented.

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
            System.out.println(inNum);
            System.out.println(sInNum);
        }
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //num+=10; //false
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            //System.out.println(iNum); can't be called.
            System.out.println(sInNum);
        }
    }

    public void usingInTest() {
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInTest();

        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        OutClass.InStaticClass.sTest();
        inStaticClass.inTest();
    }
}
