package com.bit.demo1;

class Animal {
    public String name;
    public void eat() {
        System.out.println(this.name+"Animal::eat()");
    }
    public void sleep() {
        System.out.println("Animal::sleep()");
    }
}

class Cat extends Animal {
/*    public String name;
    public void eat() {
        System.out.println("Cat::eat（）");
    }*/
}

class cat {
    public String name;
    public void eat() {
        System.out.println(this.name+"Cat::eat（）");
    }
}
class Bird {
    public void eat() {
        System.out.println("Bird::eat（）");
    }
    public void fly() {
        System.out.println("Bird::fly()");
    }
        }


public class TestDemo {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="mimi";
        cat.eat();
    }
}
