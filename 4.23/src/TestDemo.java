public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(12));
        System.out.println(myLinkedList.size());
        myLinkedList.addIndex(0,99);
        myLinkedList.display();
        myLinkedList.addIndex(3,99);
        myLinkedList.display();
        myLinkedList.addIndex(4,99);
        myLinkedList.display();
        myLinkedList.remove(12);
        myLinkedList.display();
        myLinkedList.removeAllKey(99);
        myLinkedList.display();
    }
}
