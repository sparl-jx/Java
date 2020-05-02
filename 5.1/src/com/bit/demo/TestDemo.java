package com.bit.demo;

class Animal {
    protected String name;
    public Animal(String name) {
        this.name=name;
        System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println(this.name+"Animal::eat()");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);   //首先帮助父类构造
        System.out.println("Cat(String)");
    }
   /* public String name;
    public void eat() {
        System.out.println(this.name+"Cat::eat()");
    }*/
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public String name;
    public void eat() {
        System.out.println("Bird::eat()");
    }
    public void fly() {
        System.out.println(this.name+"Bird::fly()");
    }
}


public class TestDemo {
    public static void main(String[] args) {
        Cat cat=new Cat("mimi");
        cat.eat();
        Bird bird=new Bird("bage");
        bird.fly();
        bird.eat();
    }
}
