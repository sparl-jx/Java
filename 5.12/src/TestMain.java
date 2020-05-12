
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList=new MyArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        int val=(int)myArrayList.getVal(1);
        System.out.println(val);
    }

    public static void main5(String[] args) {
        Integer a=200;
        Integer b=200;
        System.out.println(a==b);
    }

    public static void main4(String[] args) {
        Integer a=10;
        int b=a;
    }

    public static void main3(String[] args) {
        int i=0;
        Integer ii=Integer.valueOf(i);
        Integer ij=new Integer(i);

        int j=ii.intValue();
        double d=ii.doubleValue();
    }

    public static void main2(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("女","lx");
        map.put("男","jx");
        map.put("及时雨","宋江");

        System.out.println(map);
        String s=map.getOrDefault("及时雨2","bit");
        System.out.println(s);
        System.out.println(map.containsKey("女"));
        System.out.println(map.containsValue("lx"));

        Set< Map.Entry<String,String> > set=map.entrySet();
        for (Map.Entry<String,String> entry:set) {
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }

    public static void main1(String[] args) {
        Collection<String> collection=new ArrayList<>();
      /*  Collection collection1=new LinkedList();*/
        collection.add("bit");
        collection.add("java");
        collection.add("jx");
        collection.add("y");
        System.out.println(collection);
        for (String s:collection) {
            System.out.println(s);
        }
        /*collection.clear();
        System.out.println(collection);*/
        System.out.println(collection.isEmpty());
        collection.remove("bit");
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] objects=collection.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
