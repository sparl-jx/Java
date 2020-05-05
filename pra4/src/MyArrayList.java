import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity=10;

    public MyArrayList() {
        this.elem=new int[intCapacity];
        this.usedSize=0;
    }

    private boolean isFull() {
        if(this.usedSize==this.elem.length) {
            return true;
        }
        return false;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }

        public void add(int pos,int data) {
            checkPos(pos);
            if(isFull()) {
                this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
            }
                for (int i = this.usedSize-1; i >=pos ; i--) {
                    this.elem[i+1]=this.elem[i];
                }
                this.elem[pos]=data;
                this.usedSize++;
            }


        public void display() {
            for (int i = 0; i < this.usedSize; i++) {
                System.out.print(this.elem[i]+" ");
            }
            System.out.println();
        }

        public boolean contains(int toFind) {
            for (int i = 0; i <this.usedSize ; i++) {
                if(this.elem[i]==toFind) {
                    return true;
                }
            }
            return false;
        }

        public int search(int toFind) {
            for (int i = 0; i < this.usedSize; i++) {
                if(this.elem[i]==toFind) {
                    return i;
                }
            }
            return -1;
        }


        private boolean isEmpty() {
        return this.usedSize==0;
        }
        public int getPos(int pos) {
        if(isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        return this.elem[pos];
    }

    public int size() {
        return this.usedSize;
    }

    public void remove(int del) {
        int index=search(del);
        if(index==-1) {
            System.out.println("没有要删除的数字");
            return;
        }
        for (int i = index; i <this.usedSize-1 ; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
}
