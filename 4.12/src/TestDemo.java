import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while(n!=0) {
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}




import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=31;i>=1;i-=2) {
            System.out.println(((n>>i)&1)+" ");
        }
        System.out.println();
        for(int i=30;i>=0;i-=2) {
            System.out.println(((n>>i)&1)+" ");
        }
    }
}






public class TestDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(sumInt(a,b));
    }
    public static int sumInt(int a,int b) {
        return a+b;
    }
}

