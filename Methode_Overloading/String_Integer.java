package Methode_Overloading;

class Input{
    void print(String a){
        System.out.println(a);
    }
    void print(String a, int b){
        System.out.println(a + b);
    }
}

public class String_Integer {
    public static void main(String[] args) {
        Input obj = new Input();
        obj.print("Hello!");
        obj.print("The number is ", 14);
    }
}
