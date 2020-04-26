public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(14);
        myLinkedList.display1();
/*        Node ret=myLinkedList.reverseList();
        myLinkedList.display2(ret);*/
        System.out.println(myLinkedList.middleNode().data);
    }
}

