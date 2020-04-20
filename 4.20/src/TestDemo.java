import java.util.Arrays;

public class TestDemo {
    public static void func(int[] array1,int[] array2) {
        for(int i=0;i<array1.length;i++) {
            int tmp=array1[i];
            array1[i]=array2[i];
            array2[i]=tmp;
        }
    }

    public static void main(String[] args) {
        int[] array1={1,2,3};
        int[] array2={4,5,6};
        func(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}



