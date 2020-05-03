package com.demo3;

class Animal {
    protected String name;
    public Animal(String name) {
        this.name=name;
    }
}

interface Iflying {
    void fly();
}
interface  IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}

public class TestMoreExtends {
    public static void main(String[] args) {
        IRunning iRunning=new Cat("mimi");
    }
}
