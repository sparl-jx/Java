import java.util.Arrays;

public class TestDemo {

   public static void bubbleSort(int[] array) {
       boolean flg=false;
       for (int i = 0; i <array.length-1; i++) {
           flg=false;
           for (int j = 0; j <array.length-1-1 ; j++) {
               if(array[j]>array[j+1]) {
                   int tmp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=tmp;
                   flg=true;
               }
           }
           if(!flg) {
               return;
           }
       }
   }



    public static void main(String[] args) {
        int[] array={54,76,54,36,8,5,7,9};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
