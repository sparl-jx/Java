class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data=data;
    }
}
public class MyLinkedList {
    public Node head;   //标志双向链表的头
    public Node tail;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //打印链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    //查找是否包含key
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //求长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //删除key
    public int remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if (cur == this.head) {
                    this.head = this.head.next;
                    head.next.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur=cur.next;
        }
        return -1;
    }

    //清除
    public void clear() {
while(this.head!=null) {
    Node cur=this.head.next;
    this.head.prev=null;
    this.head.next=null;
    this.head=cur;
}
this.tail=null;
    }
}
