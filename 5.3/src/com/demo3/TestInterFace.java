package com.demo3;
//接口

interface Shape{
    void draw();

/*    default void func() {
        System.out.println("xx");
    }*/
}

class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}

class React implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}

public class TestInterFace {
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
