import java.util.Scanner;

public class TestDemo {


    public static String reverse(String str,int begin,int end) {
        char[] val=str.toCharArray();
        while(begin<end) {
            char tmp=val[begin];
            val[begin]=val[end];
            val[end]=tmp;
            begin++;
            end--;
        }
        /*return new String(val);*/
        return String.copyValueOf(val);
    }
    public static void main8(String[] args) {
        String str="abcdefg";
        String ret=reverse(str,0,str,str.length()-1);
        System.out.println(ret);
    }


    public  static String func(String str) {
        String[] strings=str.split(" ");
        String ret=" ";
        for (String s:strings) {
            ret+=s;
        }
        return ret;
    }

    public static void main7(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ret=func(str);
        System.out.println(ret);
    }

    public static void main6(String[] args) {
        String str="name=zhangsan&age=18";
        String[] strings1=str.split("&");
        for (String s1:strings1) {
            String[] strings2=s1.split("=");
            for (String s2:strings2) {
                System.out.println(s2);

            }
        }
    }

    public static void main5(String[] args) {
        String str="Java-split#bit";
        String[] strings=str.split(" |-|#");
        for(String s:strings) {
            System.out.println(s);
        }
    }


    public static void main4(String[] args) {
        String str="192\\168\\1\\1";
        String[] strings=str.split("\\\\");
        for(String s:strings) {
            System.out.println(s);
        }
    }


    public static void main3(String[] args) {
        String str="abc de f";
        String[] strings=str.split(" ",2);
        for (String s:strings) {
            System.out.println(s);
        }
    }


    public static void main2(String[] args) {
        String str="abcabcabc";
        int index=str.indexOf("abc",3);
        System.out.println(index);

        index=str.lastIndexOf("abc",3);
        System.out.println(index);

        boolean flg=str.startsWith("abc",1);
        System.out.println(flg);
        flg=str.endsWith("abc");
        System.out.println(flg);
    }

    public static void main1(String[] args) {
        String str2="   ab abbh    ";
        String ret1=str2.trim();
        System.out.println(ret1);
    }
}
