package section12.collection.arraylist;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop(){

        int len = arrayStack.size();

        if (len == 0) {
            System.out.println("stack is empty");
            return null;
        }

        return arrayStack.remove(len - 1);

    }

    public String peek(){

        int len = arrayStack.size();

        if (len == 0) {
            System.out.println("stack is empty");
            return null;
        }

        return arrayStack.get(len - 1);

    }
}

public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.pop());
        System.out.println(stack.peek()); // peek() is just show the first element which will be called
        System.out.println(stack.peek());

        System.out.println("======================");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
