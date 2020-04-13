import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
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
        int n=scan.nextInt();
        for(int i=31;i>=1;i-=2) {
            System.out.println(((n>>i)&1)+" ");
        }
        System.out.println();
        for(int i=30;i>=0;i-=2) {
            System.out.println(((n>>i)&1)+" ");
        }
    }
}




import java.util.Scanner;

public class TestDemo {
    public static int maxNum(int num1,int num2) {
        return num1>num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        maxNum(n1,n2);
        int ret=maxNum(n1,n2);
        System.out.println(ret);
    }
}




import java.util.Scanner;

public class TestDemo {
    public static int maxNum(int num1,int num2) {
        return num1>num2 ? num1 : num2;
    }
    public static int maxThreeNum(int a,int b,int c) {
        return maxNum(maxNum(a,b),c);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println(maxThreeNum(a,b,c));
    }
}




public class TestDemo {
    public static int fac(int n) {
        if(n==1) {
            return 1;
        }
        int tmp=n*fac(n-1);
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}