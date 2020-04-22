import java.util.Arrays;

public class MyArrayList {
    public int[] elem;     //数组
    public int usedSize;   //有效的数据个数
    public static final int intCapacity=10; //初识容量

    public MyArrayList() {
        this.elem=new int[intCapacity];
        this.usedSize=0;
    }

    private boolean isFull() {
        if(this.usedSize==this.elem.length) {
            return true;
        }
        return false;            //这段可以优化为return this.usedSize==this.elem.length;
    }

    private void checkPos(int pos) {
        if(pos<0 || pos>this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
    //在pos位置新增元素
    public void add(int pos,int data) {
        checkPos(pos);
        //扩容
        if(isFull()) {
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
            for (int i = this.usedSize-1; i >=pos ; i--) {
                this.elem[i+1]=this.elem[i];
            }
            this.elem[pos]=data;
            this.usedSize++;
    }

    //打印顺序表
    public void display () {
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素的位置
    public int search(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty() {
        return this.usedSize==0;
    }
    //获取pos位置的元素
    public int getPos(int pos) {
        //是否为空
        if(isEmpty()) {
            throw new RuntimeException("顺序表为空");  //手动抛出异常
        }
        checkPos(pos);
            return this.elem[pos];
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //删除给定的关键词key
    public void remove(int toRemove) {
        int index=search(toRemove);
        if(index==1) {
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i <usedSize-1 ; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }

}
