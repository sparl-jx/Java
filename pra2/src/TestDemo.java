public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(11));
        System.out.println(myLinkedList.size());
        myLinkedList.remove(12);
        myLinkedList.display();
        myLinkedList.clear();
        System.out.println("34234324324");
        myLinkedList.display();
    }
}
