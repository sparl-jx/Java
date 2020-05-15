public class MyCircularQueue {
    public int[] elem;
    public int front;
    public int rear;
    public MyCircularQueue(int k) {
        this.elem = new int[k+1];
    }
    //入队
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        this.elem[this.rear]=value;
        this.rear=(this.rear+1)%(this.elem.length);
        return false;
    }

    //出队
    public boolean deQueue(int value) {
        if(isEmpty()) {
            return false;
        }
        this.front=(this.front+1)%this.elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[front];
    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        /*return this.elem[this.rear-1]; //这样数组可能会越界*/
        int index =(this.rear==0)?(this.elem.length-1):(this.rear-1);
        return this.elem[index];
    }

    public boolean isEmpty() {
        return this.rear==this.front;
    }

    public boolean isFull(){
        if((this.rear+1)%this.elem.length==this.front) {
            return true;
        } else {
            return false;
        }
    }
}
