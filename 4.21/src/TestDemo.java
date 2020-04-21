class Person {
    public String name="jx";
    public int age=21;
    public static int size;

    public void eat() {
        int a=10;
        System.out.println("eat()");
    }
    public void sleep() {
        System.out.println("sleep()");
    }
    public static void func1() {
        System.out.println("static::func1");
    }

    public void show() {
        System.out.println("我叫"+name+",今年"+age+"岁");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person per=new Person();
        System.out.println(per.name.length());
        System.out.println(per.age);
        System.out.println(Person.size);
        per.eat();
        per.sleep();
        Person.func1();
        per.show();
    }
}
