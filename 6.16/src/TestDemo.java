import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i]=scan.nextInt();
        }
        scan.close();

        for (int i = 1; i <array.length ; i++) {
            if(array[i]!=0) {
                System.out.println(i);
                array[i]--;
                break;
            }
        }

        for(int i=0;i<array.length;i++) {
            while(array[i]>0) {
                System.out.println(i);
                array[i]--;
            }
        }
        System.out.println();
    }
}
