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
            myLinkedList.remove(99);
            myLinkedList.display();
            myLinkedList.addFirst(10);
            myLinkedList.addFirst(11);
            myLinkedList.addLast(10);
            myLinkedList.addLast(13);
            myLinkedList.display();
            myLinkedList.removeAllKey(10);
            myLinkedList.display();
        }
    }

