package Inheritance;

class Person{
    void displayName(){
        System.out.println("Tushar");
    }
}
class Student extends Person{
    void displayClass(){
        System.out.println("4th Sem");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Discipline");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Monitor obj = new Monitor();
        obj.displayName();
        obj.displayClass();
        obj.checkDiscipline();
    }
}
