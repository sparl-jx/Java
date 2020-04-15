import java.util.Scanner;

/*public class TestDemo {
    public static int sum(int n) {
        int tmp=0;
        if(n==1) {
            return 1;
        } else {
            return n*sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ret=sum(n);
        System.out.println(ret);
    }
}*/








public class TestDemo {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int tmp=1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i+1; j++) {
                tmp*=j
            }
        }
    }
}