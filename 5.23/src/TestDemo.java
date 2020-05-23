import java.util.Arrays;

public class TestDemo {

    public static void insertSort(int[] array) {
        int tmp=0;
        for (int i = 1; i < array.length ; i++) {
            tmp=array[i];
            int j;
            for ( j = i-1; j >-1; j--) {
                if(array[j]>tmp) {
                    array[j+1]=array[j];
                } else {
                    /* array[j+1]=tmp;*/
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    public static void shell(int[] array,int gap) {
        int tmp=0;
        for (int i = gap; i < array.length ; i++) {
            tmp=array[i];
            int j;
            for ( j = i-gap; j >-1; j-=gap) {
                if(array[j]>tmp) {
                    array[j+gap]=array[j];
                } else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    public static void shellSort(int[] array) {
        int[] drr={5,3,1};
        for (int i = 0; i <drr.length ; i++) {
            shell(array,drr[i]);
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[i]) {
                    int tmp=array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int[] array={10,5,8,4,1,9};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }


}
