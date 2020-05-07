import java.lang.reflect.Field;
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException{
       String str="Hello";
       //反射
        Class cl=String.class;
        Field field =cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val=(char[])field.get(str);
        val[0]='g';
        System.out.println(str);
    }

    public static void main10(String[] args) {
        String str="hello";
        str=str+"world";
        str+="!!!";
        System.out.println(str);
    }

    public static void main9(String[] args) {
        String str1="hello";
        String str2=new String("hello").intern();
        System.out.println(str1==str2);
    }

    public static void main8(String[] args) {
        String str1=null;
        String str2=new String("hello");
        /*System.out.println(str1.equals(str2));*/
        System.out.println(str2.equals(str1));
    }

    public static void main7(String[] args) {
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }

    public static void main6(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3="hello";
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }

    public static void func(String str,char[] array) {
        str="abc";
        array[0]='g';
    }
    public static void main5(String[] args) {
        String str1="hello";
        char[] val={'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
    }

    public static void main4(String[] args) {
        String str1="hello";
        String str2=str1;
        System.out.println(str1);
        System.out.println(str2);
        str1="abc";
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main3(String[] args) {
        String str1="hello";
        String str2="hel"+"lo";
        System.out.println(str1==str2);
        String str3=new String("hel")+"lo";
        System.out.println(str3==str1);
    }

    public static void main2(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        System.out.println(str1==str2);
        String str3="hello";
        System.out.println(str1==str3);
    }

    public static void main1(String[] args) {
        String str="hello";
        System.out.println(str);

        String str2=new String("abc");
        System.out.println(str2);

        char[] val={'a','b','c'};
        String str3=new String(val);
        System.out.println(str3);
    }
}
