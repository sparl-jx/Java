public class MyArrayList <T> {
    public T[] elem;
    public  int usedSize;

    public MyArrayList() {
        this.elem=(T[])new Object[10];
        this.usedSize=0;
    }
    public void add(T val) {
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }
    public T getVal(int pos) {
        return this.elem[pos];
    }


}
