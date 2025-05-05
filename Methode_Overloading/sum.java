package Methode_Overloading;

class Overload{
    void sum(){
        System.out.println("Printiing Sum.");
    }
    void sum(int a,int b){
        System.out.println("Sum of " + a + " and " + b +" is " + (a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("Sum of " + a +" , "+ b + " and " + c+" is " + (a+b+c));
    }
    void sum(double a,double b){
        System.out.println("Sum of " + a + " and " + b +" is " + (a+b));
    }
}

public class sum {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.sum();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
        obj.sum(10.10,20.20);
    }
}
