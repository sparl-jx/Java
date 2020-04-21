class Student {
    private String MyName;
    private int age;

    //提供一个公开接口
    public String getMyName() {
        return this.MyName;
    }
    public void setMyName(String MyName) {
        this.MyName=MyName;
    }

  /*  public void show() {
        System.out.println("我叫"+this.MyName+",今年"+this.age+"岁");
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setMyName("jx");
        System.out.println(student.getMyName());
        System.out.println(student);
    }
}
