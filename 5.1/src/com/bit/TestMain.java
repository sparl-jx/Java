package com.bit;
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

class Cat extends Animal {
    public Cat(String name) {
        super(name);   //首先帮助父类构造
        System.out.println("Cat(String)");
    }
}
class Bird extends Animal {
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
public class TestMain {
    public static void main(String[] args) {
        Animal animal=new Bird("bage");
        animal.eat();
        //向下转型
        Bird bird=(Bird)animal;
        bird.fly();
    }


    public static Animal func() {
        return new Cat("mimi");
    }
    public static void main4(String[] args) {
        Animal animal=func();
        animal.eat();
    }

    public static void func(Animal animal) {
        animal.eat();
    }

    public static void main3(String[] args) {
        Cat cat=new Cat("mimi");
        func(cat);
    }

    public static void main2(String[] args) {
        //向上转型
        Animal animal =new Cat("mimi");
        animal.eat();
    }

    public static void main1(String[] args) {
        Animal animal=new Animal("dd");
        Cat cat=new Cat("mimi");
    }
}
