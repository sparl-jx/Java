//抽象节点
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }


    }

    public class MyLinkedList {
        public Node head; //保存单链表的头节点的引用

        //打印单链表
        public void display() {
            Node cur=this.head;
            while(cur!=null) {
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }

        //头插法
        public  void addFirst(int data) {
            Node node=new Node(data);
            if(this.head==null) {
                //第一次插入节点
                this.head=node;
                return;
            }
            node.next=this.head;
            head=node;
        }

        //尾插法
        public  void addLast(int data) {
            Node node=new Node(data);
            if(this.head==null) {
                this.head=node;
                return;
            }
            Node cur=this.head;
            while(cur.next!=null) {
                cur = cur.next;
            }
            cur.next=node;
        }

        //查找链表中是否包含关键字key
        public boolean contains(int key) {
            Node cur=this.head;
            while(cur!=null) {
                if(cur.data==key) {
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }

        //求单链表的长度
        public int size() {
            int count=0;
            Node cur=this.head;
            while(cur!=null) {
                count++;
                cur=cur.next;
            }
            return count;
        }

        //任意位置插入，第一个数据节点为0号下标
        public void addIndex(int index,int data) {
            Node node =new Node(data);
            if(index==0) {    //相当于头插法
                addFirst(data);
                return;
            }
            if(index==this.size()) {   //相当于尾插法
                addLast(data);
                return;
            }
            //先找到index位置前一个节点的地址再进行插入
            Node cur=searchIndex(index);
            node.next=cur.next;
            cur.next=node;
        }

        private Node searchIndex(int index) {
            if(index<0 || index>this.size()) {
                throw new RuntimeException("index位置不合法");
            }
            Node cur=this.head;
            while(index-1!=0) {
                cur=cur.next;
                index--;
            }
            return cur;
        }

        private Node searchPrev(int key) {      //找前驱
            Node prev=this.head;
            while(prev.next!=null) {
                if(prev.next.data==key) {
                    return prev;
                } else {
                    prev=prev.next;
                }
            }
            return null;
        }


        //删除值为key的节点
        public void remove(int key) {
            if(this.head==null) {
                return;
            }
            if(this.head.data==key) {
                this.head=this.head.next;
                return;
            }
            Node prev=searchPrev(key);
            if(prev==null) {
                System.out.println("没有这个节点");
                return;
            }
            Node del=prev.next;
            prev.next=del.next;
        }

        //删除所有值为key的节点
        public void removeAllKey(int key) {
            Node prev=this.head;
            Node cur=this.head.next;//代表要删除的节点
            while(cur!=null) {
                if(cur.data==key) {
                    prev.next=cur.next;
                    cur=cur.next;
                } else {
                    prev=cur;
                    cur=cur.next;
                }
            }
            if(this.head.data==key) {
                this.head=this.head.next;
            }
        }
    }

