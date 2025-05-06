package Methode_Overriding;

class Vehicle{
    void run(){
        System.out.println("In Vehicle class");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("In Bike class");
        super.run();
    }
}

public class Vehicle_Bike {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.run();
    }
}
