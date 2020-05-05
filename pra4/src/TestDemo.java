public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        for (int i = 0; i <10 ; i++) {
            myArrayList.add(i,i);
        }
        myArrayList.display();
        myArrayList.add(0,99);
        myArrayList.add(0,99);
        myArrayList.display();
        System.out.println(myArrayList.contains(77));
        System.out.println(myArrayList.search(0));
        System.out.println(myArrayList.getPos(0));
        System.out.println(myArrayList.size());
        myArrayList.remove(0);
        myArrayList.display();
    }
}