package Methode_Overloading;

class Area {
    void Shape(double a) {
        System.out.println("Area of Circle is " + (3.14 * a * a));
    }

    void Shape(int a, int b) {
        System.out.println("Area of Rectangle is " + a * b);
    }
}

public class Area_of_Shape {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.Shape(10);
        obj.Shape(10, 10);
    }
}
