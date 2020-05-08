public class TestDemo {
    public static String reverse(String str,int begin,int end) {
        char[] value=str.toCharArray();
        while(begin<end) {
            char tmp=value[begin];
            value[begin]=value[end];
            value[end]=tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(value);
    }
    public static void main(String[] args) {
        String str="abcdefg";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);
    }

    public static void main3(String[] args) {
        String str="zbadefAd";
        String ret=str.toUpperCase();
        System.out.println(ret);
        int []array={1,2,3,4,5};
        System.out.println(array.length);
    }

    public static void main2(String[] args) {
        String str="abc de f";
        String[] strings=str.split("");
        for (String s:strings) {
            System.out.println(s);
        }
    }

    public static void main1(String[] args) {
        String str="abcababc";
        int index=str.indexOf("abc",3);
        System.out.println(index);
        boolean flg=str.startsWith("ab");
        System.out.println(flg);
        boolean flg2=str.endsWith("de");
        System.out.println(flg2);
    }
}
