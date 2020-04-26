class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {

    public void addFirst(int data) {
        Node node=new Node(data);
        if(this.head==null) {
            this.head=node;
            return;
        }
        node.next=this.head;
        head=node;
    }
    public Node head;
        public Node reverseList() {
            Node cur=this.head;
            Node prev=null;
            Node newHead=null;
            while(cur!=null) {
                Node curNext=cur.next;
                if(curNext==null) {
                    newHead=cur;
                }
                cur.next=prev;
                prev=cur;
                cur=curNext;
            }
            return newHead;
        }

        public void display1() {
            Node cur=this.head;
            while(cur!=null) {
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }
        public void display2(Node newHead) {
            Node cur=newHead;
            while(cur!=null) {
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }

        public Node middleNode() {
            Node fast=this.head;
            Node slow=this.head;
            while(fast!=null && fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        
}
