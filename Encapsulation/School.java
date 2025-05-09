package Encapsulation;

class Student{
    private String name;
    private int marks;
    void setValues(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    void details(){
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }
}

public class School {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setValues("Tushar", 90);
        obj.details();
    }
}
