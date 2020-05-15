class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
      public Node head;//头
      public Node tail;//尾
    public int usedSize;

    public void offer(int data) {
        Node node=new Node(data);
        if(this.tail==null) {
           this.head=node;
           this.head=node;
        } else {
            this.tail.next=node;
            this.tail=node;
        }
        tail=node;
        this.usedSize++;
    }

    //出队且删除对头元素
    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("空队列");
        }
        int data=this.head.data;
        this.head=this.head.next;
        return data;
    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("空队列");
        }
        return this.head.data;
    }

    public boolean isEmpty() {
        return this.usedSize==0;
    }

    public int size() {
        return this.usedSize;
    }
}
