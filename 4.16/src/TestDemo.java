import java.util.Arrays;
//拷贝数组
public class TestDemo {
    public static int[] copyOf(int[] array) {
        int[]ret=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            ret[i]=array[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int[]ret=copyOf(array);
        System.out.println(Arrays.toString(ret));
    }
}



//找数组中最大值
public class TestDemo {
    public static int findMax(int[]array) {
        int max=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max)
               max=array[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[]array={12,2,18,24,76,13};
        System.out.println(findMax(array));
    }
}



//二分查找
public class TestDemo {
    public static int binarySearch(int[]array,int key) {
        int left=0;
        int right=array.length-1;
        while(left<=right) {
            int mid=(left+right)>>>1;
            if(array[mid]<key) {
                left=mid+1;
            } else if(array[mid]==key) {
                return mid;
            } else {
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1,3,5,7,9,11};
        int num=binarySearch(array,9);
        System.out.println("要找的数下标是"+num);
    }
}


import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(array,2,5,5));
    }
}



//填充
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[]array=new int[10];
        Arrays.fill(array,2,4,8);
        System.out.println(Arrays.toString(array));
    }
}


//排序
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array={1,23,56,37,95,7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}


//判断升序
public class TestDemo {
    public static boolean isUp(int[] array) {
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,7,5,9};
        boolean ret=isUp(array);
        System.out.println(ret);
    }
}



//冒泡排序
import java.util.Arrays;

public class TestDemo {
    public static void bubbleSort(int[] array) {
        boolean flg=false;
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={1,35,72,6,8,10};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}




