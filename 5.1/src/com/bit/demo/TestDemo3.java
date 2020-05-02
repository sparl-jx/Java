package com.bit.demo;

class Test{
    int a;  //默认权限→包访问权限
}
public class TestDemo3 {
    int b;
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.a);
    }
}
