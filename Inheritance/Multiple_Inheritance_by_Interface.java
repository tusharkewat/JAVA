package Inheritance;

interface Client1 {
    void show();
}

interface Client2 {
    void print();
}

class Dev implements Client1, Client2 {
    public void show() {
        System.err.println("Showing Client1 details");
    }

    public void print() {
        System.err.println("Printing Client2 details");
    }
}

public class Multiple_Inheritance_by_Interface {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.show();
        obj.print();
    }
}
