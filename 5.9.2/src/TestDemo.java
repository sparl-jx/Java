import java.util.Scanner;

public class TestDemo {

        public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
        }
        public static void main(String[] args){
            System.out.println(isAdmin("Admin"));
        }


    public static void main2(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("abcd");
        stringBuilder.append("efg");
        System.out.println(stringBuilder);
    }


    public static String reverse(String str,int begin,int end) {
        char[] val = str.toCharArray();
        while (begin < end) {
            char tmp = val[begin];
            val[begin] = val[end];
            val[end] = tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(val);
    }

    public static String func(String str,int n) {
        str=reverse(str,0,n-1);
        str=reverse(str,n,str.length()-1);
        str=reverse(str,0,str.length()-1);
        return str;
    }
    public static void main1(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        String str=scan.next();
        String ret=func(str,n);
        System.out.println(ret);
    }
}
