import java.util.Arrays;

public class TestDemo {

    public static void merge(int[] array,int low,int mid,int high) {
        int s1=low;
        int s2=mid+1;
        int len=high-low+1;
        int[] ret=new int[len];
        int i=0;
        while(s1<=mid && s2<=high) {
            if(array[s1]<=array[s2]) {
                ret[i++]=array[s1++];
            } else {
                ret[i++]=array[s2++];
            }
        }
        while(s1<=mid) {
            ret[i++]=array[s1++];
        }
        while(s2<=high) {
            ret[i++]=array[s2++];
        }
        for (int j = 0; j <ret.length ; j++) {
            array[j+low]=ret[j];
        }

    }
    public static void mergeSortInternal(int[] array,int low,int high) {
        if(low>=high) {
            return;
        }
        int mid=(low+high)>>>1;
        mergeSortInternal(array,low,high);
        mergeSortInternal(array,mid+1,high);

        merge(array,low,mid,high);
    }
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    //——————————————————————————————————————————————————————————————

    public static void adjustDown(int[] array, int root, int len) {
        int parent = root;
        int child = 2 * parent + 1;
        while (child < len) {
            if (child + 1 < len && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }


    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >=0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }
    public static void heapSort(int[] array) {
        createHeap(array);
        int end=array.length-1;
        while(end>0) {
            int tmp=array[0];
            array[0]=array[end];
            array[end]=tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

//————————————————————————————————————————————————————————————————

    public static void selectSort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <=array.length ; j++) {
                if(array[j]<array[i]) {
                    int tmp=array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
        }
    }

    //————————————————————————————————————————————————————————————

    public static void insertSort(int[] array) {
        int tmp=0;
        for (int i = 0; i < array.length ; i++) {
            tmp=array[i];
            int j;
            for (j = i-1; j >=0 ; j--) {
                if(array[j]>tmp) {
                    array[j+1]=array[j];
                } else {
                    // array[j+1]=tmp;
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

//——————————————————————————————————————————————————————————————

    public static void shell(int[] array,int gap) {
        int tmp=0;
        for (int i = gap; i < array.length; i++) {
            tmp=array[i];
            int j;
            for (j = i-gap; j >=0 ; j-=gap) {
                if(array[j]>tmp) {
                    array[j+gap]=array[j];
                } else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }
    public static void shellSort(int[] array) {
        int[] drr={5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    //————————————————————————————————————————————————————

    public static void bubbleSort(int[] array) {
        boolean flg=false;
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false) {
                return;
            }
        }
    }

//————————————————————————————————————————————————————————————————

    public static int partition(int[] array,int low,int high) {
        int tmp=array[low];
        while(low<high) {
            while(low<high && array[high]>=tmp) {
                high--;
            }
            array[low]=array[high];
            while(low<high && array[low]<=tmp) {
                low++;
            }
            array[high]=array[low];
        }
        array[low]=tmp;
        return low;
    }
    public static void quick(int[] array,int left,int right) {
        if(left>=right) {
            return;
        }
       /*  优化方法一，小于100个用直接插入排序
        if(right-left+1<=100) {
            insert_Sort(array,left,right);
            return
        } */
        int par=partition(array,left,right);
        quick(array, left, par-1);
        quick(array,par+1,right);
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

//——————————————————————————————————————————————————————————



    public static void main(String[] args) {
        int[] array={10,5,8,4,1,9,76,43,90,0,52,6};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
