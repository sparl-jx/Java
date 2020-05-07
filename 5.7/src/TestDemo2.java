import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestDemo2 {
    public static void main(String[] args) {
        String str1="abababab";
        String ret=str1.substring(1);
        System.out.println(ret);
        ret=str1.substring(1,4);
        System.out.println(ret);

        String str2="   ab abbh    ";
        String ret1=str2.trim();
        System.out.println(ret1);


/*        String ret=str1.replaceFirst("ab","pp");
        System.out.println(ret);*/
    }

    public static void main4(String[] args) {
        String str1="ABCDef";
        String str2="abcdef";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String str3="abc";
        String str4="abcdef";
        System.out.println(str3.compareTo(str4));
    }

    public static void main3(String[] args) throws UnsupportedEncodingException {
        byte[] bytes={99,98,97,96};
        String str=new String(bytes);
        System.out.println(str);
        String str2="abcdef";
        byte[] bytes1=str2.getBytes("utf-8");
        System.out.println(Arrays.toString(bytes1));
    }

    public  static  boolean func(String str) {
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch<'0' || ch>'9'); {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str="123456";
        boolean flg=func(str);
        System.out.println(flg);
    }

    public static void main1(String[] args) {
        char[] val={'a','b','c','d','e'};
        String str=new String(val,1,3);
        System.out.println(str);

        String str2="hello";
        char ch=str2.charAt(1);
        System.out.println(ch);

        char[] val2=str2.toCharArray();
        System.out.println(Arrays.toString(val2));
    }
}
