
import java.io.FileNotFoundException;
import java.util.Scanner;

class MyException extends RuntimeException {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}
public class TestDemo {
   public static void func(int x) {
       if(x==10) {
           throw new MyException("x==0");
       }
   }
    public static void main(String[] args) {
     try {
         func(10);
     } catch (MyException e) {
         e.printStackTrace();
     }
    }



    public static int divide(int x,int y) throws ArithmeticException {
        if(y==0) {
            throw new ArithmeticException("y==0");
        }
        return x/y;
    }
    public static void main4(String[] args) {
       try {
           int ret=divide(20,0);
           System.out.println(ret);
       } catch(ArithmeticException e) {
           e.printStackTrace();
           System.out.println("hhh");
       }
        System.out.println("继续执行");
    }

    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int n=scanner.nextInt();
            System.out.println(10/n);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static int func1() {
        int []array={1,2,3};
        try {
            System.out.println(array[4]);
           /* return 1;*/
        } catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("空指针异常");
            return 3;
        } finally {
            return 2;
        }
    }
    public static void main2(String[] args) {
        System.out.println(func1());
    }

    public static void main1(String[] args) {
       int[] array={1,2,3};
       try {
           System.out.println(array[4]);
       } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
           System.out.println("捕获到数组越界异常");
       } catch (NullPointerException e) {
           e.printStackTrace();
           System.out.println("捕获到空指针异常");
       } finally {
            System.out.println("finally块的代码肯定会被执行");
        }
           System.out.println("hello");
       }
    }

