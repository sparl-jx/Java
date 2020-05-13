import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student {
    public String name;
    public String classes;
    public double score;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }
}
public class TestMain {
    public static List<Character> func(String str1,String str2) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);
            if(str2.contains(ch+"")); {
                list.add(ch);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str="welcome to bit";
        String str2="come";
        List<Character> ret =func(str,str2);
        for (char ch:ret) {
            System.out.print(ch);
        }
        System.out.println();
    }


    public static void main2(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }


    public static void main1(String[] args) {
        Student student=new Student("张三","火箭",15);
        Student student2=new Student("李四","火箭",20);
        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student2);
        System.out.println(list);
    }
}

