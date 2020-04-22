/*
//编写一个类，两个属性num1，num2，不在定义的同时初始化，实现加减乘除
class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1+this.num2;
    }
    public int sub() {
        return this.num1-this.num2;
    }
    public int mul() {
        return this.num1*this.num2;
    }
    public double dev() {
        return this.num1*1.0/this.num2;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("加法值为"+calculator.add());
        System.out.println("减法值为"+calculator.sub());
        System.out.println("乘法值为"+calculator.mul());
        System.out.println("除法值为"+calculator.dev());
    }
}
*/



/*
//交换两个变量实参的值
class MyValue {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class TestDemo {
    public static void swap(MyValue myValue1,MyValue myValue2) {
        int tmp=myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(tmp);
    }
    public static void main(String[] args) {
        MyValue myValue1=new MyValue();
        myValue1.setVal(10);
        MyValue myValue2=new MyValue();
        myValue2.setVal(20);

        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        swap(myValue1,myValue2);
        System.out.println("交换后");
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }
}*/




public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1=new MyArrayList();
        for (int i = 0; i <10 ; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(5,500);
        myArrayList1.display();

        System.out.println(myArrayList1.contains(5));
        System.out.println(myArrayList1.search(5));
        System.out.println(myArrayList1.getPos(3));
        System.out.println(myArrayList1.size());
        myArrayList1.remove(500);
        myArrayList1.display();
    }

}