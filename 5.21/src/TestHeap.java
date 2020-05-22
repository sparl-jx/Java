import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem=new int[10];
    }

    //root每棵子树开始位置
    //len 每棵子树结束位置
    public void adjustDown(int root,int len) {
        int parent=root;
        int child=2*parent+1;
        while(child<len) {
            if(child+1<len && this.elem[child]<this.elem[child+1]) {
                child++;
            }
            //到这里c表示最大值下标
            if(this.elem[child]>this.elem[parent]) {
                int tmp=this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=tmp;
                parent=child;
                child=2*parent+1;
            } else {
                break;
            }
        }
    }

    public void createHeap(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            this.elem[i]=array[i];
            this.usedSize++;
        }
        //i每棵子树的根节点下标
        for (int i = (this.usedSize-1-1)/2; i >=0 ; i--) {
         adjustDown(i,this.usedSize);
        }
    }

    public void show() {
        for (int i = 0; i <this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //插入
    public void push(int val) {
        if(isFull()) {
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }

    public void adjustUp(int child) {
        int parent=(child-1)/2;
        while(child>0) {
            if(this.elem[child]>this.elem[parent]) {
                int tmp=this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=tmp;
                child=parent;
                parent=(child-1)/2;
            } else {
                break;
            }
        }
    }
    public  boolean isFull() {
        return this.usedSize==this.elem.length;
    }

    public void pop() {
        if(isEmpty()) {
            return;
        }
        int tmp=this.elem[0];
        this.elem[0]=this.elem[this.usedSize-1];
        this.elem[this.usedSize-1]=tmp;
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }
    public boolean isEmpty() {
        return this.usedSize==0;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }
}
