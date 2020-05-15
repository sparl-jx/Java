import java.util.LinkedList;
import java.util.Queue;

public class TestDemo {
    public static void main(String[] args) {
        MyQueue myqueue=new MyQueue();
        myqueue.offer(1);
        myqueue.offer(2);
        myqueue.offer(3);
        myqueue.offer(4);
        System.out.println(myqueue.peek());
        System.out.println(myqueue.poll());
        System.out.println(myqueue.peek());

    }

    public static void main1(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());//拿队头元素不删除
    }
}
