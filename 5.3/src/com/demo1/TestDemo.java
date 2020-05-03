package com.demo1;

class Animal {
    public String name;
    public Animal(String name) {
        this.name=name;
    }
    public void eat() {
        System.out.println(this.name+"吃");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public String huzi;

    public void func() {
        System.out.println(this.name);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Animal animal=new Cat("mimi");
       /* Cat cat=new Cat("mimi");
        cat.eat();*/
    }
}
