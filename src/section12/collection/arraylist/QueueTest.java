package section12.collection.arraylist;


import java.util.ArrayList;

class MyQueue{
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue(){
        int len = arrayQueue.size();

        if (len == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return arrayQueue.remove(0) ;
    }
}
public class QueueTest {
}
