package com.demo1;

class Shape {
    public void draw() {

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}

public class TestDemo2 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new React();
        Shape shape3=new Triangle();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
}
