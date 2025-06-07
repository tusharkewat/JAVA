package Comparator_Implemetation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollNo ;
    String name;
    int age;

    Student(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return rollNo+" " +name+" "+age;
    }
}
class sortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class sortByRollNo implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.rollNo-s2.rollNo;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(31, "Tushar", 20));
        list.add(new Student(14, "Beta", 19));
        list.add(new Student(10, "Lokesh", 30));
        list.add(new Student(3, "Anurag", 20));

        // Collections.sort(list,new sortByName());
        // for(Student s:list){
        //     System.out.println(s);
        // }
        Collections.sort(list,new sortByRollNo());
        for(Student s1:list){
            System.out.println(s1);
        }
    }
}
