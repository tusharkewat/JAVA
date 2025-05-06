package Methode_Overriding;

class Animal{
    void Sound(){
        System.out.println("Animal makes sound.");
    }
}
class Dog extends Animal{
    void Sound(){
        super.Sound();
        System.out.println("Barkkk.");
    }
}

public class Animal_Sound {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.Sound();
    }
}
