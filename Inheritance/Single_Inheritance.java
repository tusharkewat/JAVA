package Inheritance;

class Employee{
    void work(){
        System.out.println("Doing work.");
    }
}

class Manager extends Employee{
    void attendMeeting(){
        System.out.println("Attend Meeting.");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.work();
        obj.attendMeeting();
    }
}
