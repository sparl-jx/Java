package com.demo2;

import sun.security.provider.SHA;

//抽象类
abstract class Shape {
    public abstract void draw();
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
    abstract class Triangle extends Shape {

}
public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new React();
        drawMap(shape1);
        drawMap(shape2);
    }
}
