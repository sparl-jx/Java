import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();   //默认容量10  超出后1.5倍扩容
        //新增
        list.add("hello");
        list.add(1,"abc");  //某位置新增
        System.out.println(list);

        List<String> list1=new ArrayList<>();
        list.add("java");
        list.add("bit");
        list.addAll(list1);
        System.out.println(list);

        //删除
        String ret=list.remove(0);
        System.out.println(ret);

        list.remove("bit");
        System.out.println(list);

        //查找
        ret=list.get(0);
        System.out.println(ret);

        //设置值
        list.set(0,"hh");   //更新
        System.out.println(list);

        //是否包含
        System.out.println(list.contains("hhh"));

        //返回下标
        System.out.println(list.indexOf("java"));
        list.add("hh");
        System.out.println(list);
        System.out.println(list.lastIndexOf("hh"));
        System.out.println("========sub========");
        List<String> retList=list.subList(0,2);  //左闭右开
        System.out.println(retList);

        retList.set(0,"lx");
        System.out.println(retList);

        System.out.println(list);    //list也被修改了

        System.out.println("==============");
        list.clear();
        System.out.println(list);
    }
}
