package _6;

import com.sun.deploy.panel.ITreeNode;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-21 21:35
 */
 class Student {
     String name;
     int age;
     int goal;
    public Student(String name, int age, int goal) {
        this.name = name;
        this.age = age;
        this.goal = goal;
    }
    public void Hig(){
        this.goal= (int) ((int) this.goal*1.2);
        if (this.goal>600){
            this.goal=600;
        }
        System.out.println(this.name+" "+(this.age+1)+" "+this.goal);
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        Student[] students=new Student[n];
        for (int i=0;i<students.length;i++){
            String name=reader.next();
            int age=reader.nextInt();
            int goal=reader.nextInt();
            students[i]=new Student(name,age,goal);
        }
        for (int i=0;i<students.length;i++){
            students[i].Hig();
        }
    }
}
