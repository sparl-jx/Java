class Person {
    private String name;
    private int age;
    private static int count;

    //构造方法
    public Person() {
        System.out.println("Person<init>");
    }
    public Person(String name,int age) {
        this.name=name;
        this.age=age;
        System.out.println("Person<String,int>");
    }

    {
        this.name="lx";
        count=99;
        System.out.println("实例代码块");
    }
    static {
        System.out.println("静态代码块");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person("bit",19);
        System.out.println(person1);
        System.out.println(person2);
    }
}
