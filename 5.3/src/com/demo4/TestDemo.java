package com.demo4;

import javax.swing.plaf.synth.SynthUI;
import java.util.Arrays;

class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age>o.age) {
            return 1;
        } else if(this.age==o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student student1=new Student("bit",18,79);
        Student student2=new Student("lx",21,100);
        Student student3=new Student("ss",17,99);
        if(student1.compareTo(student2)<0) {
            System.out.println("student1<student2");
        }
        /*Student[] students=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));*/

    }

    public static void main1(String[] args) {
        int[] array={12,4,89,43,56};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
