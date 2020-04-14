//汉诺塔问题
public class TestDemo {
    public static void move(char pos1,char pos2) {
        System.out.println(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if(n==1) {
            move(pos1,pos3);
        } else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
}



import java.util.Scanner;

//青蛙跳台阶
public class TestDemo {
    public static int JumpFloor(int t) {
        if(t==1) {
            return 1;
        } else if(t==2) {
            return 2;
        } else {
            return JumpFloor(t-1)+JumpFloor(t-2);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ret=JumpFloor(n);
        System.out.println(ret);
    }
}



public class TestDemo {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int len= array.length;
        System.out.println(len);

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        for (int val:array) {
            System.out.println(val+" ");
        }
    }
}



//交换数组内容
public class TestDemo {
    public static void swap(int[] array) {
        int tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main(String[] args) {
        int[] array2={10,20};
        System.out.println(array2[0]+" "+array2[1]);
        swap(array2);
        System.out.println(array2[0]+" "+array2[1]);
    }
}



import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
    }
}



import java.util.Arrays;

public class TestDemo {
    public static int[] transform(int[] array) {
        int[] tmp=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            tmp[i]=array[i]*2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] array={1,2,3};
        int[] ret=transform(array);
        System.out.println(Arrays.toString(ret));
    }
}



import java.util.Arrays;

public class TestDemo {
    public static void printArray(int array[]) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
    }
}


import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr=new int[100];
        int i;
        for(i=0;i<arr.length;i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}

